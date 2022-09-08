package com.speedup.qa.stepdefinition;

import com.speedup.qa.questions.SelectAdult;
import com.speedup.qa.questions.SelectBaby;
import com.speedup.qa.task.Adult;
import com.speedup.qa.task.Baby;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class adultBabyStepDefinition {

    @When("^the user clicks the plus button to select more passengers '(\\d+)', '(\\d+)'$")
    public void theUserClicksThePlusButtonToSelectMorePassengers(int arg1, int arg2) {
        for (int i = 1; i < arg1; i++) {
            OnStage.theActorInTheSpotlight().attemptsTo(Adult.adult());
        }

        for (int i = 0; i < arg2; i++) {
            OnStage.theActorInTheSpotlight().attemptsTo(Baby.baby());
        }
    }
    @Then("^we validate the number of passengers$")
    public void weValidateTheNumberOfPassengers() {
        System.out.println("Selected Adults on the website " + SelectAdult.nessageSelectAdult().answeredBy(theActorInTheSpotlight()));
        System.out.println("Selected Babies on the website " + SelectBaby.messageSelectBaby().answeredBy(theActorInTheSpotlight()));
    }
}
