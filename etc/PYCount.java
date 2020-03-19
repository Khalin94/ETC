class PYCount{
	public static void main(String[] args){

		String str = "pPoooyY";
		String str2 = "Pyy";

		if(solution(str) == true){
			System.out.println("true");
		}else{
			System.out.println("false");
		}

		if(solution(str2) == true){
			System.out.println("true");
		}else{
			System.out.println("false");
		}

	}

	public static boolean solution(String str){

		char[] ch = new char[str.length()];
		int pCount=0;
		int yCount=0;

		for(int i=0; i<str.length(); i++){
			ch[i] = str.charAt(i);
		}

		for(int i=0; i<ch.length; i++){
			if(ch[i] == 'p' || ch[i] == 'P'){
				pCount++;
			}
			if(ch[i] == 'y' || ch[i] == 'Y'){
				yCount++;
			}
		}

		if(pCount == yCount){
			return true;
		}else{
			return false;
		}

	}
}
