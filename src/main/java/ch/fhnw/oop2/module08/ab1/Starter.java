package ch.fhnw.oop2.module08.ab1;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Starter extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        PresentationModel pm = new PresentationModel();
        Parent rootPanel = new ApplicationUI(pm);
        Scene scene = new Scene(rootPanel);

        stage.setTitle(pm.getApplicationTitle());
        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
