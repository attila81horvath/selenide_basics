package Configuration;

import com.codeborne.selenide.Configuration;
import static com.codeborne.selenide.WebDriverRunner.isChrome;
public class BrowserSettings {
    public static void SetSettingsOfChrome() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 8000;
        Configuration.fastSetValue = false;
        Configuration.holdBrowserOpen = false;
        Configuration.headless = false;
        System.out.println("Is Chrome? "+ isChrome());
    }
}
