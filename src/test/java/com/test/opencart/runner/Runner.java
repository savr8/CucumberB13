package com.test.opencart.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"target/test-classes/features/opencart/opencart.feature"},
        glue = {"com/test/opencart/stepdef/StepDef.java"},
        dryRun = false,
        tags = "",
        plugin = {"pretty", "html:target/uiReport.html", "rerun:target/uiFailedTests.txt"}
)
public class Runner {

}
