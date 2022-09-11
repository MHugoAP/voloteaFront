package com.speedup.qa.userinterface;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OriginInterface {
    @Managed
    private WebDriver myBrowser;
    public static final Target CLIC_WRITE_ORIGIN = Target
            .the("Write the origin")
            .located(By.xpath("//input[@id='origin']"));
    public static final By CLIC_WRITE_ORIGIN_VERSION2 = By.xpath("//input[@id='origin']");

    public static final Target CLIC_WRITE_ORIGIN_VERSION3 = Target
            .the("Write the origin")
            .located(By.className("//input[@id='origin']"));

    public static final Target WRITE_ORIGIN = Target
            .the("Write the origin")
            .located(By.className("v7-sf__input v7-is-focused"));

    public static final Target CLIC_WRITE_DESTINY = Target
            .the("Write the destiny")
            .located(By.xpath("//input[@id='destination']"));
    public static final By CLIC_WRITE_DESTINY_VERSION2 = By.xpath("//input[@id='destination']");

    public static final Target WRITE_DESTINY = Target
            .the("Write the origin")
            .located(By.className("v7-sf__input v7-is-focused"));

    public static final By ENTER_BY_GROUP = By.className("v7-rounded v7-rounded--feedback");

    public static final Target ENTER_BY_GROUP_TARGET = Target
            .the("validate that groups can be booked")
            .located(By.xpath("//span[@class='v7-rounded__text v7-rounded__text--xs']"));

    public static final By VALIDATE_ORIGIN = By.className("v7-sf__input v7-is-focused");

    public static final By VALIDATE_DESTINY = By.xpath("(//input[@class='v7-sf__input'])[2]");

    public static final Target NOT_FIND_A_SEARCH_ORIGIN = Target
            .the("We do not find a search")
            .located(By.className("v7-route v7-route--no-results || v7-js-route"));

    public static final By VALIDATE_NUMBER_ADULT = By.xpath("(//*[@class='v7-passenger__number ng-star-inserted'])[1]");

    public static final By VALIDATE_NUMBER_CHILD = By.xpath("(//*[@class='v7-passenger__number ng-star-inserted'])[2]");

    public static final By VALIDATE_NUMBER_BABY = By.xpath("(//*[@class='v7-passenger__number ng-star-inserted'])[3]");

    public static final By VALIDATE_NUMBER_BABY_ADULT = By.xpath("(//*[@class='v7-passenger__number ng-star-inserted'])[2]");

}
