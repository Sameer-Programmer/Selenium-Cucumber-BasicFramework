package stepRunner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\Mohamed Imran\\IdeaProjects\\Selenium_Cucumber\\Features\\OrangeHRM.feature",
        glue = "stepDefinitions"

)
public class TestRunner {
}
