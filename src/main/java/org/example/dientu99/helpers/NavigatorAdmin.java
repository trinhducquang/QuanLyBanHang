package org.example.dientu99.helpers;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import java.io.IOException;

public class NavigatorAdmin {

    public static void navigate(Pane mainContentPane, String fxmlFile) {
        try {
            FXMLLoader loader = new FXMLLoader(NavigatorAdmin.class.getResource("/org/example/dientu99/views/" + fxmlFile));
            Pane newPane = loader.load();
            mainContentPane.getChildren().setAll(newPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
