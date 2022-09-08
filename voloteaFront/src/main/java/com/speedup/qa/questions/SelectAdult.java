package com.speedup.qa.questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;


import static com.speedup.qa.userinterface.OriginInterface.VALIDATE_NUMBER_ADULT;

public class SelectAdult implements Question<String> {

    @Override
    public String answeredBy(Actor actorQuestion) {
        return BrowseTheWeb.as(actorQuestion).find(VALIDATE_NUMBER_ADULT).getText();
    }

    public static SelectAdult nessageSelectAdult(){
        return new SelectAdult();
    }
}
