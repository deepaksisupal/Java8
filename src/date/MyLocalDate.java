package date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class MyLocalDate {
	
	public static void main(String[] argd){
		
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);//2017-04-08
		
		LocalDate localDate2 = LocalDate.of(2015, 12, 31);
		System.out.println(localDate2);//2015-12-31
		
		int   year       = localDate.getYear();//2017
		Month month      = localDate.getMonth();//APRIL
		int   dayOfMonth = localDate.getDayOfMonth();//8
		int   dayOfYear  = localDate.getDayOfYear();//98
		DayOfWeek dayOfWeek = localDate.getDayOfWeek();//SATURDAY
		
		System.out.println("year="+year+"; month="+month+"; dayOfMonth="+dayOfMonth+"; dayOfYear="+dayOfYear+"; dayOfWeek="+dayOfWeek);
		
		//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE");
		System.out.println(dayOfWeek.getDisplayName(TextStyle.SHORT,Locale.ENGLISH));//Sat
		System.out.println(dayOfWeek.getDisplayName(TextStyle.SHORT_STANDALONE,Locale.ENGLISH));//Sat
		
		System.out.println(dayOfWeek.getDisplayName(TextStyle.FULL,Locale.ENGLISH));//Saturday
		System.out.println(dayOfWeek.getDisplayName(TextStyle.FULL_STANDALONE,Locale.ENGLISH));//Saturday
		
		System.out.println(dayOfWeek.getDisplayName(TextStyle.NARROW,Locale.ENGLISH));//S
		System.out.println(dayOfWeek.getDisplayName(TextStyle.NARROW_STANDALONE,Locale.ENGLISH));//6
		
		System.out.println(dayOfWeek.getDisplayName(TextStyle.FULL,Locale.FRANCE));//samedi
		System.out.println(dayOfWeek.getDisplayName(TextStyle.FULL_STANDALONE,Locale.FRANCE));//samedi
	}

}
