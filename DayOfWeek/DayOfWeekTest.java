import java.time.*;

class DayOfWeekTest{
	public static void main(String[] args){

		DayOfWeek(5, 14);

	}

	private static String DayOfWeek(int a, int b){
		LocalDate ld = LocalDate.of(2016, a, b);


		System.out.println(ld.toString());
//		System.out.println(ld.getDayOfWeek().substring(0, 3));

		String dow = ld.getDayOfWeek().toString();

		System.out.println("Day Of Week : " + dow.substring(0,3));

		return ld.toString();
	}
}

