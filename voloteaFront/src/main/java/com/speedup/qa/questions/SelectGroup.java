package com.speedup.qa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static com.speedup.qa.userinterface.OriginInterface.ENTER_BY_GROUP;

public class SelectGroup implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(ENTER_BY_GROUP).isVisible();
        /*if(dynamicElement.size() != 0){
            System.out.println("Existe elemento");
        }else{//0, elemento no esta presente.
            System.out.println("Elemento no existe");
        }*/
    }
    public static SelectGroup messageSelectGroup(){
        return new SelectGroup();
    }
}
