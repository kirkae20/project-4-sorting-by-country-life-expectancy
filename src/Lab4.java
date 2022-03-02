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
        boolean sorted = false;
        // while list is not sorted
        while (!sorted) {
            int countSwaps = 0;
            // check adjacent list objects and determine if they should be swapped
            for(int i = 0; i < n - 1; i++) {
                // if compare returns a negative number, no swap necessary
                if (c.compare(list.get(i), list.get(i + 1)) <= 0){
                    // if list has had no swaps yet, it is sorted so far
                    if (countSwaps == 0) {
                        sorted = true;
                    }
                    // if list receives one swap before finishing iteration, it is not sorted
                    else {
                        sorted = false;
                    }
                }
                // if compare returns a positive number, call swap, count that swap occurred, set sorted to false
                else {
                    swap(list, i, i + 1);
                    countSwaps++;
                    sorted = false;
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
        ArrayList<Country> TestList = new ArrayList<Country>();
        ArrayList<Country> TestList1 = new ArrayList<Country>();
        ArrayList<Country> TestList2 = new ArrayList<Country>();
        ArrayList<Country> TestList3 = new ArrayList<Country>();
        ArrayList<Country> TestList4 = new ArrayList<Country>();
        ArrayList<Country> TestList5 = new ArrayList<Country>();
        ArrayList<Country> TestList6 = new ArrayList<Country>();
        ArrayList<Country> TestList7 = new ArrayList<Country>();
        ArrayList<Country> TestList8 = new ArrayList<Country>();
        ArrayList<Country> TestList9 = new ArrayList<Country>();
        ArrayList<Country> TestList10 = new ArrayList<Country>();
        ArrayList<Country> TestList11 = new ArrayList<Country>();
        ArrayList<Country> TestList12 = new ArrayList<Country>();

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
            // creating new ArrayLists so that when testing my sort method on various sizes of N, the program
            // will not be running through an already sorted list.
            TestList.add(info);
            TestList1.add(info);
            TestList2.add(info);
            TestList3.add(info);
            TestList4.add(info);
            TestList5.add(info);
            TestList6.add(info);
            TestList7.add(info);
            TestList8.add(info);
            TestList9.add(info);
            TestList10.add(info);
            TestList11.add(info);
            TestList12.add(info);


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

        // using sort to find  runtime for a variety of n
        start = System.nanoTime();
        sort(TestList, 185, new CountryByExpectancy());
        end = System.nanoTime();
        outFS.println("Runtime in nanoseconds for size 185: " + (end - start));

        start = System.nanoTime();
        sort(TestList1, 170, new CountryByExpectancy());
        end = System.nanoTime();
        outFS.println("Runtime in nanoseconds for size 170: " + (end - start));

        start = System.nanoTime();
        sort(TestList2, 155, new CountryByExpectancy());
        end = System.nanoTime();
        outFS.println("Runtime in nanoseconds for size 155: " + (end - start));

        start = System.nanoTime();
        sort(TestList3, 140, new CountryByExpectancy());
        end = System.nanoTime();
        outFS.println("Runtime in nanoseconds for size 140: " + (end - start));

        start = System.nanoTime();
        sort(TestList4, 125, new CountryByExpectancy());
        end = System.nanoTime();
        outFS.println("Runtime in nanoseconds for size 125: " + (end - start));

        start = System.nanoTime();
        sort(TestList5, 110, new CountryByExpectancy());
        end = System.nanoTime();
        outFS.println("Runtime in nanoseconds for size 110: " + (end - start));

        start = System.nanoTime();
        sort(TestList6, 95, new CountryByExpectancy());
        end = System.nanoTime();
        outFS.println("Runtime in nanoseconds for size 95: " + (end - start));

        start = System.nanoTime();
        sort(TestList7, 80, new CountryByExpectancy());
        end = System.nanoTime();
        outFS.println("Runtime in nanoseconds for size 80: " + (end - start));

        start = System.nanoTime();
        sort(TestList8, 65, new CountryByExpectancy());
        end = System.nanoTime();
        outFS.println("Runtime in nanoseconds for size 65: " + (end - start));

        start = System.nanoTime();
        sort(TestList9, 50, new CountryByExpectancy());
        end = System.nanoTime();
        outFS.println("Runtime in nanoseconds for size 50: " + (end - start));

        start = System.nanoTime();
        sort(TestList10, 35, new CountryByExpectancy());
        end = System.nanoTime();
        outFS.println("Runtime in nanoseconds for size 35: " + (end - start));

        start = System.nanoTime();
        sort(TestList11, 20, new CountryByExpectancy());
        end = System.nanoTime();
        outFS.println("Runtime in nanoseconds for size 20: " + (end - start));

        start = System.nanoTime();
        sort(TestList12, 5, new CountryByExpectancy());
        end = System.nanoTime();
        outFS.println("Runtime in nanoseconds for size 5: " + (end - start));

        // prints countries using toString method in order from lowest life expectancy (starting at NA)
            // to highest life expectancy
        outFS.println("\nCountries sorted based on 2019 life expectancy (lowest to highest): \n");
        for (Country info: CountryList){
            outFS.println(info.toString());
        }
        outFS.close();

    }
}
