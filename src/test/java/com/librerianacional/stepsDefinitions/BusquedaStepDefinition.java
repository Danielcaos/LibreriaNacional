package com.librerianacional.stepsDefinitions;

import com.librerianacional.steps.InicioSteps;
import com.librerianacional.steps.ListaLibrosSteps;
import com.librerianacional.steps.ValidarSteps;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;

public class BusquedaStepDefinition {

    @Steps
    InicioSteps inicioSteps;
    @Steps
    ListaLibrosSteps listaLibrosSteps;
    @Steps
    ValidarSteps validarSteps;

    @Dado("que el usuario abre la pagina de la libreria nacional")
    public void queElUsuarioAbreLaPaginaDeLaLibreriaNacional() {

        inicioSteps.abrirNanvegador();
    }

    @Cuando("busque un libro y de clic aleatoriamente a un libro")
    public void busqueUnLibroYDeClicAleatoriamenteAUnLibro() {
        inicioSteps.buscarLibro();
        listaLibrosSteps.SeleccionarLibro();
    }

    @Cuando("lo agregue al carrito de compras")
    public void loAgregueAlCarritoDeCompras() {

        listaLibrosSteps.añadirCarrito();
    }

    @Entonces("podra visualizar que el libro fue agregado con exito")
    public void podraVisualizarQueElLibroFueAgregadoConExito() {

        validarSteps.validarAgregadoCarrito();
    }

}
