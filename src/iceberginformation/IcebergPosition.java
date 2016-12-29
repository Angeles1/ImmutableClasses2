package iceberginformation;

import java.time.LocalDate;
import java.util.Date;

public class IcebergPosition {
    private final LocalDate date;
    private final Iceberg iceberg;
    private final Coordinates coordinates;

    public IcebergPosition(LocalDate date, Iceberg iceberg, Coordinates coordinates) {
        this.date = date;
        this.iceberg = iceberg;
        this.coordinates = coordinates;
    }

    public LocalDate getDate() {
        return date;
    }

    public Iceberg getIceberg() {
        return iceberg;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    
}
