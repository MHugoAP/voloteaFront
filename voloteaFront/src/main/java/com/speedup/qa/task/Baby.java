package com.speedup.qa.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.speedup.qa.userinterface.PassageInterface.ENTER_PlUS_BABY;
import static com.speedup.qa.userinterface.PassageInterface.ENTER_PlUS_BABY_VERSION2;

public class Baby implements Task {
    @Override
    public <T extends Actor> void performAs(T actorPassage) {
        actorPassage.attemptsTo(Click.on(ENTER_PlUS_BABY));
    }

    public static Baby baby(){
        return Tasks.instrumented(Baby.class);
    }
}
