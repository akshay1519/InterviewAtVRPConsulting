package runner;


import base.Page;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.cucumber.java.*;

import java.io.IOException;
import java.util.Arrays;

public class BeforeAndAfter {
    @BeforeAll
    public static void setup() {
        Page.getDriver();
    }

    @AfterAll
    public void quit(Scenario scenario) throws IOException {
        if (scenario.isFailed()){
            ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(Arrays.toString(Page.getByteScreenshot()));
            scenario.attach(Page.getByteScreenshot(), "image/png", "screenshot name");
            Page.tearDown();
        }
        if (Page.getDriver()!=null) {
            Page.tearDown();
        }
    }
}
