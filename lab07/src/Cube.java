public class Cube {
    /* declarating class arguments */
    public double width;
    private double height;
    protected double depth;

    /* Default Cube constructor
     * ARGUMENTS:
     *   - width, height and depth of the Cube
     *      double width, double height, double depth
     * RETURNS:
     *   - None
     */
    public Cube(double width, double height, double depth)
    {
        /* assigning values to class variables */
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    /* printing object of the Cube class function
     * ARGUMENTS:
     *   - None
     * RETURNS:
     *   - None
     */
    public void print()
    {
        System.out.println(this.width + " | " + this.height +
                " | " + this.depth);
    }
}
