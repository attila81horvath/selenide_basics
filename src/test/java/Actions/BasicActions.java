package Actions;

import Modules.LoginMessageModule;
import Modules.LoginModule;
import com.codeborne.selenide.WebDriverRunner;
import static TestData.Urls.*;
import static TestData.Accounts.*;
import static TestData.Messages.*;
import static com.codeborne.selenide.Selenide.open;
import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertFalse;
public class BasicActions {

    public static void ActionToOpenLoginPage() {
        // ARRANGE
        open(STARTURL);

        // ACT
        final String currentUrl = WebDriverRunner.url();

        // ASSERT
        assertEquals(STARTURL, currentUrl);
    }

    public static void ActionToLoginAsStandardUser() {
        // ARRANGE
        LoginModule loginModule = new LoginModule(STANDARDUSERNAME, PASSWORD);

        // ACT
        loginModule.Login();

        // ASSERT
        assertTrue(loginModule.isSuccessful());
    }

    public static void ActionToLoginAsLockedUser() {
        // ARRANGE
        LoginModule loginModule = new LoginModule(LOCKEDUSERNAME, PASSWORD);

        // ACT
        loginModule.Login();

        // ASSERT
        assertFalse(loginModule.isSuccessful());
    }

    public static void ActionToCheckLockedUserResponse() {
        // ARRANGE
        LoginMessageModule loginMessageModule = new LoginMessageModule(LOCKEDUSERERRORMESSAGE);

        // ACT
        loginMessageModule.CheckResponseMessageIsVisible();

        // ASSERT
        assertTrue(loginMessageModule
                        .CheckResponseText()
                        .exists());
    }

    public static void ActionToLoginAsProblemUser() {
        // ARRANGE
        LoginModule loginModule = new LoginModule(PROBLEMUSERNAME, PASSWORD);

        // ACT
        loginModule.Login();

        // ASSERT
        assertTrue(loginModule.isSuccessful());
    }
}
