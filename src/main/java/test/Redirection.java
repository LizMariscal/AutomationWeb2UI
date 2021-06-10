package test;

import actions.Click;
import org.openqa.selenium.WebDriver;
import ui.RedirectionUI;

public class Redirection {

    public static void as(WebDriver driver, String link) {

        Click.on(driver, RedirectionUI.redirect);

    }

}
