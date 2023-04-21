package kki2;

import java.util.Calendar;


public class enumWeek2 {

	public static void main(String[] args) {
		Week today=null; //열거 타입 변수 생성
		
		Calendar cal=Calendar.getInstance();
		int week=cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
		case 1:
			today=Week.SUNDAY; //열거 상수대입
			break;
		case 2:
			today=Week.MONDAY;
			break;
		case 3:
			today=Week.TUESDAY;
		case 4:
			today=Week.WEDNESDAY;
			break;
		case 5:
			today=Week.THURSDAY;
			break;
		case 6:
			today=Week.FRIDAY;
			break;
		case 7:
			today=Week.SATURDAY;
			break;
					}
		System.out.println("today is" + today);
		if (today==Week.SUNDAY) {
			System.out.println("rest on sunday");	
		}else {
			System.out.println("study java");
		}
		

	}

}
