package com.demoqa.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
               "html:target/cucumber-report.html",
               "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },
        features = "src/test/resources/features",
        glue = "com/demoqa/step_defs",
        dryRun = true,
        tags = ""
)
public class CukesRunner {
}
