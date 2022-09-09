package com.speedup.qa.stepdefinition;

import com.speedup.qa.models.DestinyData;
import com.speedup.qa.models.OriginData;
import com.speedup.qa.questions.*;
import com.speedup.qa.task.DestinyPassager;
import com.speedup.qa.task.OriginPassager;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class originPassagerStepDefinition {

    @When("^we select the origin and destination \"([^\"]*)\", \"([^\"]*)\"$")
    public void weSelectTheOriginAndDestination(OriginData originData, DestinyData destinyData) {
        OnStage.theActorInTheSpotlight().attemptsTo(OriginPassager.withTheData(originData));
        OnStage.theActorInTheSpotlight().attemptsTo(DestinyPassager.withTheData(destinyData));

    }

    @Then("^we validate the selected routes$")
    public void weValidateTheSelectedRoutes() {
        System.out.println("You correctly selected your origin " + OriginValidate.messageOriginValidate().answeredBy(theActorInTheSpotlight()));
        System.out.println("You correctly selected your destination " + DestinyValidate.messageDestinyValidate().answeredBy(theActorInTheSpotlight()));
    }
}
