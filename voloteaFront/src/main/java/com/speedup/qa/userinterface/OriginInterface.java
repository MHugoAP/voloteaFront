package com.speedup.qa.userinterface;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OriginInterface {

    public static final Target CLIC_WRITE_ORIGIN = Target
            .the("Write the origin")
            .located(By.xpath("//input[@id='origin']"));

    public static final Target WRITE_ORIGIN = Target
            .the("Write the origin")
            .located(By.className("v7-sf__input v7-is-focused"));

    public static final Target CLIC_WRITE_DESTINY = Target
            .the("Write the origin")
            .located(By.xpath("//input[@id='destination']"));

    public static final Target WRITE_DESTINY = Target
            .the("Write the origin")
            .located(By.className("v7-sf__input v7-is-focused"));

    public static final By ENTER_BY_GROUP = By.className("v7-rounded v7-rounded--feedback");

    public static final Target ENTER_BY_GROUP_TARGET = Target
            .the("validate that groups can be booked")
            .located(By.className("v7-rounded v7-rounded--feedback"));
    public static final By VALIDATE_NUMBER_ADULT = By.xpath("(//*[@class='v7-passenger__number ng-star-inserted'])[1]");

    public static final By VALIDATE_NUMBER_CHILD = By.xpath("(//*[@class='v7-passenger__number ng-star-inserted'])[2]");

    public static final By VALIDATE_NUMBER_BABY = By.xpath("(//*[@class='v7-passenger__number ng-star-inserted'])[3]");
}
