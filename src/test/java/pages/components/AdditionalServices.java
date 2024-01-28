package pages.components;

import data.Airport;
import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class AdditionalServices {

    public static void openDriverMenu(){
        $("[data-name=Chauffeur-drive]").click();
        $(".content-header").$(byText("Chauffeur-drive")).shouldBe(visible);
    }

    public static void selectAirport(Airport airport){
        $("[aria-label = City]").click();
        $(".input-field--active button").click();
        $(".input-field--active input").shouldHave(attribute("value", ""));
        $(".input-field--active input").setValue(airport.city);
        $(".auto-suggest__code").shouldHave(text(airport.name())).click();
    }

    public static void checkDistanceFromAirport(Airport airport){
        $$(".chauffeur-drive__heading").
                shouldHave(texts(airport.city+ " (" + airport.name() + ")",
                        "Distance covered: "+airport.distance,
                        "Additional notes"));
        int textLength = $(".chauffeur-drive__text-bottom").text().length();
        assert textLength > 0;

    }



}
