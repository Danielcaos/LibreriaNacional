package com.librerianacional.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ListaLibrosPage extends PageObject {

    private final By lnkLibros= By.xpath("//a[@class='d-block w-100 h-100']");

    private final By btnCarrito= By.xpath("//button[normalize-space()='Añadir al carrito']");

    public By getLnkLibros() {
        return lnkLibros;
    }

    public By getBtnCarrito() {
        return btnCarrito;
    }


}
