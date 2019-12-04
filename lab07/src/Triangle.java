public class Triangle {
    public double side; // declarating side of the triangle

    /* Default Triangle constructor
     * ARGUMENTS:
     *   - side of the triangle
     *       double side
     * RETURNS:
     *   - None
     */
    public Triangle(double side)
    {
        this.side = side;
    }

    /* Finding area method
     * ARGUMENTS:
     *   - None
     * RETURNS:
     *   - area of the triangle
     *       double area
     */
    public double area()
    {
        return (Math.sqrt(3) / 4) * Math.pow(this.side, 2);
    }

    public static void checkTriangles(Triangle triangle1, Triangle triangle2)
    {
        double area1 = triangle1.area(); // initializing area of first triangle
        double area2 = triangle2.area(); // initializing area of second triangle

        /* checking how triangles realated and printing relationships*/
        if (area1 == area2)
            System.out.println("Треугольники равны");
        else if (area1 > area2)
            System.out.println("Первый треугольник больше второго");
        else
            System.out.println("Второй треугольник больше первого");
    }


}
