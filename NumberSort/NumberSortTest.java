import java.util.*;

class NumberSortTest {
	public static void main(String[] args){

//		int[] test = {3, 30, 34, 5, 9};
//		int[] test = {10, 20, 40, 60};
		int[] test = {0, 0, 0, 0};

		System.out.println("answer : " + NumberSort(test));
		
	}

	
	private static String NumberSort(int[] numbers){
		String answer = "";
		String[] sNum = new String[numbers.length];
		
		//String형태로 바꿔중
		for(int i=0; i<sNum.length; i++){
			sNum[i] = String.valueOf(numbers[i]);
		}

		if(sNum[0].startsWith("0")){
			return "0";
		}
		/*
		//정렬
		for(int i=0; i<sNum.length; i++){
			for(int j=0; j<sNum.length-1; j++){
				String a = sNum[j] + sNum[j+1];
				String b = sNum[j+1] + sNum[j];
				//System.out.println ("a : " + a + "///" + "b : " + b);
				if(Integer.valueOf(a) < Integer.valueOf(b)){
					String temp = sNum[j];
					sNum[j] = sNum[j+1];
					sNum[j+1] = temp;
				}
			}
		}
		*/

		Arrays.sort(sNum, new Comparator<String>(){
			@Override
			public int compare(String o1, String o2){
				return (o2+o1).compareTo(o1+o2);
			}
		});

		for(String str : sNum){
			answer += str;
		}


		return answer;
	}

	
}

