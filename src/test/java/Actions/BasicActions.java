package Actions;

import Modules.LoginModule;
import static TestData.Urls.*;
import static TestData.Accounts.*;
import static TestData.Messages.*;
import static Validators.ShopItems.BurgerMenuIsAvailable;
import static com.codeborne.selenide.Selenide.open;
import static Validators.Messages.*;

public class BasicActions {

    public static void ActionToOpenLoginPage() {
        open(STARTURL);
    }

    public static void ActionToLoginAsStandardUser() {
        LoginModule loginModule = new LoginModule(STANDARDUSERNAME, PASSWORD);
        loginModule.Login();
    }

    public static void ActionToValidateThatUserIsLoggedIn() {
        BurgerMenuIsAvailable();
    }

    public static void ActionToLoginAsLockedUser() {
        LoginModule loginModule = new LoginModule(LOCKEDUSERNAME, PASSWORD);
        loginModule.Login();
    }

    public static void ActionToValidateThatUserIsLocked() {
        LoginMessageResponse(LOCKEDUSERERRORMESSAGE);
    }
}
