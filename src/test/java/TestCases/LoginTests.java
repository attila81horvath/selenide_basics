package TestCases;

import jdk.jfr.Description;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static Actions.BasicActions.*;
import static Configuration.BrowserSettings.SetSettingsOfChrome;
public class LoginTests {

    @BeforeAll
    static void SetUpAll() {
        SetSettingsOfChrome();
    }

    @Test
    @Description("Login as standard user and it works.")
    public void LoginAsStandardUserAndItWorks() {
        ActionToOpenLoginPage();
        ActionToLoginAsStandardUser();
    }

    @Test
    @Description("Login as locked user and it is locked.")
    public void LoginAsLockedUserAndItIsLocked() {
        ActionToOpenLoginPage();
        ActionToLoginAsLockedUser();
        ActionToCheckLockedUserResponse();
    }

    @Test
    @Description("Login as problem user and it shows problem.")
    public void LoginAsProblemUserAndItShowsProblem() {
        ActionToOpenLoginPage();
        ActionToLoginAsStandardUser();
    }
}
