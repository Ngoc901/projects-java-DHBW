package LeapYear;

public class LeapYearChecker {
    public int year;
    public LeapYearChecker(int year) {
        this.year = year;
    }

    public void isLeapYear(){

        //String result = year % 100 == 0 && year % 400 == 0 ?  System.out.println("The year " + year + "is a leap year"): year % 4 == 0 ? System.out.println("The year " + year + "is a leap year") : System.out.println("The year " + year + "is a leap year ");

        if(year % 100 == 0 && year % 400 == 0 ){
            System.out.println("The year " + year + " is a leap year");
        }else if(year % 4 == 0 ){
            System.out.println("The year " + year + " is a leap year");
        }

        //return result;
    }
}
