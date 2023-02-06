package Actions;

import Modules.LoginModule;
import com.codeborne.selenide.WebDriverRunner;
import static TestData.Urls.*;
import static TestData.Accounts.*;
import static TestData.Messages.*;
import static Validators.ShopItems.BurgerMenuIsAvailable;
import static com.codeborne.selenide.Selenide.open;
import static Validators.Messages.*;
import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertFalse;

public class BasicActions {

    public static void ActionToOpenLoginPage() {
        // ARRANGE
        open(STARTURL);

        // ACT
        String currentUrl = WebDriverRunner.url();

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

    public static void ActionToValidateThatUserIsLoggedIn() {
        BurgerMenuIsAvailable();
    }

    public static void ActionToLoginAsLockedUser() {
        // ARRANGE
        LoginModule loginModule = new LoginModule(LOCKEDUSERNAME, PASSWORD);

        // ACT
        loginModule.Login();

        // ASSERT
        assertFalse(loginModule.isSuccessful());
    }

    public static void ActionToValidateThatUserIsLocked() {
        LoginMessageResponse(LOCKEDUSERERRORMESSAGE);
    }
}
