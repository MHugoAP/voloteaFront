package com.speedup.qa.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.speedup.qa.userinterface.PassageInterface.*;

public class Adult implements Task {
    @Override
    public <T extends Actor> void performAs(T actorPassage) {
        actorPassage.attemptsTo(Click.on(ENTER_PlUS_ADULT));
    }

    public static Adult adult(){
        return Tasks.instrumented(Adult.class);
    }
}
