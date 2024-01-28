package tests;

import data.HeaderTranslations;
import data.Language;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

public class MainPageTest extends TestBase{

    static Stream<Arguments> checkTranslationsOfHeaderMenu() {
        return Stream.of(
                Arguments.of(
                        Language.GB,
                        HeaderTranslations.EN
                )
                ,
                Arguments.of(
                        Language.RU,
                        HeaderTranslations.RU
                )
                ,
                Arguments.of(
                        Language.NO,
                        HeaderTranslations.NO
                )
        );
    }

    @MethodSource
    @ParameterizedTest
    @Tag("SMOKE")
    @DisplayName("Checks that a site visitor can switch to preferred language")
    void checkTranslationsOfHeaderMenu(Language language,  HeaderTranslations headerTranslations){
        mainPage.changeLanguage(language);
        mainPage.checkHeaderTranslations(headerTranslations);

    }

    @CsvFileSource(resources = "/checkHelpMenuHeaderContent.csv")
    @ParameterizedTest
    @Tag("REGRESSION")
    @DisplayName("Checks that all Help menu items contain correct name in header")
    void checkHelpMenuHeaderContent(String link, String text){
        mainPage.openPageByDatalink(link);
        helpPage.checkHelpMenuHeader(text);

    }
}
