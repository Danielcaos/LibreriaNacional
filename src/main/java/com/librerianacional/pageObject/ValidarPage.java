package com.librerianacional.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ValidarPage extends PageObject {

    private final By lblProductoAgregado= By.xpath("//div[@class='col-12 text--gray text--sml text--lh-1 px-0 text--semibold']");

    public By getLblProductoAgregado() {
        return lblProductoAgregado;
    }
}
