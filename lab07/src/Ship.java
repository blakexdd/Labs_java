public class Ship {
    /* declarating class variables */
    private String title;
    private String captainName;
    private int port;
    private char type;

    /* Updating info function
     * ARGUMENTS:
     *   - title and captain's name
     *      String title, String captainName
     * RETURNS:
     *   - None
     */
    public void updateShipInfo(String title, String captainName)
    {
        this.title = title;
        this.captainName = captainName;
        System.out.println("title: " + this.title + "; captain's name "
        + this.captainName + "; port: " + this.port + "; type " + this.type);
    }

    /* Updating info function
     * ARGUMENTS:
     *   - title and port number
     *      String title, int port
     * RETURNS:
     *   - None
     */
    public void updateShipInfo(String title, int port)
    {
        this.title = title;
        this.port = port;
        System.out.println("title: " + this.title + "; captain's name "
                + this.captainName + "; port: " + this.port + "; type " + this.type);
    }

    /* Updating info function
     * ARGUMENTS:
     *   - number of port and it's type
     *      char type, int port
     * RETURNS:
     *   - None
     */
    public void updateShipInfo(char type, int port)
    {
        this.type = type;
        this.port = port;
        System.out.println("title: " + this.title + "; captain's name "
                + this.captainName + "; port: " + this.port + "; type " + this.type);
    }

}
