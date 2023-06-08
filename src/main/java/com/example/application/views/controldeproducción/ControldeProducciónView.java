package com.example.application.views.controldeproducción;

import com.example.application.views.MainLayout;
import com.example.application.views.muelles.MuellesView;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Margin;

import java.awt.*;

@PageTitle("Control de Producción")
@Route(value = "", layout = MainLayout.class)
public class ControldeProducciónView extends VerticalLayout {

    public ControldeProducciónView() {

        Button botonMuelles = new Button("Muelles");
        botonMuelles.addClickListener(event -> {
            // Navegar a la vista 2
            getUI().ifPresent(ui -> ui.navigate(MuellesView.class));
        });
        Button botonLabios = new Button("Labios");
        Button botonPuertas = new Button("Puertas");

        add(botonMuelles, botonLabios, botonPuertas);
    }

}
