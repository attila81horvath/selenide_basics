package demopage;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.junit5.ScreenShooterExtension;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.isChrome;

public class maintests {
    @BeforeAll
    static void setUpAll() throws Exception {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 8000;
        Configuration.fastSetValue = true;
        Configuration.headless = true;
        System.out.println("Is Chrome? "+ isChrome());
    }

    @Test
    @ExtendWith({ScreenShooterExtension.class})
    public void openMyPage() throws InterruptedException {
        open("https://katalon-demo-cura.herokuapp.com/");
        $("title").shouldHave(attribute("text", "CURA Healthcare Service"));
        $("#menu-toggle").click();
        $(By.linkText("Login")).click();
        $("#txt-username")
                .setValue("John Doe");
        $("#txt-password").setValue("ThisIsNotAPassword");
        $("#btn-login").click();
        $(By.xpath("//h2")).shouldHave(text("Make Appointment"));
        $("#menu-toggle").click();
        $(By.linkText("Logout")).click();
    }
}
