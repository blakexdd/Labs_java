public class AccountChecking {
    public static void main(String[] args)
    {
        /* creating dollar and euro accounts*/
        DollarAccount D_acc = new DollarAccount(1, 1000.23, 342.2, "Vladimir");
        EuroAccount E_acc = new EuroAccount(1, 2342.23, 123.2, "Vladimir");

        /* printing account information */
        D_acc.print();
        E_acc.print();
    }
}
