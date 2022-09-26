package com.test.smartbear.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"target/test-classes/features/smartbear.feature"},
        glue = {"com/test/smartbear/stepdefinition"},
        dryRun = false,
        tags = "@smart",
        plugin = {"pretty", "html:target/uiReport.html", "rerun:target/uiFailedTests.txt"}
)
public class Runner {
}

