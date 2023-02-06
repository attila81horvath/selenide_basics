package Modules;

import java.time.Duration;
import static WebObjects.LoginObjects.ErrorMessage;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

public class LoginMessageModule {
    private final String _message;

    public LoginMessageModule(final String message) {
        _message = message;
    }

    public void CheckResponseMessage() {
        ErrorMessage()
                .parent()
                .shouldBe(visible, Duration.ofSeconds(2))
                .shouldHave(text(_message));
    }

    public String ValidateText() {
        return  ErrorMessage()
                .parent()
                .getText();
    }
}
