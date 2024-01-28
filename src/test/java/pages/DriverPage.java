package pages;

import data.Airport;
import pages.components.AdditionalServices;

public class DriverPage {

    public static void selectAirport(Airport airport){
        AdditionalServices.selectAirport(airport);
    }

    public static void checkAirportInfo(Airport airport){
        AdditionalServices.checkDistanceFromAirport(airport);
    }
}
