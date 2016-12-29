package iceberginformation;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.execute();
    }

    private final Map<String, Iceberg> icebergs = new HashMap<>();
    private final List<IcebergPosition> positions = new ArrayList<>();
    
    
    
    
    public Main() {
        icebergs.put("Antarida", new Iceberg("Antarida", LocalDate.of(2016, Month.MARCH, 4)));
        icebergs.put("Ana", new Iceberg("Ana", LocalDate.of(2012, Month.JULY, 21)));
        
        positions.add(new IcebergPosition(LocalDate.of(2012, Month.MARCH, 3), icebergs.get("Ana"), new Coordinates(4,5)));
        
    }

    private void execute() {
        output();
    }

    private void output() {
        for (Iceberg ice : icebergs.values()) {
            System.out.println("El iceberg "+ ice.getOrigin()+ " se creo el "+ ice.getDate());
            for (IcebergPosition position : positions) {
                System.out.println( " Se encuentra en X: "+ position.getCoordinates().getX()+" Y: " + position.getCoordinates().getY() + "  a fecha de " +position.getDate());
            }
        }


    }
    
}



  // private final List<PersonWeight> personWeight = new ArrayList<>();
