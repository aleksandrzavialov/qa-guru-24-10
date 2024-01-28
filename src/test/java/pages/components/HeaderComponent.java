package pages.components;

import data.HeaderTranslations;
import data.Language;
import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Condition.text;


public class HeaderComponent {
    public static void setPageLanguage(Language language){
        $(".country-selector-list-item-link").click();
        $("[data-language-code="+language.domain+"]").click();
        $(".country-code").shouldHave(text(language.name()));
    }

    public static void checkHeaderTranslations(HeaderTranslations headerTranslations){
        $$("[data-id=header_nav_section]").shouldHave(texts(headerTranslations.headerTranslations));
    }

    public static void checkHelpHeaderText(String text){
        $(".page-header-util__text").shouldHave(text(text));
    }
}
