package org.example.quanlybanhang.service;

import javafx.collections.ObservableList;
import org.example.quanlybanhang.dto.productDTO.CartItem;

import java.math.BigDecimal;

public class CartService {

    public BigDecimal calculateCartTotal(ObservableList<CartItem> cartItems) {
        BigDecimal total = BigDecimal.ZERO;
        for (CartItem item : cartItems) {
            total = total.add(item.getProduct().getPrice().multiply(item.getQuantity()));
        }
        return total;
    }
}