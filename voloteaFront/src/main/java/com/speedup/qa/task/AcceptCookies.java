package com.speedup.qa.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.speedup.qa.userinterface.PassageInterface.ENTER_COOKIES;
import static com.speedup.qa.userinterface.PassageInterface.ENTER_PASSAGE;

public class AcceptCookies implements Task {

    @Override
    public <T extends Actor> void performAs(T actorPassage) {
        actorPassage.attemptsTo(Click.on(ENTER_COOKIES));
        actorPassage.attemptsTo(Click.on(ENTER_PASSAGE));
    }
    public static AcceptCookies acceptCookies(){
        return Tasks.instrumented(AcceptCookies.class);
    }
}
