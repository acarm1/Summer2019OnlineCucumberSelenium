package com.vytrack.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",   // path to features
        glue = "com/vytrack/step_definitions",      // path to definitions
        dryRun = true, // false when we run tests , =true --> we dont run tests, just checking if everyhting ready for testing
        tags = "@smoke_test",
        plugin = {"html:target/default-cucumber-reports"}

)
public class CucumberRunner {
}
