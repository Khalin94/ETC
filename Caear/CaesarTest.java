class CaesarTest{
	public static void main(String[] args){
		System.out.println("caesar : " + caesar("a B z", 25));
		char z = 'A';
		System.out.println((int)z);
		//a 97 z 122
		//A 65 Z 90
		System.out.println((char)96);
	}

	private static String caesar(String s, int n){
		String answer = "";

		for(int i=0; i <s.length(); i++){
			int tmp = s.charAt(i);
			if(tmp == 32){
				tmp = 32;
			}else if(tmp == 122){
				tmp = 96+n;
				System.out.println("zzzzzz : " + (char)tmp);
			}
			else{
				tmp += n;
			}
			char charTmp = (char)tmp;
			
			System.out.println("int : " + tmp + " char : " + charTmp);

			answer += charTmp;
		}
		return answer;	
	}
}
