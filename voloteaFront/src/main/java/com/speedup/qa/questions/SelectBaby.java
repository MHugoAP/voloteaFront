package com.speedup.qa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static com.speedup.qa.userinterface.OriginInterface.VALIDATE_NUMBER_BABY_ADULT;

public class SelectBaby implements Question<String> {
    @Override
    public String answeredBy(Actor actorQuestionBaby) {
        return BrowseTheWeb.as(actorQuestionBaby).find(VALIDATE_NUMBER_BABY_ADULT).getText();
    }
    public static SelectBaby messageSelectBaby(){
        return new SelectBaby();
    }
}
