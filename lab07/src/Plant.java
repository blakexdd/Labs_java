public class Plant {
    /* declarating class variables */
    private String type;
    private String color;
    private String existenceArea;
    private boolean rare;

    /* Default Plant constructor
     * ARGUMENTS:
     *   - None
     * RETURNS:
     *   - None
     */
    public Plant()
    {

    }

    /* Plant constructor
     * ARGUMENTS:
     *   - type and color of an object
     *      String type, String color
     * RETURNS:
     *   - None
     */
    public Plant(String type, String color)
    {
        this.type = type;
        this.color = color;
    }

    /* Plant constructor
     * ARGUMENTS:
     *   - type of an object
     *      String type
     * RETURNS:
     *   - None
     */
    public Plant(String type)
    {
        this.type = type;
    }

    /* Plant constructor
     * ARGUMENTS:
     *   - type,color, existance area and rare of an object
     *      String type, String color, String existenceArea, boolean rare
     * RETURNS:
     *   - None
     */
    public Plant(String type, String color, String existenceArea, boolean rare)
    {
        this.type = type;
        this.color = color;
        this.existenceArea = existenceArea;
        this.rare = rare;
    }

    /* Printing information about class object
     * ARGUMENTS:
     *   - None
     * RETURNS:
     *   - None
     */
    public void print()
    {
        System.out.println("type: " + this.type + "; color: " +
                this.color + "; existingArea: " + this.existenceArea +
                "; rare: " + this.rare);
    }
}
