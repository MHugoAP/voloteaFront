package com.speedup.qa.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PassageInterface {

    public static final Target ENTER_COOKIES = Target
            .the("push the passenger button by cookies")
            .located(By.xpath("//button[@id='onetrust-accept-btn-handler']"));

    public static final Target ENTER_PASSAGE = Target
            .the("push the passenger button")
            .located(By.xpath("(//input[@id='input-text_sf-passenger'])[1]"));

    public static final Target ENTER_PlUS_ADULT = Target
            .the("press the button to add more adults")
            .located(By.xpath("(//*[@class='v7-btn-circle v7-btn-circle--sm v7-u-cursor-pointer'])[1]"));

    public static final Target ENTER_PlUS_CHILD = Target
            .the("press the button to add more adults")
            .located(By.xpath("(//*[@class='v7-btn-circle v7-btn-circle--sm v7-u-cursor-pointer'])[2]"));

    public static final Target ENTER_PlUS_CHILD_VERSION2 = Target
            .the("press the button to add more adults")
            .located(By.xpath("(//app-icon[@class='v7-i-svg'])[4]"));

    public static final Target ENTER_PlUS_BABY_VERSION2 = Target
            .the("press the button to add more adults")
            .located(By.xpath("(//app-icon[@class='v7-i-svg'])[6]"));

    public static final Target ENTER_PlUS_BABY = Target
            .the("press the button to add more adults")
            .located(By.xpath("(//*[@class='v7-btn-circle v7-btn-circle--sm v7-u-cursor-pointer'])[3]"));
}