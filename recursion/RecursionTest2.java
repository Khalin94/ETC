class RecursionTest2{
	public static void main(String[] args){
		String str = "abcdefg";

		System.out.println("abcdefg length : " + stringLength(str));

		System.out.println("======================");

		printString(str);

		System.out.println("======================");

		reversePrint(str);

		System.out.println("======================");

		binaryPrint(20);

		System.out.println("=========");

		int[] arr = {1,2,3,4};

		System.out.println(arraySub(3, arr));

	}

	//문자열 길이 계산
	private static int stringLength(String str){
		if(str.equals("")){
			return 0;
		}else{
			return 1+stringLength(str.substring(1));	
		}
	}
	//문자열 프린트
	private static void printString(String str){
		if(str.length() == 0){
			System.out.println();
			return;
		}else{
			System.out.print(str.charAt(0));
			printString(str.substring(1));
		}
	}

	//문자열 뒤집기
	private static void reversePrint(String str){
		if(str.length() == 0){
			System.out.println();
			return;
		}else{
			reversePrint(str.substring(1));
			System.out.print(str.charAt(0));
		}
	}

	//이진수 변환
	private static void binaryPrint(int n){
		if(n < 2){
			System.out.print(n);
		}else{
			binaryPrint(n/2);
			System.out.print(n%2);
		}
	}

	//data배열에서 n번째 까지더하기
	private static int arraySub(int n, int[] data){
		if(n <= 0){
			return 0;
		}else{
			return arraySub(n-1, data) + data[n-1];
		}
	}
}
