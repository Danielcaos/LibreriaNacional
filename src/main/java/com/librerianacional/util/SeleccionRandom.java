package com.librerianacional.util;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class SeleccionRandom {

    public static WebElement seleccionBy(WebDriver driver, By elementoWeb){
        List<WebElement> coleccion = driver.findElements(elementoWeb);
        Random random = new Random();
        int indexRandom = random.nextInt(coleccion.size());
        return coleccion.get(indexRandom);
    }

    public static WebElementFacade seleccionFacade(List<WebElementFacade> listaElementos) {
        Random rand = new Random();
        int index = rand.nextInt(listaElementos.size());
        return listaElementos.get(index);
    }

}
