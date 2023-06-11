package com.example.application.views.muelles;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.board.Board;
import com.vaadin.flow.component.board.Row;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.IntegerField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.atmosphere.interceptor.AtmosphereResourceStateRecovery;

import java.awt.*;

@PageTitle("Muelles")
@Route(value = "Muelles", layout = MainLayout.class)
public class MuellesView extends VerticalLayout {

    public MuellesView() {

        HorizontalLayout contenedorHorizontalAgregaMuelles = new HorizontalLayout();
        VerticalLayout contenedorVerticalEstadisticas = new VerticalLayout();

        /*
        //Layout Fila1
        Label labelTipo = new Label("Tipo");
        Label labelTamaño = new Label("Tamaño");
        Label labelAñadir = new Label("Añadir");
        Label labelCantidad = new Label("Cantidad");
        Label labelEnviar = new Label("Enviar");
        HorizontalLayout fila1 = new HorizontalLayout(labelTipo, labelTamaño, labelAñadir, labelCantidad, labelEnviar);


        //fila2
        Label labelMecanico = new Label("Mecánico");
        Label labelRNM68 = new Label("RNM68");
        Button añadirRNM68 = new Button("+1");
        IntegerField cantidadRNM68 = new IntegerField("Ingrese cantidad...");
        Button enviarRNM68 = new Button("Añadir...");
        HorizontalLayout fila2 = new HorizontalLayout(labelMecanico, labelRNM68, añadirRNM68, cantidadRNM68, enviarRNM68);
        fila2.setDefaultVerticalComponentAlignment(Alignment.BASELINE);

*/


        //Layout Columna TipoMuelles
        Label labelTipo = new Label("Tipo");
        Label labelMecanico = new Label("Mecánicos");
        Label labelHidraulico = new Label("Hidráulicos");
        VerticalLayout columna1 = new VerticalLayout(labelTipo, labelMecanico, labelHidraulico);
        columna1.setWidth("150");
        columna1.setFlexGrow(0.01, labelTipo);
        columna1.setFlexGrow(0.04, labelMecanico);
        columna1.setFlexGrow(0.04, labelHidraulico);

        //Columna Tamaño
        Label labelTamaño = new Label("Tamaño");
        Label labelRNM68 = new Label("RNM68");
        Label labelRNH18 = new Label("RNH18");
        Label labelRNH20 = new Label("RNH20");
        Label labelRNH25 = new Label("RNH25");
        Label labelRNH30 = new Label("RNH30");
        Label labelRNH68 =new Label("RNH68");
        VerticalLayout columna2 = new VerticalLayout(labelTamaño, labelRNM68, labelRNH18, labelRNH20, labelRNH25, labelRNH30, labelRNH68);
        columna2.setWidth("150");
        //Ajuste de columna
        columna2.setFlexGrow(0.01, labelTamaño);
        columna2.setFlexGrow(0.06, labelRNM68);
        columna2.setFlexGrow(0.04, labelRNH18);
        columna2.setFlexGrow(0.05, labelRNH20);
        columna2.setFlexGrow(0.04, labelRNH25);
        columna2.setFlexGrow(0.05, labelRNH30);
        columna2.setFlexGrow(0.04, labelRNH68);


        //Columna Añadir
        Label labelAñadir = new Label("Añadir");
        Button añadirRNM68 = new Button("+1");
        añadirRNM68.addClickListener(buttonClickEvent -> {
            Notification.show("1 Muelle RNM68 añadido a la base de datos...");
            //Añadir código que añada el muelle a la BBDD
        });
        Button añadirRNH18 = new Button("+1");
        añadirRNH18.addClickListener(buttonClickEvent -> {
            Notification.show("1 Muelle RNH18 añadido a la base de datos...");
            //Añadir código que añada el muelle a la BBDD
        });
        Button añadirRNH20 = new Button("+1");
        añadirRNH20.addClickListener(buttonClickEvent -> {
            Notification.show("1 Muelle RNH20 añadido a la base de datos...");
            //Añadir código que añada el muelle a la BBDD
        });
        Button añadirRNH25 = new Button("+1");
        añadirRNH25.addClickListener(buttonClickEvent -> {
            Notification.show("1 Muelle RNH25 añadido a la base de datos...");
            //Añadir código que añada el muelle a la BBDD
        });
        Button añadirRNH30 = new Button("+1");
        añadirRNH30.addClickListener(buttonClickEvent -> {
            Notification.show("1 Muelle RNH30 añadido a la base de datos...");
            //Añadir código que añada el muelle a la BBDD
        });
        Button añadirRNH68 = new Button("+1");
        añadirRNH68.addClickListener(buttonClickEvent -> {
            Notification.show("1 Muelle RNH68 añadido a la base de datos...");
            //Añadir código que añada el muelle a la BBDD
        });
        VerticalLayout columna3 = new VerticalLayout(labelAñadir, añadirRNM68, añadirRNH18, añadirRNH20, añadirRNH25, añadirRNH30, añadirRNH68);
        columna3.setHeight("700px");

        //Columna Cantidad
        Label labelCantidad = new Label("Cantidad");
        IntegerField cantidadRNM68 = new IntegerField("Ingrese cantidad...");
        IntegerField cantidadRNH18 = new IntegerField("Ingrese cantidad...");
        IntegerField cantidadRNH20 = new IntegerField("Ingrese cantidad...");
        IntegerField cantidadRNH25 = new IntegerField("Ingrese cantidad...");
        IntegerField cantidadRNH30 = new IntegerField("Ingrese cantidad...");
        IntegerField cantidadRNH68 = new IntegerField("Ingrese cantidad...");

        //Columna Enviar
        Label labelEnviar = new Label("Enviar");
        Button enviarRNM68 = new Button("Añadir...");
        Button enviarRNH18 = new Button("Añadir...");
        Button enviarRNH20 = new Button("Añadir...");
        Button enviarRNH25 = new Button("Añadir...");
        Button enviarRNH30 = new Button("Añadir...");
        Button enviarRNH68 = new Button("Añadir...");
        columna2.setHeight(columna3.getHeight());


        //Layout ContenedorHorizontalAgregaMuelles
        contenedorHorizontalAgregaMuelles.add(columna1, columna2, columna3);
        contenedorHorizontalAgregaMuelles.setHeight("450px");
        contenedorHorizontalAgregaMuelles.getStyle().set("border", "1px solid #9E9E9E");

        //Layout ContenedorHorizontalEstadisticas
        H1 tituloEstadisticas = new H1("Estadísticas");
        contenedorVerticalEstadisticas.add(tituloEstadisticas);

        //Layout Principal
        H1 tituloProduccion = new H1("Producción");
        add(tituloProduccion, contenedorHorizontalAgregaMuelles, contenedorVerticalEstadisticas);


    }

}
