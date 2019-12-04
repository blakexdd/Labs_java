public class InheritanceExample {
    public static void main(String[] args)
    {
        /* creating and printing furniture instance */
        Furniture furniture = new Furniture("wood", 2.5);
        furniture.print();

        /* creating and printing chair's instance */
        Chair chair = new Chair("aluminium", 1.3, "beige");
        chair.print();

        /* checking overrided method*/
        System.out.println(chair.toString());

    }
}
