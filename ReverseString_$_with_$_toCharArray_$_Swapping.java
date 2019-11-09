class ReverseString_$_with_$_toCharArray_$_Swapping{
	public static void main(String[] args) {
		String input = "PreetiKant";
		char[] temporary = input.toCharArray();
		int left,right=0;
		right = temporary.length-1;
		for (left=0;left<right ;left++,right--){
			//swapping right and left values with each other
			char temp = temporary[right];
			temporary[right]=temporary[left];
			temporary[left]= temp;
		}
		for (char c : temporary ) {
			System.out.print(c);

		}
	}
}