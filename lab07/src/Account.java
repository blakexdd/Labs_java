public class Account {
    /* declarating class variables */
    static private String name;

    /* Default account constructor
     * ARGUMENTS:
     *   - None
     * RETURNS:
     *   - None
     */
    public Account()
    {

    }

    /* Account constructor
     * ARGUMENTS:
     *   - account holder
     *       String name1
     * RETURNS:
     *   - None
     */
    public Account(String name1)
    {
        name = name1;
    }

    /* Printing information about account method
     * ARGUMENTS:
     *   - None
     * RETURNS:
     *   - None
     */
    public void print()
    {
        System.out.println("Account holder: " + name);
    }

}
