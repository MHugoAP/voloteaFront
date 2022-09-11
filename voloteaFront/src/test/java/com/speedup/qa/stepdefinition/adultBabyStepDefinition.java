package com.speedup.qa.stepdefinition;

import com.speedup.qa.questions.SelectAdult;
import com.speedup.qa.questions.SelectBaby;
import com.speedup.qa.questions.SelectGroup;
import com.speedup.qa.task.Adult;
import com.speedup.qa.task.Baby;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class adultBabyStepDefinition {

    @When("^the user clicks the plus button to select more passengers '(\\d+)', '(\\d+)'$")
    public void theUserClicksThePlusButtonToSelectMorePassengers(int arg1, int arg2){
        for (int i = 1; i < arg1; i++) {
            OnStage.theActorInTheSpotlight().attemptsTo(Adult.adult());
        }

        for (int i = 0; i < arg2; i++) {
            OnStage.theActorInTheSpotlight().attemptsTo(Baby.baby());
        }
    }
    /*
    @Then("^we validate the number of passengers$")
    public void weValidateTheNumberOfPassengers(String reserva) {
        System.out.println("Selected Adults on the website " + SelectAdult.nessageSelectAdult().answeredBy(theActorInTheSpotlight()));
        System.out.println("Selected Babies on the website " + SelectBaby.messageSelectBaby().answeredBy(theActorInTheSpotlight()));
        if (reserva.equals(reserva)){
            OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(SelectGroup.messageSelectGroup(), org.hamcrest.Matchers.is(reserva)));
            System.out.println("It is possible to make a group reservation");
        }else{
            System.out.println("The element is not visible");
        }
    }*/
    @Then("^we validate the number of passengers '(\\d+)', '(\\d+)' (.*)$")
    public void weValidateTheNumberOfPassengers(int arg1, int arg2, String reserva) throws InterruptedException {
        int total = arg1 + arg1;
        System.out.println("Selected Adults on the website " + SelectAdult.nessageSelectAdult().answeredBy(theActorInTheSpotlight()));
        System.out.println("Selected Babies on the website " + SelectBaby.messageSelectBaby().answeredBy(theActorInTheSpotlight()));
        if (arg1 > 9 || arg2 > 9 || total > 9){
            OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(SelectGroup.messageSelectGroup(), org.hamcrest.Matchers.is(reserva)));
            System.out.println("It's possible to make a group reservation");
        }else{
            System.out.println("It is not possible to make a group reservation");
        }
    }
}
