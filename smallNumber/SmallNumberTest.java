class SmallNumberTest{
	public static void main(String[] args){

		int[] test = {4,3,2,1};

		smallNumber(test);

	}
	private static int[] smallNumber(int[] num){

		for(int i : num){
			System.out.println(i);
		}

		return num;

	}
}
