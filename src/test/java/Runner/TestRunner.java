package Runner;

//import org.testng.annotations.Test;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		features = "src/test/resources/Features/",
		glue = { "stepDefinations", "hooks" },
		plugin = {
		"pretty", "html:reports/cucumber-reports/cucumber-reports.html" },
		monochrome = true)
public class TestRunner extends AbstractTestNGCucumberTests{

}
