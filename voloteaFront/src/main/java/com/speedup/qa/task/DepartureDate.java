package com.speedup.qa.task;

import com.speedup.qa.interaction.ScrollDown;
import com.speedup.qa.interaction.WaitInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.speedup.qa.userinterface.DepartureDate.*;

public class DepartureDate implements Task {

    @Override
    public <T extends Actor> void performAs(T actorDeparture) {
        actorDeparture.attemptsTo(Click.on(DEPARTURE_DAY), WaitInteraction.waitFor(3));
        actorDeparture.attemptsTo(Click.on(MONTH_LIST), WaitInteraction.waitFor(2));
        actorDeparture.attemptsTo(Click.on(MONTH), WaitInteraction.waitFor(3));
        actorDeparture.attemptsTo(Click.on(SELECT_DEPARTURE_DAY), WaitInteraction.waitFor(2));
        actorDeparture.attemptsTo(Click.on(SCROLL), ScrollDown.on(4), WaitInteraction.waitFor(2));
        actorDeparture.attemptsTo(Click.on(SELECT_DEPARTURE_RETURN), WaitInteraction.waitFor(3));
        actorDeparture.attemptsTo(Click.on(SELECT_BUTTON_SEARCH), WaitInteraction.waitFor(5));
    }

    public static DepartureDate withData() {
        return new DepartureDate();
    }
}
