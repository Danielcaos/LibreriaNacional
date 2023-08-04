package com.librerianacional.steps;

import com.librerianacional.pageObject.ListaLibrosPage;
import com.librerianacional.util.SeleccionRandom;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class ListaLibrosSteps {

    @Page
    ListaLibrosPage listaLibrosPage;

    @Step("Seleccion libro")
    public void SeleccionarLibro(){
        WebElement libro = SeleccionRandom.seleccionBy(
                listaLibrosPage.getDriver(),
                listaLibrosPage.getLnkLibros()
        );
        JavascriptExecutor jsExecutor = (JavascriptExecutor) Serenity.getDriver();
        jsExecutor.executeScript("arguments[0].scrollIntoView();", libro);
        libro.click();
    }

    @Step("añadir al carrito")
    public void añadirCarrito(){
        WebDriverWait wait = new WebDriverWait(Serenity.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(listaLibrosPage.getBtnCarrito()));

        listaLibrosPage.getDriver().findElement(listaLibrosPage.getBtnCarrito()).click();
    }

}
