package data;

public enum Language {
    RU("Русский", "ru-ru"),
    GB("English", "en-gb"),
    NO("Norsk", "nb-no");

    public final String description;
    public final String domain;

    Language(String description, String domain) {
        this.description = description;
        this.domain = domain;
    }
}
