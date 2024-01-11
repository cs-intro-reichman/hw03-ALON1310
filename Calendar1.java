/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar1 {	
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	static int sundayAnd1th = 0;


	/** 
	 * Prints the calendars of all the years in the 20th century. Also prints the  
	 * number of Sundays that occured on the first day of the month during this period.
	 */
	public static void main(String args[]) {
		// Advances the date and the day-of-the-week from 1/1/1900 till 31/12/1999, inclusive.
	    // Prints each date dd/mm/yyyy in a separate line. If the day is a Sunday, prints "Sunday".
	    // The following variable, used for debugging purposes, counts how many days were advanced so far.
	    int debugDaysCounter = 0; 
	    //// Write the necessary initialization code, and replace the condition
	    //// of the while loop with the necessary condition 
	 	while (true) {
	 		System.out.println(dayOfMonth+"/"+month+"/"+year+(dayOfWeek==1? " Sunday":""));
	 		//// Write the body of the while 		
	 		advance();
	 		debugDaysCounter++;
	 		//// If you want to stop the loop after n days, replace the condition of the
	 		//// if statement with the condition (debugDaysCounter == n)
	 		if (year>1999) { 
	 			 System.out.println("During the 20th century, "+ sundayAnd1th +" Sundays fell on the first day of the month");

	 			break;
	 		}
        }
	 	//// Write the necessary ending code here
	 }
	
	 // Advances the date (day, month, year) and the day-of-the-week.
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	 public static void advance() {
	
		// Replace this comment with your code
			dayOfWeek++;
			dayOfWeek%=7;
		if(dayOfMonth>=nDaysInMonth(month,year)){
			dayOfMonth=1;
			month++;
			if(dayOfWeek==1){
				sundayAnd1th++;
			}
			if(month>12){
				month%=12;
				year++;

			}
		} else dayOfMonth++;



	 } 
		 
    // Returns true if the given year is a leap year, false otherwise.
	private static boolean isLeapYear(int year) {// Replace the following statement with your code
	       if((year%400==0 || year%4==0 && year%100!=0 )){
	   	return true;
	   }
		else return false;	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	private static int nDaysInMonth(int month, int year) {// Replace the following statement with your code
		int daysOfMonth;
		switch (month) {

    case 2:  daysOfMonth = isLeapYear(year)? 29 : 28;
             break;

    case 4:  daysOfMonth = 30;
             break;

    case 6:  daysOfMonth = 30;
             break;

    case 9:  daysOfMonth = 30;
             break;

    case 11: daysOfMonth = 30;
             break;

	default: daysOfMonth = 31;
             break;		 

}
		return daysOfMonth;

		}

	}
