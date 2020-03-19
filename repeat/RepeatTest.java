class RepeatTest{
	public static void main(String[] args){

		repeat(6);
	}

	private static String repeat(int n){
		String answer = "";
/*
		if(n %2 == 0){
			for(int i=0; i < n/2; i++){
				answer+= "수박";
			}
		}else{
			for(int i=0; i < n; i++){
				answer += "수박";
			}
		}
		
		if(n % 2 != 0){
			answer = answer.substring(0, n);
		}

		System.out.println(answer);
		*/

		for(int i=0; i<n; i++){
			answer += (i % 2 == 0) ? "수" : "박";
		}
		
		System.out.println(answer);
		return answer;
	}
}
