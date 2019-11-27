import javax.swing.*;

public class FifthClass {
    public static void main(String[] args)
    {
        /* creating planet object */
        planet planet = new planet("Earth-01", 6371.0, 149.0);
        System.out.println(planet.name); // printing planet object
        planet.setName("Earth"); // setting new name to planet
        System.out.println(planet.getName()); // printing new name
        System.out.println(planet.toThousandKm("radius")); // converting radius to th km

        Sattelite sattelite = new Sattelite("Io", 834.0, 23254.2);
        sattelite.print();
    }

}
