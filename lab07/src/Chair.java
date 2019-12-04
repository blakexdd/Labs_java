public class Chair extends Furniture {
    /* declarating class variables */
    private String color;

    /* Chairs constructor
     * ARGUMENTS:
     *   - material, age and color of chair
     *      String material, double age, String color
     * RETURNS:
     *   - None
     */
    public Chair(String material, double age, String color)
    {
        /* using super class constructor to set patameters */
        super(material, age);
        this.color = color;
    }

    /* Printing Chair method
     * ARGUMENTS:
     *   - None
     * RETURNS:
     *   - None
     */
    @Override
    public void print()
    {
        System.out.println("from Furniture: ");
        super.print(); // using super class method to print info
        System.out.println("Chair: ");
        System.out.println("material: " + this.material + "; age: "
        + this.age + "; color: " + this.color);
    }

    @Override
    public String toString()
    {
        return "".concat("material: ").concat(this.material).
                concat("; age:").concat(Double.toString(this.age)).
                concat("; color: ").concat(this.color);
    }
}
