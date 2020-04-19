class RecursionTest{
	public static void main(String[] args){
		func(4);
		int result = funcToN(4);
		System.out.println(result);

		int factorialResult = factorial(4);
		boolean isBoolean = 24 == factorialResult;
		System.out.println("factorialResult is 24 : " + isBoolean);

		int powerResult = power(4, 10);
		System.out.println("power Result : " + powerResult);

		int fibonacciResult = fibonacci(4);
		System.out.println("fibonacci Result : "+ fibonacciResult);
	}

//	재귀 호출을 하며  n 의 수 만큼 Hello World! 출력
	private static void func(int n){
		if(n <= 0){
			return;
		}else{
			System.out.println("Hello World!");
			func(n-1);
		}
	}

	// 1 ~ n까지 더하기
	private static int funcToN(int n){
		if(n <= 0){
			return 0;
		}else{
			return n+funcToN(n-1);
		}
	}	

//	factorial 
	private static int factorial(int n){
		if(n==0){
			return 1;
		}else{
			return n*factorial(n-1);
		}
	}
	// power
	private static int power(int x, int n){
		if(x <= 0){
			return 1;
		}else{
			return n*power(x-1, n);
		}
	}

	// fibonacci
	private static int fibonacci(int n){
		if(n<2){
			return n;
		}else{
			return fibonacci(n-1)+fibonacci(n-2);
		}
	}
}
