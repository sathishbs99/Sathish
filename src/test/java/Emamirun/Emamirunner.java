package Emamirun;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Frankrossfeatures",
plugin = "json:target/jsonReports/cucumber-report.json",
tags ="@Hooks",
//glue={"stepdefinition","hooks"})
//dryRun=true,
monochrome=true,
glue= {"stepsfrankross","hooks"})
public class Emamirunner {

}
