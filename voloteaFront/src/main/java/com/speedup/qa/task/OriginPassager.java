package com.speedup.qa.task;

import com.speedup.qa.models.OriginData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.speedup.qa.userinterface.OriginInterface.*;

public class OriginPassager implements Task {

    private OriginData originDataInstance;

    public OriginPassager(OriginData originData){
        this.originDataInstance = originData;
    }
    @Override
    public <T extends Actor> void performAs(T actorOrigin) {
        actorOrigin.attemptsTo(Click.on(CLIC_WRITE_ORIGIN));
        actorOrigin.attemptsTo(Enter.theValue(originDataInstance.getOrigin()).into(CLIC_WRITE_ORIGIN));
    }

    public static OriginPassager withTheData(OriginData originData){
        return new OriginPassager(originData);
    }
}
