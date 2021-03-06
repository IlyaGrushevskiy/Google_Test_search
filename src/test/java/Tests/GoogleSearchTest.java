package Tests;

import com.codeborne.selenide.Selenide;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;

public class GoogleSearchTest {

    @Test
    void selenideSearchTest() {
        // Открыть google
        Selenide.open("https://www.google.com/");

        // Ввести Selenide в поиск
        $(byName("q")).setValue("Selenide").pressEnter();

        // Проверить, что Selenide появился в результатах поиска
        $("#search").shouldHave(text("selenide.org"));

    }
}
