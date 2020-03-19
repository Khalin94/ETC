class StrangeLetterTest{
	public static void main(String[] args){

		StrangeLetter("abcd adc des htg dsc reggv afecasdc");

	}

	private static String StrangeLetter(String str){
		String answer = "";
		/*
		int count = 0;

		for(int i=0; i<str.length(); i++){
			char ch = str.charAt(i);
			int a = (int) ch;

			if(ch == ' '){
//				answer += str.charAt(i);
				answer += ch;
				count = 0;
			}else if(ch != ' '){
				if(count%2 == 0){
					answer += str.toUpperCase().charAt(i);
					count++;
				}else{
					answer += ch;
					count++;
				}
			}
		}

		System.out.println(answer);
*/
		String[] arr = str.split("");
		int count = 0;

		for(String s : arr){
			count = s.contains(" ") ? 0 : count + 1;
			answer += count%2==0 ? s.toLowerCase() : s.toUpperCase();
		}

		System.out.println(answer);
		return answer;

	}
}


