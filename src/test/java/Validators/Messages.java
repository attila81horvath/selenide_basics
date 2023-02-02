package Validators;

import java.time.Duration;
import static WebObjects.LoginObjects.ErrorMessage;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
public class Messages {

    public static void LoginMessageResponse(final String Message) {
        ErrorMessage()
                .parent()
                .shouldBe(visible, Duration.ofSeconds(2))
                .shouldHave(text(Message));
    }
}
