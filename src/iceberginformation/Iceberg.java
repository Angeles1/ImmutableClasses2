package iceberginformation;

import java.time.LocalDate;

public class Iceberg {
    private final String origin;
    private final LocalDate date;

    public Iceberg(String origin, LocalDate date) {
        this.origin = origin;
        this.date = date;
    }

    public String getOrigin() {
        return origin;
    }

    public LocalDate getDate() {
        return date;
    }

    
}
