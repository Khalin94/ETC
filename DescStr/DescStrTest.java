import java.util.Arrays;
import java.util.Collections;

class DescStrTest{
	public static void main(String[] args){
		
		DescStr("Zbcdefg");
	}

	private static String DescStr(String str){
		String answer = "";

		String[] arr = str.split("");
		Arrays.sort(arr);
		Collections.reverse(Arrays.asList(arr));
		
		answer = String.join("", arr);
		System.out.println(answer);

		
		return answer;
	}
}
