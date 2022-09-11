package com.speedup.qa.questions;

import cucumber.api.java.zh_cn.而且;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.InputMismatchException;

import static com.speedup.qa.userinterface.OriginInterface.ENTER_BY_GROUP_TARGET;

public class SelectGroup implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the((ENTER_BY_GROUP_TARGET), WebElementStateMatchers.isVisible()));
        return Text.of(ENTER_BY_GROUP_TARGET).viewedBy(actor).asString();
    }

    public static SelectGroup messageSelectGroup() {
        return new SelectGroup();
    }
}
