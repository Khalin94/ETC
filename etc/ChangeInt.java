public class ChangeInt{
	public static void main(String[] args){

		ChangeInt ci = new ChangeInt();

		System.out.println(ci.solution("-1234"));
		System.out.println(ci.solution("1234"));


	}

	public int solution(String str){
		int answer = 0;
		
		answer = Integer.valueOf(str);


		return answer;
	}
}
