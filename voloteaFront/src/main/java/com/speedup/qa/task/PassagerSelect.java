package com.speedup.qa.task;

import com.speedup.qa.models.DataOutline;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import static com.speedup.qa.userinterface.PassageInterface.*;

public class PassagerSelect implements Task {

    private DataOutline credentialDataInstance;

    /*
        private Boolean Real = true;
        public PassagerSelect(DataOutline credentialData){
            this.credentialDataInstance = credentialData;
        }
    */
    @Override
    public <T extends Actor> void performAs(T actorPassage) {
        actorPassage.attemptsTo(Click.on(ENTER_PlUS_ADULT));

        actorPassage.attemptsTo(Click.on(ENTER_PlUS_CHILD));
    //    actorPassage.attemptsTo(Click.on(ENTER_PlUS_CHILD_VERSION2));

        actorPassage.attemptsTo(Click.on(ENTER_PlUS_BABY));
    //    actorPassage.attemptsTo(Click.on(ENTER_PlUS_BABY_VERSION2));

        //actorLogin.attemptsTo(Enter.theValue(credentialsDataInstance.getUser()).into(USER_NAME)););
    }

    public static PassagerSelect selectPassager() {
        return Tasks.instrumented(PassagerSelect.class);
    }


    /*
    public static PassagerSelect withTheData(DataOutline credentialData){
        return new PassagerSelect(credentialData);
    }*/
}
