public class SumAplusB{
	public static void main(String[] args){
		System.out.println(solution(3, 5));
		System.out.println(solution(4, 4));
		System.out.println(solution(5, 3));

		
	}

	public static long solution(int a, int b){
		long answer = 0;

		if(a > b){
			int temp = 0;
			temp = a;
			a = b;
			b = temp;
		}

		if(a != b){
			for(int i=a; i <=b ; i++){
				answer = answer + i;
			}
		}else{
			answer = a;
		}
		return answer;
	}
}
