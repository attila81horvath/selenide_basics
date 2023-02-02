package WebObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class LoginObjects {

    public static SelenideElement UserNameInput() {
        return $(By.id("user-name"));
    }

    public static SelenideElement PasswordInput() {
        return $(By.id("password"));
    }

    public static SelenideElement LoginButton() {
        return $(By.id("login-button"));
    }

    public static SelenideElement ErrorMessage() {
        return $(By.className("error-button"));
    }
}
