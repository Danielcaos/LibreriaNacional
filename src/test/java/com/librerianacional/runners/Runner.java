package com.librerianacional.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        tags = "@BusquedaExitosa",
        glue = "com.librerianacional.stepsDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class Runner {
}
