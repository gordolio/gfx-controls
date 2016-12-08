package com.gordolio.controls;

import javafx.beans.property.StringProperty;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class TagControl extends Pane {

    private static final String TIMES_CIRCLE = "\uf00d";

    private static final Font FONT_AWESOME = Font.loadFont(TagControl.class.getClassLoader().getResource("font/fontawesome-webfont.ttf").toExternalForm(), 11);
    private static final String BLUE_TAG_STYLE = "-fx-border-radius: 20 20 20 20; -fx-background-radius: 20 20 20 20;-fx-background-color: #d9edf7;-fx-border-color: #bce8f1; -fx-padding:3 7 3 7;";
    private static final Color TEXT_FILL = new Color(0.1914, 0.4375, 0.5585, 1);

    private Label text;

    public TagControl() {
        this.text = new Label();
        this.text.setFont(Font.font(11));
        this.text.setTextFill(TEXT_FILL);
        Label timesSymbol = new Label();
        timesSymbol.setFont(FONT_AWESOME);
        timesSymbol.setText(TIMES_CIRCLE);
        timesSymbol.setTextFill(TEXT_FILL);

        HBox hBox = new HBox();
        hBox.getChildren().addAll(this.text, timesSymbol);
        hBox.setStyle(BLUE_TAG_STYLE);

        HBox.setHgrow(this.text, Priority.NEVER);
        HBox.setHgrow(timesSymbol, Priority.NEVER);
        HBox.setMargin(timesSymbol, new Insets(0, 0, 0, 7));
        hBox.setPadding(new Insets(2,7,2,7));

        this.getChildren().add(hBox);
    }

    public StringProperty textProperty() {return this.text.textProperty();}
    public void setText(String text) {this.text.setText(text);}
    public String getText() {return this.text.getText();}
}
