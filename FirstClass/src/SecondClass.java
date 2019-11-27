public class SecondClass {
    public static void main(String[] args)
    {
        String s = "13.7"; // crating string variable
        Double a = new Double(s); // creating double variable from string variable
        char c = "qwe".charAt(2); // crating char variable with element on 3d position
        System.out.println(a); // printing out double variable
        System.out.println(c); // printing out char variable

        Integer is = new Integer("135"); // creating integer from string using constructor
        Integer is1 = Integer.parseInt("135"); // creating integer from string using class method
        System.out.println(is); // printing out integer
        System.out.println(is1); // printing out integer

        String s1 = "Java is one of the best languages"; // creating string variable
        char s5 = s1.charAt(4); // getting symbol on 5th position
        boolean comp = s1.equals("Java is one of the most beautiful languages"); // creating boolean variable
        int finder = s1.indexOf("best"); // finding index of first words entery

        System.out.println(s1); // printing out string
        System.out.println(s5); // printing out 5th positing symbol
        System.out.println(comp); // printing out result of comparation
        System.out.println(finder); // printing out index of words entry


    }

}
