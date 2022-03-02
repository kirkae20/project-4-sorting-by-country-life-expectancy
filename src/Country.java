public class Country implements Comparable<Country>{
    /* Country, Country_Code, Level, Region, 1990, 1991, 1992, 1993, 1994, 1995, 1996, 1997, 1998, 1999, 2000, 2001,
             2002, 2003, 2004, 2005, 2006, 2007, 2008, 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018, 2019
     */
    private String countryName;
    private String countryCode;
    private String level;
    private String region;
    private double expectancyIn1990, expectancyIn1991, expectancyIn1992, expectancyIn1993, expectancyIn1994,
            expectancyIn1995, expectancyIn1996, expectancyIn1997, expectancyIn1998, expectancyIn1999, expectancyIn2000,
            expectancyIn2001, expectancyIn2002, expectancyIn2003, expectancyIn2004, expectancyIn2005, expectancyIn2006,
            expectancyIn2007, expectancyIn2008, expectancyIn2009, expectancyIn2010, expectancyIn2011, expectancyIn2012,
            expectancyIn2013, expectancyIn2014, expectancyIn2015, expectancyIn2016, expectancyIn2017, expectancyIn2018,
            expectancyIn2019;

    // default constructor
    public Country() {
        //super();
    }

    // constructor
    public Country(String countryName, String countryCode, String level, String region, double expectancyIn1990,
                   double expectancyIn1991, double expectancyIn1992, double expectancyIn1993, double expectancyIn1994,
                   double expectancyIn1995, double expectancyIn1996, double expectancyIn1997, double expectancyIn1998,
                   double expectancyIn1999, double expectancyIn2000, double expectancyIn2001, double expectancyIn2002,
                   double expectancyIn2003, double expectancyIn2004, double expectancyIn2005, double expectancyIn2006,
                   double expectancyIn2007, double expectancyIn2008, double expectancyIn2009, double expectancyIn2010,
                   double expectancyIn2011, double expectancyIn2012,double expectancyIn2013, double expectancyIn2014,
                   double expectancyIn2015, double expectancyIn2016, double expectancyIn2017, double expectancyIn2018,
                   double expectancyIn2019) {
        //super();
        this.countryName = countryName;
        this.countryCode = countryCode;
        this.level = level;
        this.region = region;
        this.expectancyIn1990 = expectancyIn1990;
        this.expectancyIn1991 = expectancyIn1991;
        this.expectancyIn1992 = expectancyIn1992;
        this.expectancyIn1993 = expectancyIn1993;
        this.expectancyIn1994 = expectancyIn1994;
        this.expectancyIn1995 = expectancyIn1995;
        this.expectancyIn1996 = expectancyIn1996;
        this.expectancyIn1997 = expectancyIn1997;
        this.expectancyIn1998 = expectancyIn1998;
        this.expectancyIn1999 = expectancyIn1999;
        this.expectancyIn2000 = expectancyIn2000;
        this.expectancyIn2001 = expectancyIn2001;
        this.expectancyIn2002 = expectancyIn2002;
        this.expectancyIn2003 = expectancyIn2003;
        this.expectancyIn2004 = expectancyIn2004;
        this.expectancyIn2005 = expectancyIn2005;
        this.expectancyIn2006 = expectancyIn2006;
        this.expectancyIn2007 = expectancyIn2007;
        this.expectancyIn2008 = expectancyIn2008;
        this.expectancyIn2009 = expectancyIn2009;
        this.expectancyIn2010 = expectancyIn2010;
        this.expectancyIn2011 = expectancyIn2011;
        this.expectancyIn2012 = expectancyIn2012;
        this.expectancyIn2013 = expectancyIn2013;
        this.expectancyIn2014 = expectancyIn2014;
        this.expectancyIn2015 = expectancyIn2015;
        this.expectancyIn2016 = expectancyIn2016;
        this.expectancyIn2017 = expectancyIn2017;
        this.expectancyIn2018 = expectancyIn2018;
        this.expectancyIn2019 = expectancyIn2019;
    }

    // copy constructor
    public Country(Country c) {
        this.countryName = c.countryName;
        this.countryCode = c.countryCode;
        this.level = c.level;
        this.region = c.region;
        this.expectancyIn1990 = c.expectancyIn1990;
        this.expectancyIn1991 = c.expectancyIn1991;
        this.expectancyIn1992 = c.expectancyIn1992;
        this.expectancyIn1993 = c.expectancyIn1993;
        this.expectancyIn1994 = c.expectancyIn1994;
        this.expectancyIn1995 = c.expectancyIn1995;
        this.expectancyIn1996 = c.expectancyIn1996;
        this.expectancyIn1997 = c.expectancyIn1997;
        this.expectancyIn1998 = c.expectancyIn1998;
        this.expectancyIn1999 = c.expectancyIn1999;
        this.expectancyIn2000 = c.expectancyIn2000;
        this.expectancyIn2001 = c.expectancyIn2001;
        this.expectancyIn2002 = c.expectancyIn2002;
        this.expectancyIn2003 = c.expectancyIn2003;
        this.expectancyIn2004 = c.expectancyIn2004;
        this.expectancyIn2005 = c.expectancyIn2005;
        this.expectancyIn2006 = c.expectancyIn2006;
        this.expectancyIn2007 = c.expectancyIn2007;
        this.expectancyIn2008 = c.expectancyIn2008;
        this.expectancyIn2009 = c.expectancyIn2009;
        this.expectancyIn2010 = c.expectancyIn2010;
        this.expectancyIn2011 = c.expectancyIn2011;
        this.expectancyIn2012 = c.expectancyIn2012;
        this.expectancyIn2013 = c.expectancyIn2013;
        this.expectancyIn2014 = c.expectancyIn2014;
        this.expectancyIn2015 = c.expectancyIn2015;
        this.expectancyIn2016 = c.expectancyIn2016;
        this.expectancyIn2017 = c.expectancyIn2017;
        this.expectancyIn2018 = c.expectancyIn2018;
        this.expectancyIn2019 = c.expectancyIn2019;
    }

    // String interface for Countries
    @Override
    public String toString() {
        String countryInfo;
        if (expectancyIn2019 == -1) {
            countryInfo = countryName + " (" + countryCode + "): NA";
        }
        else {
            countryInfo = countryName + " (" + countryCode + "): " + expectancyIn2019 + " years";
        }
        return countryInfo;
    }

    @Override
    public int compareTo(Country country2) {
        return Double.compare(this.get2019Expectancy(), country2.get2019Expectancy());
    }


    // getter for 2019 life expectancy
    public double get2019Expectancy() {
        return expectancyIn2019;
    }

    // getter for country name
    public String getCountryName() {
        return countryName;
    }

}
