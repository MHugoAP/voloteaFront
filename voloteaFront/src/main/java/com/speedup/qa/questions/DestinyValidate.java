package com.speedup.qa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.speedup.qa.userinterface.OriginInterface.CLIC_WRITE_DESTINY_VERSION2;

public class DestinyValidate implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(CLIC_WRITE_DESTINY_VERSION2).getText();
    }

    public static DestinyValidate messageDestinyValidate() {
        return new DestinyValidate();
    }
}
