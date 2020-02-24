import java.util.*;
/*
문제 설명
array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.

제한사항
arr은 자연수를 담은 배열입니다.
정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
divisor는 자연수입니다.
array는 길이 1 이상인 배열입니다.
입출력 예
arr	divisor	return
[5, 9, 7, 10]	5	[5, 10]
[2, 36, 1, 3]	1	[1, 2, 3, 36]
[3,2,6]	10	[-1]
입출력 예 설명
입출력 예#1
arr의 원소 중 5로 나누어 떨어지는 원소는 5와 10입니다. 따라서 [5, 10]을 리턴합니다.

입출력 예#2
arr의 모든 원소는 1으로 나누어 떨어집니다. 원소를 오름차순으로 정렬해 [1, 2, 3, 36]을 리턴합니다.

입출력 예#3
3, 2, 6은 10으로 나누어 떨어지지 않습니다. 나누어 떨어지는 원소가 없으므로 [-1]을 리턴합니다.
*/
class divisorZeroTest{
	public static void main(String[] args){
		int arr[] = {2, 36, 1, 3};
					//{1,2,3,4};

		int[] ans = divisorZero(arr, 2);
		for(int i=0; i<ans.length; i++){
			System.out.println(ans[i]);
		}
	}

	public static int[] divisorZero(int[] arr, int divisor){
		//ArrayList를 사용한 방법 
		int[] answer ={};
		List<Integer> list = new ArrayList<>();

		

		for(int item : arr){
			if((item%divisor) == 0){
				list.add(item);
			}
		}

		if(list.isEmpty()) {
			answer = new int[1];
			answer[0] = -1;
			return answer;
		}

		//list.sort();
		Collections.sort(list);
		System.out.println("list Size : " + list.size());

		answer = new int[list.size()];
		for(int i=0; i <list.size(); i++){
			answer[i] = list.get(i);
		}

		return answer;

		/*
		// ArrayList를 사용하지 않고 구현한 방법
		int count = 0;
		for(int i=0; i<arr.length; i++){
			if((arr[i]%divisor) == 0){
				count++;
			}
		}
		System.out.println("count : " + count);

		int[] answer = count != 0 ? new int[count] : new int[1];

		if(count==0){
			answer[0] = -1;
			return answer;
		}

		int innerCount = 0;
		for(int i=0; i<arr.length;i++){
			if((arr[i]%divisor)==0){
				answer[innerCount] = arr[i];
				innerCount++;
			}
		}

		for(int i=0; i<answer.length; i++){
			for(int j=i; j<answer.length; j++){
				if(answer[i] > answer[j]){
					int temp = answer[i];
					answer[i] = answer[j];
					answer[j] = temp;
				}
			}
		}
		System.out.println("innerCount : " + innerCount);

		return answer;
		*/
	}
}
