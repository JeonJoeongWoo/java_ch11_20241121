package CH11;

public class StringReplaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String oldStr = "자바는 객체 지행 언어입니다. 자바는 풍부한 API를 지원합니다.";
		oldStr = oldStr.replace("자바", "JAVA");
		System.out.println(oldStr);
	}

}
