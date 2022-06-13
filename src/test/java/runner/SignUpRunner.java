package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.io.File;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/feature"},
                 glue = {"stepdefination"},
                monochrome = true,
                plugin = {"pretty","html:target/cucumber","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
                )
public class SignUpRunner {
    @BeforeClass
    public static void setuo(){
    }
}
