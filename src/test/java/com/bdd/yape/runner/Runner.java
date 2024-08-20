package com.bdd.yape.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.util.logging.Level;
import java.util.logging.Logger;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/build/cucumber.json"},
        features = "src/test/resources/features",
        glue = "com.bdd.yape.glue",
        tags = "@api_restful1"
)
public class Runner {

}