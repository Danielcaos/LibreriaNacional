package com.librerianacional.steps;

import com.librerianacional.pageObject.ValidarPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;

public class ValidarSteps {

    @Page
    ValidarPage validarPage;

    @Step("Validar libro agregado al carrito")
    public void validarAgregadoCarrito(){
        Assert.assertTrue(
                validarPage.getDriver().findElement(validarPage.getLblProductoAgregado()).isDisplayed()
        );
    }

}
