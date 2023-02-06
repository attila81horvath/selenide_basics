package WebObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
public class ShopObjects {
    public static SelenideElement BurgerMenu() {
        return $(By.id("react-burger-menu-btn"));
    }
}
