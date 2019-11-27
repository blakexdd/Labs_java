public class planet
{
    /* declarating atributes of the class */
    String name;
    Double radius;
    Double sunDistance;
    Sattelite sattelite;

    /* Default planet constructor
     * ARGUMENTS:
     *   - name, radius and sunDistance of the planet
     *      String name, Double radius, Double sunDistance
     * RETURNS:
     *   - None
     */
    public planet(String name, Double radius, Double sunDistance)
    {
        /* assigning given variables to class varibles */
        this.name = name;
        this.radius = radius;
        this.sunDistance = sunDistance;
    }

    /* Getting name function.
     * ARGUMENTS:
     *   - None
     * RETURNS:
     *   - name of the planet.
     *      String
     */
    public String getName()
    {
        return name;
    }

    /* Getting sattelite info.
     * ARGUMENTS:
     *   - None
     * RETURNS:
     *   - name of the planet.
     *      String
     */
    public void getSatteliteInfo()
    {
        this.sattelite.print();
    }

    /* Getting name function.
     * ARGUMENTS:
     *   - name of the planet
     *      String name
     * RETURNS:
     *   - None
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /* Converting to Thousand km.
     * ARGUMENTS:
     *   - param as a string
     *      String param
     * RETURNS:
     *   - converted value
     *      double
     */
    public double toThousandKm(String param)
    {
        double result = 0; // creating resulting varialbe

        /* using switch operator to choose what to convert */
        switch(param)
        {
            case "sunDistance":
                result = this.sunDistance / 1000;
            case "radius":
                result = this.radius / 1000;
        }

        /* returning result */
        return result;
    }

}

class Sattelite
{
    /* declarating atributes of the class */
    String name;
    Double radius;
    Double period;

    /* Default settalite constructor
     * ARGUMENTS:
     *   - name, radius and sunDistance of the planet
     *      String name, Double radius, Double sunDistance
     * RETURNS:
     *   - None
     */
    public Sattelite(String name, Double radius, Double period)
    {
        /* assigning given variables to class varibles */
        this.name = name;
        this.radius = radius;
        this.period = period;
    }

    /* Getting period function.
     * ARGUMENTS:
     *   - None
     * RETURNS:
     *   - period of the Settelite
     *       double
     */
    public double getPeriod()
    {
        return period;
    }

    /* Getting period in days function.
     * ARGUMENTS:
     *   - None
     * RETURNS:
     *   - period of the Settelite in days
     *       double
     */
    public double getPeriodInDays()
    {
        return period / 24;
    }

    /* Printing class objects function
     * ARGUMENTS:
     *   - None
     * RETURNS:
     *   - None
     */
    public void print()
    {
        System.out.println("Name of the settalite: " + this.name);
        System.out.println("Radius of the settalite "  + this.radius);
        System.out.println("Period of the settalite " + this.period);
    }

}