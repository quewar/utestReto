package retoUtest.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/registrousuario.feature",
        tags = "@stories",
        glue = "retoUtest.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class Utest {

}