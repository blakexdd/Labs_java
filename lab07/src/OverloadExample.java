public class OverloadExample {
    public static void main(String[] args)
    {
        /* creating Plant objects using different constructors */
        Plant p1 = new Plant();
        Plant p2 = new Plant("tulip", "red");
        Plant p3 = new Plant("cactus");
        Plant p4 = new Plant("new", "blue","USA", true);

        /* printing information about objects */
        p1.print();
        p2.print();
        p3.print();
        p4.print();
    }
}
