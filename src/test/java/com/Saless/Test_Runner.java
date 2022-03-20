package com.Saless;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="featureFile/google.feature" , glue="StepDefinitions")
public class Test_Runner {

}
