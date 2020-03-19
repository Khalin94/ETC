class StringBasic{
	public static void main(String[] args){
		
		solution("a1234");
		solution("a123");
		solution("1234");
		solution("123456");


	}

	public static boolean solution(String s) {
      boolean answer = true;
	  char[] chArr = new char[s.length()];
	  
	  if(s.length() == 4 || s.length() == 6){
	  	for(int i=0; i<s.length(); i++){
		  chArr[i] = s.charAt(i);
		  System.out.print("chArr["+i+"] : " + chArr[i]);

		  if((int)chArr[i] < 48 || (int)chArr[i] > 57){
			  answer = false;
			  System.out.println("숫자가 아닙니다!");
			  break;
	  		}
		}
	  }else{
		  answer = false;
		  System.out.println("문자열 범위가 잘못되었습니다.");
	  }
		System.out.println();

      return answer;
  }
}
