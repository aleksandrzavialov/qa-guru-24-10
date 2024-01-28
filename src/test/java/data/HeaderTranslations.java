package data;

import java.util.List;

public enum HeaderTranslations {
        RU("Русский",
                List.of("БРОНИРОВАНИЕ", "УПРАВЛЕНИЕ", "ВАШ ПОЛЕТ", "НАПРАВЛЕНИЯ", "ПРОГРАММЫ ЛОЯЛЬНОСТИ",
                        "ПОМОЩЬ")),
        EN("English", List.of("BOOK", "MANAGE", "EXPERIENCE", "WHERE WE FLY", "LOYALTY",
                "HELP")),
        NO("Norsk", List.of(" BESTILL", "ADMINISTRERE", "OPPLEVELSE", "HVOR VI FLYR",
                "LOJALITET", "HJELP"));

        public final String description;
        public final List headerTranslations;

      HeaderTranslations(String description, List headerTranslations) {
            this.description = description;
            this.headerTranslations = headerTranslations;
        }
}
