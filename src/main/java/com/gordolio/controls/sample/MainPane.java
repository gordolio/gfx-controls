package com.gordolio.controls.sample;

import com.gordolio.controls.TagControl;
import javafx.geometry.Insets;
import javafx.scene.layout.Pane;

public class MainPane extends Pane {

    private TagControl tagControl;

    public MainPane() {
        this.tagControl = new TagControl();
        this.tagControl.setText("Hello World");

        this.getChildren().add(this.tagControl);

        this.setPadding(new Insets(30, 30, 30, 30));

    }

}
