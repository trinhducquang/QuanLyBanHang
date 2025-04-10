package org.example.quanlybanhang.utils;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class MoneyUtils {

    private static final Locale LOCALE_VN = new Locale("vi", "VN");
    private static final NumberFormat FORMATTER = NumberFormat.getCurrencyInstance(LOCALE_VN);

    // Format BigDecimal sang chuỗi định dạng tiền tệ VN (ví dụ: "1.000 ₫")
    public static String formatVN(BigDecimal amount) {
        if (amount == null) return "";
        return FORMATTER.format(amount);
    }

    // Parse chuỗi tiền tệ về BigDecimal (ví dụ: "1.000 ₫" => BigDecimal 1000)
    public static BigDecimal parseCurrencyText(String text) {
        if (text == null || text.trim().isEmpty()) return BigDecimal.ZERO;

        String cleaned = text.replace(".", "").trim();

        try {
            return new BigDecimal(cleaned);
        } catch (NumberFormatException e) {
            return BigDecimal.ZERO;
        }
    }



}
