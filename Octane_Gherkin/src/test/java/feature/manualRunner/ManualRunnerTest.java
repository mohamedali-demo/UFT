package feature.manualRunner;


/*my comment */

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(OctaneCucumber.class)
@CucumberOptions(plugin = {"junit:junitResult.xml", "html:output.html", "json"},
                 features = "src/test/resources/feature/manualRunner")
public class ManualRunnerTest {

}