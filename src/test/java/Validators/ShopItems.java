package Validators;

import java.time.Duration;
import static WebObjects.ShopObjects.*;
import static com.codeborne.selenide.Condition.visible;
public class ShopItems {
    public static void BurgerMenuIsAvailable() {
        BurgerMenu()
                .shouldBe(visible, Duration.ofSeconds(2));
    }
}
