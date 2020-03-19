public class tower{
	public static void main(String[] args){
		tower t = new tower();

		int[] height = {6,9,5,7,4};

		int[] returnVal = t.solution(height);

		for(int i=0; i<height.length; i++){
			System.out.print(returnVal[i] + ", ");
		}

	}

	public int[] solution(int[] height){
		
		int[] returnVal = new int[height.length];

		for(int i=0; i<height.length; i++){
			try{
			if(height[i] < height[i+1]){
				returnVal[i] = 0;
				System.out.print("solution : " + height[i]);
			}else{
				returnVal[i] = i;
				System.out.print("eSolution : " + height[i]);
			}
			System.out.println();
			}
			catch(ArrayIndexOutOfBoundsException e){
				break;
			}
		}
		return returnVal;
	}
}
