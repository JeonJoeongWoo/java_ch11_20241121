package CH11;

public class StringValueofExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num = "123";
		
		int a = Integer.parseInt(num); // 문자열->정수
		System.out.println(num+100);
		System.out.println(a+100);
		
		String num2 = String.valueOf(100);
		System.out.println(num2+234);
	}

}
