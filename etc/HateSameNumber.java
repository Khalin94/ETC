import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

class HateSameNumber{
	public static void main(String[] args){

		int[] arr = {1,1,3,3,0,1,1};

		HateSameNumber hsn = new HateSameNumber();
		System.out.println(hsn.solution(arr));

	}

	public int[] solution(int[] arr){

		List<Integer> list = new ArrayList<>();
		int current = 10;
		
		for(int i=0; i<arr.length; i++){
			if(arr[i] != current){
				list.add(arr[i]);
				current = arr[i];
			}
		}

		int[] answer = new int[list.size()];

		for(int i=0; i <list.size(); i++){
			answer[i] = list.get(i);
		}

		for(int i=0; i<answer.length; i++){
			System.out.println(answer[i]);
		}


		return answer;
	}
}
