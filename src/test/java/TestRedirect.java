
import actions.Click;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import test.Redirection;

public class TestRedirect {
    WebDriver webDriver;
    @Test
    public void testRedirect() {


        Redirection.as(webDriver, "redirect");
        webDriver.get("https://the-internet.herokuapp.com/status_codes");


        //Assert.assertTrue(IsEmployeePageDisplayed.form(webDriver));
    }
}
