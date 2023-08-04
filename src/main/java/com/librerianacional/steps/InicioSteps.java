package com.librerianacional.steps;

import com.librerianacional.models.Libros;
import com.librerianacional.pageObject.InicioPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.Keys;

public class InicioSteps {

    @Page
    InicioPage inicioPage;

    @Step("Abrir el navegador")
    public void abrirNanvegador(){
        //abrir el navegador con la ruta absoluta
        inicioPage.openUrl("https://librerianacional.com/");
    }

    @Step("Buscar el libro")
    public void buscarLibro(){
        String libro = Libros.data(0, "Libro");
        inicioPage.getDriver().findElement(inicioPage.getTxtBusqueda()).sendKeys(Libros.data(0, "Libro"));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        inicioPage.getDriver().findElement(inicioPage.getTxtBusqueda()).sendKeys(Keys.ENTER);
    }
}
