import java.util.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;


public class Lab4 {

    // swap method which takes in ArrayList of countries and both indexes of objects to swap
    private static void swap(ArrayList<Country> list, int indexA, int indexB) {
        Country placeholder = list.get(indexA);
        list.set(indexA, list.get(indexB));
        list.set(indexB, placeholder);
    }

    // sort method which takes in ArrayList of countries, size of list, and Comparator interface
    public static void sort(ArrayList<Country> list, int n, Comparator<Country> c) {
        boolean unsorted = true;
        // while list is not sorted
        while (unsorted) {
            unsorted = false;
            int countSwaps = 0;
            // check adjacent list objects and determine if they should be swapped
            for(int i = 0; i < n - 1; i++) {
                // if compare returns a positive number, call swap
                if (c.compare(list.get(i), list.get(i + 1)) > 0){
                    swap(list, i, i + 1);
                    countSwaps++;
                    unsorted = true;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Country list filename?: ");
        // asks user for filename
        String getFile = scnr.nextLine();

        FileInputStream in = null;
        Scanner inputFile = null;

        // open FileInputStream
        // have FileInputStream run through Scanner
        in = new FileInputStream(getFile);
        inputFile = new Scanner(in);

        // ignores first line of file
        inputFile.nextLine();
        // creates ArrayList to store countries
        ArrayList<Country> CountryList = new ArrayList<Country>();

        // separates each file line into strings
        while(inputFile.hasNext()) {
            String country = inputFile.nextLine();
            String[] split = country.split(",");

            // if countries have "Not Available" life expectancies, assigned -1 to be read as a double and to
            // go to bottom of the list
            for (int i = 0; i < split.length; i++) {
                if (split[i].equalsIgnoreCase("Not Available")) {
                    split[i] = "-1";
                }
            }
            // assigns each String in the file line to object Country
            // parses String doubles into actual doubles
            Country info = new Country(split[0], split[1], split[2], split[3], Double.parseDouble(split[4]),
                    Double.parseDouble(split[5]), Double.parseDouble(split[6]), Double.parseDouble(split[7]),
                    Double.parseDouble(split[8]), Double.parseDouble(split[9]), Double.parseDouble(split[10]),
                    Double.parseDouble(split[11]), Double.parseDouble(split[12]), Double.parseDouble(split[13]),
                    Double.parseDouble(split[14]), Double.parseDouble(split[15]), Double.parseDouble(split[16]),
                    Double.parseDouble(split[17]), Double.parseDouble(split[18]), Double.parseDouble(split[19]),
                    Double.parseDouble(split[20]), Double.parseDouble(split[21]), Double.parseDouble(split[22]),
                    Double.parseDouble(split[23]), Double.parseDouble(split[24]), Double.parseDouble(split[25]),
                    Double.parseDouble(split[26]), Double.parseDouble(split[27]), Double.parseDouble(split[28]),
                    Double.parseDouble(split[29]), Double.parseDouble(split[30]), Double.parseDouble(split[31]),
                    Double.parseDouble(split[32]), Double.parseDouble(split[33]));
            // adds object Country to ArrayList
            CountryList.add(info);
        }
        // close FileInputStream
        in.close();

        // opens PrintWriter that prints to file "sortedDataset.txt"
        File file = new File("sortedDataset.txt");
        PrintWriter outFS = new PrintWriter(file);

        // calls sort method with ArrayList, number of entries being sorted, and Comparator class
        // prints out runtime for given size
        double start = System.nanoTime();
        sort(CountryList, CountryList.size(), new CountryByExpectancy());
        double end = System.nanoTime();
        outFS.println("Runtime in nanoseconds for size " + CountryList.size() + ": " + (end - start));

        // prints countries using toString method in order from lowest life expectancy (starting at NA)
            // to highest life expectancy
        outFS.println("\nCountries sorted based on 2019 life expectancy (lowest to highest): \n");
        for (Country info: CountryList){
            outFS.println(info.toString());
        }
        outFS.close();

    }
}
