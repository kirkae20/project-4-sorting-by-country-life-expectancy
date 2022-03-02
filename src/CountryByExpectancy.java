import java.util.Comparator;

public class CountryByExpectancy implements Comparator<Country> {
    // compares life expectancies of adjacent objects of Country
    // if expectancy of country 1 is smaller than country 2, return -1
    // if expectancy of country 1 is larger than country 2, return 1
    // if expectancy of country 1 is equal to country 2, compare Strings and return negative number if country1
        // comes first in alphabet and return 1 if country2 comes first in alphabet
    public int compare(Country country1, Country country2) {
        if (Double.compare(country1.get2019Expectancy(), country2.get2019Expectancy()) < 0) {
            return -1;
        }
        else if (Double.compare(country1.get2019Expectancy(), country2.get2019Expectancy()) > 0){
            return 1;
        }
        else {
            return country1.getCountryName().compareTo(country2.getCountryName());
        }
    }
}
