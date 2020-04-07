package ch.fhnw.oop2.module08.ab2;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class ApplicationUI extends VBox {
    private PresentationModel pm;

    private Button button;

    public ApplicationUI(PresentationModel pm) {
        this.pm = pm;

        initializeControls();
        layoutControls();
        setupBindings();
    }

    public void initializeControls() {
        button = new Button(pm.getButtonText());
        button.setOnAction(actionEvent -> pm.toggle());
    }

    public void layoutControls() {
        setAlignment(Pos.CENTER);
        setPadding(new Insets(150));

        getChildren().add(button);
    }

    public void setupBindings(){
        button.textProperty().bind(pm.buttonTextProperty());
    }
}
