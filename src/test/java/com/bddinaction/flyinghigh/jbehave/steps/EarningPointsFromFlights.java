package com.bddinaction.flyinghigh.jbehave.steps;


import org.junit.Assert;
import org.junit.Assume;

import java.util.Date;

import static org.hamcrest.CoreMatchers.is;

public class EarningPointsFromFlights {
    @org.jbehave.core.annotations.Given("the flying distance between $departure and $destination is $distance km")
    public void define_flying_distance(String departure,
                                       String destination,
                                       int distance) {
    }

    @org.jbehave.core.annotations.When("I fly from $departure to $destination on $date$")
    public void I_fly_from(String departure, String destination, Date date) throws Throwable {
    }

    @org.jbehave.core.annotations.Then("I should earn $points points")
    public void I_should_earn_points(int points) throws Throwable {
        Assert.assertThat(points, is(points));
    }

    @org.jbehave.core.annotations.Then("I should earn a status bonus of <bonus>")
    public void I_should_earn_a_status_bonus_of(int bonus) throws Throwable {
    }

    @org.jbehave.core.annotations.When("I fly on a flight that is worth <base> base points")
    public void I_fly_on_a_flight_that_is_worth_base_base_points() throws Throwable {
    }

    @org.jbehave.core.annotations.When("I fly on a flight that is worth $points base points")
    public void I_fly_on_a_flight_that_is_worth_base_points(int points) throws Throwable {
    }

    @org.jbehave.core.annotations.Then("I should have guaranteed minimum earned points per trip of $minimum")
    public void I_should_have_guaranteed_minimum_earned_points_per_trip_of(int minimum) throws Throwable {
    }

    @org.jbehave.core.annotations.Then("I should earn $total points in all")
    public void I_should_earn_points_in_all(int total) throws Throwable {
    }

    @org.jbehave.core.annotations.Given("we can earn points with partners")
    public void partnerFeatureAvailable() {
//  TODO: Doesn't work properly yet
//        Assume.assumeTrue("The partner features is ready", false);
    }


}
