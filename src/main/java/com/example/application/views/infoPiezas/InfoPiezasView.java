package com.example.application.views.infoPiezas;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Text;
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

        //Contenedores Muelles
        HorizontalLayout contenedorRNM68 = new HorizontalLayout();
        VerticalLayout contenedorFotoRNM68 = new VerticalLayout();
        VerticalLayout contenedorDescripcionRNM68 = new VerticalLayout();
        contenedorDescripcionRNM68.setWidth("800px");
        H3 tituloRNM68= new H3("RNM68");
        Text textoRNM68 = new Text("La Rampa Niveladora Mecánica presenta las mismas capacidades de resistencia y maniobrabilidad " +
                "que su homóloca la hidráulica con la diferencia de su sistema de elevación que consiste en un dispositivo articulado " +
                "de resortes que una vez accionados manualmente por medio de una cadena elevan la plataforma y extienden el labio.");

        contenedorDescripcionRNM68.add(tituloRNM68, textoRNM68);

        contenedorRNM68.add(contenedorFotoRNM68, contenedorDescripcionRNM68);

        add(tituloMuelles, tituloMecanico, contenedorRNM68, tituloHidraulico);
    }

}
