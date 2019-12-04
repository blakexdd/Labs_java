public class StaticContainer {
    static int counter; // declarating int variable
    static private int c = 0; // declarating int variable

    /* Calculating how many times we used this method
     * ARGUMENTS:
     *   - None
     * RETURNS:
     *   - None
     */
    static public void operation()
    {
        c++;
        if (c % 3 == 0)
            counter++;
    }
}
