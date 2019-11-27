public class FourthClass {
    public static void main(String[] args) {
        int p = 0; // creating integer variable

        /* printing out many values */
        for (int i = 0; i < 30; i++) {
            if (i % 2 == 0) {
                double d = (double) i / 4; // creating double variable
                System.out.print(d + "; ");
            }
        }

        System.out.println(); // printing out empty line
        int year = 2016; // creating integer variable

        /* using switch to choose variant */
        switch (year) {
            case 2014:
                System.out.println("You're 3rd year student");
                break;
            case 2015:
                System.out.println("You're 2nd year student");
                break;
            case 2016:
                System.out.println("You're 1st year student");
                break;
        }


        /* initializing cycle varialbes */
        int j = 0;
        int k = 0;

        /* printing out table */
        System.out.println("x1, x2, x3 | f(x1, x2, x3)");
        for (int i = 0; i < 2; i++) {
            j = 0;
            while (j < 2) {
                k = 0;
                do {
                    /* creating boolean variables */
                    boolean x1 = i != 0;
                    boolean x2 = j != 0;
                    boolean x3 = k != 0;
                    int res = x1 & x2 | !x3 ? 1 : 0;

                    /* printing out table */
                    System.out.print(i + "   ");
                    System.out.print(j + "   ");
                    System.out.print(k + "   ");
                    System.out.print(res);
                    System.out.println();
                    k++;
                } while (k < 2);

                j++;
            }
        }

        /* printing out integers divides by 7 and less 130 */
        int i = 0;
        int cond = 0;

        while (true)
        {
            if (i < 130 && i % 7 == 0) {
                cond = i;
                System.out.println(cond);
            }

            if (cond > 23 * 3)
                break;

            i++;
        }

    }
}
