package com.speedup.qa.stepdefinition;

import com.speedup.qa.models.DataCenter;
import com.speedup.qa.models.DestinyData;
import com.speedup.qa.models.OriginData;
import com.speedup.qa.questions.DestinyValidate;
import com.speedup.qa.questions.OriginValidate;
import com.speedup.qa.task.DestinyPassager;
import com.speedup.qa.task.OriginPassager;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

public class originPassagerStepDefinition {

    @When("^we select the origin and destination \"([^\"]*)\", \"([^\"]*)\"$")
    public void weSelectTheOriginAndDestination(OriginData originData, DestinyData destinyData) {
        OnStage.theActorInTheSpotlight().attemptsTo(OriginPassager.withTheData(originData));
        OnStage.theActorInTheSpotlight().attemptsTo(DestinyPassager.withTheData(destinyData));

    }

    @Then("^we validate the selected routes \"([^\"]*)\", \"([^\"]*)\"$")
    public void weValidateTheSelectedRoutes(OriginData originData, DestinyData destinyData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(OriginValidate.messageOriginValidate(), org.hamcrest.Matchers.is(originData)));
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(DestinyValidate.messageDestinyValidate(), org.hamcrest.Matchers.is(destinyData)));
    }
}
