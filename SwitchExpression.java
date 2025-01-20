class SwtichExpression{
	public static void main(String args[]){
		int value=Integer.parseInt(args[0]);
		String ans=switch(value){
			case 1  -> "the value is 1";
			case 2  -> "the value is 2";
			default -> "not 1 or 2";
		};
		System.out.println(ans);
	}
}
