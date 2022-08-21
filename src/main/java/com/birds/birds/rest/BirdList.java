package com.birds.birds.rest;

import com.birds.birds.BirdService;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class BirdList extends VerticalLayout {
    public BirdList(BirdService service){

        this.add( new H1( "Kilipedia" ) );
        var grid = new Grid<Bird>(Bird.class);
        grid.setItems(service.getBirds());
        grid.setColumns("speciesCode","comName","sciName","locName","howMany");

        add(grid);
    }
}
