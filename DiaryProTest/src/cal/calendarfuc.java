package cal;
import java.util.Calendar;

public class calendarfuc {
	Calendar cal = Calendar.getInstance();
	int year=cal.get(Calendar.YEAR);;
	int month= cal.get(Calendar.MONTH);;
	int day = cal.get(Calendar.DAY_OF_MONTH);
	
	public int getDay() {
		return day;
	}
	
	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}
	
	
	public String en_month(int month) {
		String mon = " ";
		switch(month){
			case 1:
				mon="January";
				break;
			case 2:
				mon="February";
				break;
			case 3:
				mon="March";
				break;
			case 4:
				mon="April";
				break;
			case 5:
				mon="May";
				break;
			case 6:
				mon="June";
				break;
			case 7:
				mon="July";
				break;
			case 8:
				mon="August";
				break;
			case 9:
				mon="September";
				break;
			case 10:
				mon="Octobor";
				break;
			case 11:
				mon="November";
				break;
			case 12:
				mon="December";
				break;
		}
		return mon;
	}

	
	
	
}
