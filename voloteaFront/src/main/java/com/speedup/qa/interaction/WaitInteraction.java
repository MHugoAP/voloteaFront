package com.speedup.qa.interaction;

import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class WaitInteraction implements Interaction {

    private int seconds;

    public WaitInteraction(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public <T extends Actor> void performAs(T actorInteraction) {
        new InternalSystemClock().pauseFor(seconds*1000);
    }

    public static WaitInteraction waitFor(int seconds) {
        return Tasks.instrumented(WaitInteraction.class, seconds);
    }
}
