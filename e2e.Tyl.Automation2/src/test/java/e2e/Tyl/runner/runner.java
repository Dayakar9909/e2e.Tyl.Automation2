package e2e.Tyl.runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith (Cucumber.class)
@CucumberOptions(plugin={"pretty", "html:target/cucumber-reports"}, features = "src/test/resources/features", 
glue="e2e.Tyl.feature.steps", monochrome = true, tags = {"@Run"})

public class runner {
}