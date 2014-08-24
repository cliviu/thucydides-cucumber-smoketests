package com.bddinaction.flyinghigh.cucumber;

import cucumber.api.CucumberOptions;
import net.thucydides.cucumber.CucumberWithThucydides;
import net.thucydides.jbehave.ThucydidesJUnitStory;
import org.junit.runner.RunWith;

@RunWith(CucumberWithThucydides.class)
@CucumberOptions(features="src/test/resources/features/marketing/show_featured_destinations.feature")
public class ShowFeaturedDestinations extends ThucydidesJUnitStory {}
