package pages;

import data.HeaderTranslations;
import data.Language;
import pages.components.AdditionalServices;
import pages.components.HeaderComponent;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {
    private static final String acceptCookies = ".ot-sdk-container #onetrust-accept-btn-handler";

    public static void changeLanguage(Language language){
        HeaderComponent.setPageLanguage(language);
    }

    public static void checkHeaderTranslations(HeaderTranslations headerTranslations){
        HeaderComponent.checkHeaderTranslations(headerTranslations);
    }

    public static void openMainPage(){
        open("");
        $(acceptCookies).shouldBe(visible);
        $(acceptCookies).click();
    }

    public static void openDriverPage(){
        AdditionalServices.openDriverMenu();
    }

    public static void openPageByDatalink(String linkPart){
        $("[href*="+linkPart+"]").click();
    }
}
