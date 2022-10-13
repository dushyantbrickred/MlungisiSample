package Runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "StepDefinitions",
        //tags = "@smoke5",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        monochrome = true
)
public class  CustomRunner {
}
