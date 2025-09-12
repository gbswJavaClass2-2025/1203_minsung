package sec01.exam02;

public class variableUseExample {

	public static void main(String[] args) {
		int hour = 3;
		int minuate = 5;
		System.out.println(hour + "시간" + minuate + "분");
		
		int totalMinute = (hour*60) + minuate;
		System.out.println("총 " + totalMinute + "분");

	}

}