class HideNumberTest{
	public static void main(String[] args){

		hideNumber("027778888");
	}

	private static String hideNumber(String phoneNumber){
		String answer = "";
		
		for(int i=0; i<phoneNumber.length(); i++){
			char ch = phoneNumber.charAt(i);

			if(i < phoneNumber.length()-4){
				ch = '*';

				answer += ch;	
			}else{
				answer += ch;
			}
		}

		System.out.println(answer);

		return answer;
	}
}
