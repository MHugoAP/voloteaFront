package com.speedup.qa.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.apache.poi.ss.formula.functions.T;
import org.apache.tools.ant.taskdefs.Tar;
import org.openqa.selenium.By;

public class DepartureDate {

    public static final Target DEPARTURE_DAY = Target
            .the("Departure date")
            .locatedBy("//input[@id='sf-departure']");

    public static final Target MONTH_LIST = Target
            .the("Month list")
            .locatedBy("//div [@class='v7-input-text v7-input-text--light || v7-calendar__select || v7-u-ib']");
    public static final Target MONTH = Target
            .the("Month")
            .locatedBy("(//li[@class='v7-input-select__item ng-star-inserted'])[4]");

    public static final Target SELECT_DEPARTURE_DAY= Target
            .the("Select departure day")
            .locatedBy("//sf-calendar-month[@id='vol-month-11']//sf-calendar-day[@class='v7-cal__day block-ui-click ng-star-inserted']");
        //.located(By.xpath("//sf-calendar-month[@id='vol-month-9']//sf-calendar-day[@class='v7-cal__day block-ui-click ng-star-inserted']"));

    //.locatedBy("//*[@id='vol-month-9']//*[@class='v7-cal__day block-ui-click ng-star-inserted']");
        //  .locatedBy("//*[@class='v7-cal__day block-ui-click ng-star-inserted']");

    public static final  Target SELECT_DEPARTURE_RETURN = Target
            .the("Select departure return")
            .locatedBy("//sf-calendar-month[@id='vol-month-11']//sf-calendar-day[@class='v7-cal__day block-ui-click ng-star-inserted']");
        //.locatedBy("//*[@class='v7-cal__day block-ui-click ng-star-inserted']");

    public static final Target SELECT_BUTTON_SEARCH = Target
            .the("Select button search")
            .locatedBy("(//span[@class='v7-btn__text v7-btn__text--icon ng-star-inserted'])[1]");

    public static final Target SCROLL = Target
            .the("")
            .locatedBy("//div[@class='v7-popin__content v7-popin__content--main v7-popin__content--with-footer']");

}
