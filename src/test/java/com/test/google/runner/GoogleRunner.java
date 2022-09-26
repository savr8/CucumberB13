package com.test.google.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class) //Karate.class
@CucumberOptions(
        features = "src/test/resources/features/google/search.feature",
        glue = "com/test/google/stepdefinitions",
        dryRun = false,
        tags ="@product",
        plugin ={"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt",
                "json:target/cucumber-reports/cucumber.json"}

)
public class GoogleRunner {

}
