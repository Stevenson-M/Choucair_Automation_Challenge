package org.choucair.userInterfaces;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    public static final Target USERNAME_FIELD = Target.the("username field")
            .located(By.name("username"));

    public static final Target PASSWORD_FIELD = Target.the("password field")
            .located(By.name("password"));

    public static final Target LOGIN_BUTTON = Target.the("login button")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));

}
