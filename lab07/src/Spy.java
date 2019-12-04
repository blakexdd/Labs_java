public class Spy {
    public String name; // creating name variable
    private String realName; // creating realName variable
    private int squad; // creating squad variable

    /* Getting info about spy object
     * ARGUMENTS:
     *   - None
     * RETURNS:
     *   - string with info about object
     */
    private String getSpyInfo()
    {
        return "".concat(name).concat(" ").concat(realName).concat(" ").concat(Integer.toString(squad));
    }

    /* Printing info about spy object
     * ARGUMENTS:
     *   - None
     * RETURNS:
     *   - None
     */
    public void print()
    {
        System.out.println(getSpyInfo());
    }

    /* Getting spy name
     * ARGUMENTS:
     *   - None
     * RETURNS:
     *   - spy name
     *      String
     */
    public String get_Name()
    {
        return name;
    }

    /* Getting spy realName
     * ARGUMENTS:
     *   - None
     * RETURNS:
     *   - spy realname
     *      String
     */
    public String get_realName()
    {
        return realName;
    }

    /* Getting spy squad
     * ARGUMENTS:
     *   - None
     * RETURNS:
     *   - spy squad
     *      int
     */
    public int get_squad()
    {
        return squad;
    }

    /* Setting spy name
     * ARGUMENTS:
     *   - new spy name
     *      String name
     * RETURNS:
     *   - None
     */
    public void set_Name(String name)
    {
        this.name = name;
    }

    /* Setting spy realName
     * ARGUMENTS:
     *   - new realName variable
     *       String realName
     * RETURNS:
     *   - None
     */
    public void set_realName(String realName)
    {
        this.realName = realName;
    }

    /* Setting spy squad
     * ARGUMENTS:
     *   - new squad variable
     *       int squad
     * RETURNS:
     *   - None
     */
    public void set_squad(int squad)
    {
        this.squad = squad;
    }



}
