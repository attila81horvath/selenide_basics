package Modules;

import com.codeborne.selenide.SelenideElement;

import java.time.Duration;
import static WebObjects.LoginObjects.ErrorMessage;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

public class LoginMessageModule {
    private final String _message;

    public LoginMessageModule(final String message) {
        _message = message;
    }

    public void CheckResponseMessageIsVisible() {
        ErrorMessage()
                .parent()
                .shouldBe(visible, Duration.ofSeconds(2));
    }

    public SelenideElement CheckResponseText() {
        return  ErrorMessage()
                .parent()
                .shouldHave(text(_message));
    }
}
