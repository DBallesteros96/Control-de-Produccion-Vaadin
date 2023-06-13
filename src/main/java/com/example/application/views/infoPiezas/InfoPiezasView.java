package com.example.application.views.infoPiezas;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.details.Details;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility;

@PageTitle("Info piezas")
@Route(value = "infopiezas", layout = MainLayout.class)
public class InfoPiezasView extends VerticalLayout {

    public InfoPiezasView() {
        //Título
        H1 tituloMuelles = new H1("Muelles");
        H2 tituloMecanico = new H2("Mecánico");
        H2 tituloHidraulico = new H2("Hidráulico");

        //Contenedores Muelles Mecánicos
        VerticalLayout contenedorMecanicos = new VerticalLayout();
        HorizontalLayout descripcionMecanicos = new HorizontalLayout();
        //Añadir foto al layout descripcionRNM68
        Text textoMecanicos = new Text("La Rampa Niveladora Mecánica presenta las mismas capacidades de resistencia y maniobrabilidad " +
                "que su homóloca la hidráulica con la diferencia de su sistema de elevación que consiste en un dispositivo articulado " +
                "de resortes que una vez accionados manualmente por medio de una cadena elevan la plataforma y extienden el labio.");

        descripcionMecanicos.add(/*añadir foto*/tituloMecanico, textoMecanicos);

        Details detallesMecanico = new Details("Detalles Muelles Mecánico"/*Probar a añadir aquí imagen con la tabla web ROPER*/);

        contenedorMecanicos.add(descripcionMecanicos, detallesMecanico);
        contenedorMecanicos.getStyle().set("border", "1px solid #9E9E9E");

        //Contenedor Muelles Hidráulicos
        VerticalLayout contenedorHidraulicos = new VerticalLayout();
        HorizontalLayout descripcionHidraulicos = new HorizontalLayout();
        //Añadir foto al layout descripcionRNM68
        Text textoHidraulico = new Text("Descripción muelles Hidráulicos");

        descripcionHidraulicos.add(/*añadir foto*/tituloHidraulico, textoHidraulico);

        Details detallesHidraulico = new Details("Detalles Muelles Hidráulicos"/*Probar a añadir aquí imagen con la tabla web ROPER*/);

        contenedorHidraulicos.add(descripcionHidraulicos, detallesHidraulico);
        contenedorHidraulicos.getStyle().set("border", "1px solid #9E9E9E");

        //Layout Principal
        add(tituloMuelles, tituloMecanico, contenedorMecanicos, tituloHidraulico, contenedorHidraulicos);
    }

}
