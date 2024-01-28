package tests;

import data.Airport;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;


public class DrivePageTest extends TestBase{

    @EnumSource(Airport.class)
    @ParameterizedTest
    @Tag("REGRESSION")
    @DisplayName("Checks that additional info about airport drive appears")
    void checkAirportDescriptionsAreProvided(Airport airport){

        mainPage.openDriverPage();
        driverPage.selectAirport(airport);
        driverPage.checkAirportInfo(airport);

    }
}
