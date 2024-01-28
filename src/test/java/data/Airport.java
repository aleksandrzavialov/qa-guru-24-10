package data;

public enum Airport {
    MAN("Manchester", "70mi"),
    LCA("Larnaca", "60km"),
    GIG("Rio de Janeiro", "50km");

    public final String city;
    public final String distance;

    Airport(String city, String distance) {
        this.city = city;
        this.distance = distance;
    }
}
