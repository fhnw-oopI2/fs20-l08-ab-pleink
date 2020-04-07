package ch.fhnw.oop2.module08.ab2;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class PresentationModel {

    private StringProperty applicationTitle = new SimpleStringProperty("Toggle Application");
    private StringProperty buttonText = new SimpleStringProperty();
    private Switch buttonState = Switch.OFF;

    public PresentationModel() {
        buttonText.set(buttonState.name());
    }

    public String getApplicationTitle() {
        return applicationTitle.get();
    }

    public StringProperty applicationTitleProperty() {
        return applicationTitle;
    }

    public String getButtonText() {
        return buttonText.get();
    }

    public StringProperty buttonTextProperty() {
        return buttonText;
    }

    public void toggle(){

        if (buttonState == Switch.OFF){
        buttonState = Switch.ON;
        } else {
            buttonState = Switch.OFF;
        }
        buttonText.set(buttonState.name());
    }
}
