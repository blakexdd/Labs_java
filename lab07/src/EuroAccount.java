public class EuroAccount extends Account {
    /* declarating class variables */
    private int number;
    private double limit;
    private double current_sum;

    /* Default Euro account constructor
     * ARGUMENTS:
     *   - None
     * RETURNS:
     *   - None
     */
    public EuroAccount()
    {

    }

    /* Euro Account constructor
     * ARGUMENTS:
     *   - account number, sum limit for account, current sum
     *     on account and holder of an account
     *       int number, double limit, double current_sum, String name1
     * RETURNS:
     *   - None
     */
    public EuroAccount(int number, double limit, double current_sum, String name1)
    {
        super(name1);
        this.number = number;
        this.limit = limit;
        this.current_sum = current_sum;
    }

    /* Printing information about dollar account method
     * ARGUMENTS:
     *   - None
     * RETURNS:
     *   - None
     */
    @Override
    public void print()
    {
        System.out.println("Euro account: ");
        super.print();
        System.out.println("Account number: " + this.number);
        System.out.println("Account limit: " + this.limit + "€");
        System.out.println("Account current sum: " + this.current_sum + "€");
    }
}
