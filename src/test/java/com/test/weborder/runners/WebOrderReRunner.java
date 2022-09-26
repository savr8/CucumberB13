package com.test.weborder.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/weborder",
        glue ="com/test/weborder/stepdefinitions",
        dryRun = false,                                  //gives you a snips
        tags = "@regression" ,                                 //runs @smoke/@regression test case only
        plugin={"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt"}
)
public class WebOrderReRunner {

}
