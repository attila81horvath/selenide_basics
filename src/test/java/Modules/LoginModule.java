package Modules;

import static com.codeborne.selenide.Condition.visible;
import static WebObjects.LoginObjects.*;
public class LoginModule {

    private final String _userName;
    private final String _password;

    public LoginModule(final String userName, final String password) {
        _userName = userName;
        _password = password;
    }

    public void Login() {
        UserNameInput()
                .shouldBe(visible)
                .setValue(_userName);

        PasswordInput()
                .shouldBe(visible)
                .setValue(_password);

        LoginButton()
                .shouldBe(visible)
                .click();
    }
    public Boolean isSuccessful() {
        return !(LoginButton().exists());
    }
}
