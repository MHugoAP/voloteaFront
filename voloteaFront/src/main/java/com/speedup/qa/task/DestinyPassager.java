package com.speedup.qa.task;

import com.speedup.qa.interaction.WaitInteraction;
import com.speedup.qa.models.DestinyData;
import com.speedup.qa.models.OriginData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.speedup.qa.userinterface.OriginInterface.CLIC_WRITE_DESTINY;

public class DestinyPassager implements Task {

    private DestinyData destinyDataInstance;

    public DestinyPassager(DestinyData destinyData){
        this.destinyDataInstance = destinyData;
    }

    @Override
    public <T extends Actor> void performAs(T actorDestiny) {
        actorDestiny.attemptsTo(Click.on(CLIC_WRITE_DESTINY));
        actorDestiny.attemptsTo(Enter.theValue(destinyDataInstance.getDestiny()).into(CLIC_WRITE_DESTINY), WaitInteraction.waitFor(3));
    }

    public static DestinyPassager withTheData(DestinyData destinyData){
        return new DestinyPassager(destinyData);
    }
}
