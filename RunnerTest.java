package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "steps",
        tags = "",
        plugin = {"pretty", "html: target/report-html", "json: target/report.jason"},
        monochrome = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class RunnerTest {
}
