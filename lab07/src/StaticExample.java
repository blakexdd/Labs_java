public class StaticExample {
    static int result; // initializing result variable

    public static void main(String[] args)
    {
        int[] array = {-3, 20, 5, 16, 27}; // creating array of int values

        /* going through array and calculating result */
        for (int value: array)
        {
            result = (value % 4 == 0) ? 1 : 0; // checking if value divided by 4
            System.out.println(result); // printing out results
        }

        Triangle t1 = new Triangle(3); // creating triangle with side 3
        Triangle t2 = new Triangle(4); // creating triangle with side 4
        Triangle.checkTriangles(t1, t2); // checking relationships of triangles.0
    }

}
