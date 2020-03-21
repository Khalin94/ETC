class CollatzTest{
	public static void main(String[] args){

		System.out.println(Collatz(16));

	}

	private static int Collatz(int num){
		int answer=0;
		long lnum = Long.valueOf(num);

		while(lnum != 1){
			/*
			if(lnum % 2 == 0){
				lnum = lnum / 2;
				answer++;
			}else{
				lnum = lnum * 3 + 1;
				answer++;
			}
			*/

			lnum = (lnum%2==0) ? lnum/2 : lnum*3+1;
			answer++;

			if(answer == 500){
				return -1;
			}
		}

		return answer;
	}
}
