package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.qameta.allure.Allure.step;

public class IosTests extends TestBase{

    @Test
    @Tag("ios")
    @DisplayName("Проверка ввода текста")
    void inputTextTest()  {
        step("Нажимаем на кнопку Text", () -> {
            $(accessibilityId("Text Button")).click();
        });
        step("Вводим текст в поле Enter a text", () -> {
            $(accessibilityId("Text Input")).sendKeys("hello@browserstack.com"+"\n");
        });
        step("Проверяем, что отображается введенный текст", () -> {
            $(accessibilityId("Text Output")).shouldHave(text("hello@browserstack.com"));
        });
    }
}