package com.birds.birds.rest;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.value.ValueChangeMode;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import java.util.Collections;

@Route(value = "/bird")
@PageTitle("Birds | Vaadin CRM")
public class ListView extends VerticalLayout {
    Grid<Bird> grid = new Grid<>(Bird.class);
    TextField filterText = new TextField();

    BirdForm birdForm;

    public ListView() {
        addClassName("list-view");
        setSizeFull();
        configureGrid();
        configureForm();
        add(getToolbar(), getContent());
    }


    private Component getContent() {
        HorizontalLayout content = new HorizontalLayout(grid, birdForm);
        content.setFlexGrow(2, grid);
        content.setFlexGrow(1, birdForm);
        content.addClassNames("content");
        content.setSizeFull();
        return content;
    }

    private void configureForm() {
        birdForm = new BirdForm(Collections.emptyList());
        birdForm.setWidth("25em");
    }

    private void configureGrid() {
        grid.addClassNames("contact-grid");
        grid.setSizeFull();
        grid.setColumns("speciesCode","comName");
        grid.addColumn(bird -> bird.getSpeciesCode()).setHeader("Species Code");
        grid.addColumn(bird -> bird.getComName()).setHeader("Common Name");
        grid.getColumns().forEach(col -> col.setAutoWidth(true));
    }

    private HorizontalLayout getToolbar() {
        filterText.setPlaceholder("Filter by name...");
        filterText.setClearButtonVisible(true);
        filterText.setValueChangeMode(ValueChangeMode.LAZY);

        Button addBirdButton = new Button("Add Bird");

        HorizontalLayout toolbar = new HorizontalLayout(filterText, addBirdButton);
        toolbar.addClassName("toolbar");
        return toolbar;
    }
}