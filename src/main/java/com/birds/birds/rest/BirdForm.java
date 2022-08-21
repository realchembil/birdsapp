package com.birds.birds.rest;


import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;

import java.util.List;

public class BirdForm extends FormLayout {
    TextField speciesCode = new TextField("Species Code");
    TextField comName = new TextField("Common name");

    ComboBox<Bird> bird = new ComboBox<>("Bird");


    Button save = new Button("Save");
    Button delete = new Button("Delete");
    Button close = new Button("Cancel");

    public BirdForm(List<Bird> birds) {
        addClassName("contact-form");

        bird.setItems(birds);
        bird.setItemLabelGenerator(Bird::getComName);


        add(speciesCode,
                comName,
                bird,
                createButtonsLayout());
    }

    private HorizontalLayout createButtonsLayout() {
        save.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        delete.addThemeVariants(ButtonVariant.LUMO_ERROR);
        close.addThemeVariants(ButtonVariant.LUMO_TERTIARY);

        save.addClickShortcut(Key.ENTER);
        close.addClickShortcut(Key.ESCAPE);

        return new HorizontalLayout(save, delete, close);
    }
}