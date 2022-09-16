package com.speedup.qa.stepdefinition;

import com.speedup.qa.task.DepartureDate;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class departureDateStepDefinition {

    @When("^i want to Select the departure date Indicate when I want to travel$")
    public void iWantToSelectTheDepartureDateIndicateWhenIWantToTravel() {
        OnStage.theActorInTheSpotlight().attemptsTo(DepartureDate.withData());
    }
}
