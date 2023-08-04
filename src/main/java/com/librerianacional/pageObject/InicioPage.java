package com.librerianacional.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class InicioPage extends PageObject {


    private final By txtBusqueda= By.xpath("//div[@ng-reflect-ng-class='[object Object]']/input[contains(@ng-reflect-name,'buscar')]");

    public By getTxtBusqueda() {
        return txtBusqueda;
    }
}
