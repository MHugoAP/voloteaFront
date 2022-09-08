package com.speedup.qa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import static com.speedup.qa.userinterface.OriginInterface.VALIDATE_NUMBER_CHILD;

public class SelectChild implements Question<String> {
    @Override
    public String answeredBy(Actor actorQuestionBaby) {
        return BrowseTheWeb.as(actorQuestionBaby).find(VALIDATE_NUMBER_CHILD).getText();
    }
    public static SelectChild messageSelectChild(){
        return new SelectChild();
    }
}
