package com.speedup.qa.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OriginInterface {

    public static final Target CLIC_WRITE_ORIGIN = Target
            .the("Write the origin")
            .located(By.xpath("//input[@id='origin']"));
        //.located(By.className("v7-sf__group-item v7-sf__group-item--origin v7-is-focused"));

    public static final Target WRITE_ORIGIN = Target
            .the("Write the origin")
            .located(By.className("v7-sf__input v7-is-focused"));

    public static final Target CLIC_WRITE_DESTINY = Target
            .the("Write the origin")
            .located(By.xpath("//input[@id='destination']"));
    // .located(By.className("v7-sf__group-item v7-sf__group-item--destination v7-is-focused"));

    public static final Target WRITE_DESTINY = Target
            .the("Write the origin")
            .located(By.className("v7-sf__input v7-is-focused"));
}
