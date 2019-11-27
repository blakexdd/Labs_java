import java.util.Arrays;

public class ThirdClass {
    public static void main(String[] args)
    {
        double[] arr = {0.5, 1.3, 2.7, 0.2}; // creating array of doubles
        Arrays.sort(arr); // sorting array
        System.out.println(Arrays.toString(arr)); // printing out array's elems as strings
        System.out.println(arr[2]); // printing out third element of array
        System.out.println(arr.length); // printing length of array

        String srt = "\"Peter Piper picked a peck of\n" +
                "pickled peppers"; // creating string
        String delimeter = " "; // creating delimeter to split string
        String[] stringArray = srt.split(delimeter); // creating strings array
        System.out.println(Arrays.toString(stringArray)); // printing out string array
        System.out.println(stringArray[4]); // printing out 5th element of array
        Arrays.sort(stringArray); // sorting string array
        Arrays.asList(stringArray).indexOf("peppers"); // getting index of words entry
        System.out.println(Arrays.asList(stringArray).indexOf("peppers"));
    }
}
