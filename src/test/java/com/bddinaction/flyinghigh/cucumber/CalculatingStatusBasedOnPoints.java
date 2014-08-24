package com.bddinaction.flyinghigh.cucumber;

import cucumber.api.CucumberOptions;
import net.thucydides.cucumber.CucumberWithThucydides;
import net.thucydides.jbehave.ThucydidesJUnitStory;
import org.junit.runner.RunWith;

@RunWith(CucumberWithThucydides.class)
@CucumberOptions(features="src/test/resources/features/status/calculating_status_based_on_points.feature")
public class CalculatingStatusBasedOnPoints extends ThucydidesJUnitStory {}
