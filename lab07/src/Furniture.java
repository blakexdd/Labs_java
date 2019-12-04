public class Furniture {
    /* declarating class variables */
    String material;
    double age;

    /* Default Furniture constructorr
     * ARGUMENTS:
     *   - None
     * RETURNS:
     *   - None
     */
    public Furniture()
    {

    }

    /* Furniture constructor
     * ARGUMENTS:
     *   - material and age of furniture
     *       String material, double age
     * RETURNS:
     *   - None
     */
    public Furniture(String material, double age)
    {
        this.material = material;
        this.age = age;
    }

    /* Printing information about furniture object
     * ARGUMENTS:
     *   - None
     * RETURNS:
     *   - None
     */
    public void print()
    {
        System.out.println("Furniture: ");
        System.out.println("material: " + this.material
        + "; age: " + this.age);
    }

}
