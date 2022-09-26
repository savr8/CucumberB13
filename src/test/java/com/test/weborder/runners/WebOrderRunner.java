package com.test.weborder.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/*
THESE ARE INTERVIEW QUESTIONS:
-->Runner Class is a way to run your all feature files from here.(xml in TESTING)
Regression,smoke,integretion..etc
-->@RunWith-->Annotation comes from from Junit and it executes the feature file steps.
-->CucumberOptions-->is a special annotation that have some keywords.
-->features -->this is the location of feature files(this one should be content root)
-->glue -->this is the location of step definition files(this one should be source root)
-->dryRun-->this is a way to get snips(steps)without executing the whole implementation.
-->tags-->is a way to specialize scenarios for the specific purposes.It means
you can run some scenarios for only regression or smoke or etc.
-->plugin-->is a way to integrate specific condition for the keyword.It is mostly used to create a report card.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/weborder",
        glue ="com/test/weborder/stepdefinitions",
        dryRun = false,                                  //gives you a snips
        tags = "@smart" ,                                 //runs @smoke/@regression test case only
        plugin={"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt"}
          )
public class WebOrderRunner {

}
