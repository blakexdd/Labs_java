public class FirstClass
{
    public static void main(String[] args)
    {
        int i = 5; // initializing integer variable
        i += 7; // increasing variable by
        System.out.println("i = " + i); // printing variable to console

        double d = (double)i / 8; // creating double variable
        System.out.println("d = " + d); // printing double variable

        char c1 = 'n'; // crating char symbol from symbol
        char c2 = 110; // creating char symbol from number
        char c3 = 111; // creating char symbol from number
        System.out.println("c1 = " + c1 + " & " + "c2 = " + c2); // printing char variables

        boolean b1 = (c1 == c2); // creating boolean variable and checking conditions
        boolean b2 = (c1 == c3); // creating boolean variable and checking conditions
        System.out.println(b1); // printing out boolean variable
        System.out.println(b2); // printing out boolean variable

        int year = 2001; // crating integer variable
        double div = (double) year / 5; // creating double variable
        System.out.println(div); // printing out double variable

        boolean l1 = true; // creating boolean variable
        boolean l2 = false; // creating boolean variable
        // making logical operations
        System.out.println("l1 | l2 " + (l1 | l2));
        System.out.println("l1 & l2 " + (l1 & l2));
        System.out.println("l1 ^ l2 " + (l1 ^ l2));
    }
}