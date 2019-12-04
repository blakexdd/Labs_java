public class ShipTest {
    public static void main(String[] args)
    {
        Ship ship = new Ship(); // creating ship class instance

        ship.updateShipInfo('A', 23); // updating info about type and port number
        ship.updateShipInfo("St. Petersburg", "Dmitry"); // updating info about title and captain Name
        ship.updateShipInfo("Moscow", 57); // updating info about title and port number
    }
}
