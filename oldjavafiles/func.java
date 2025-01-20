import java.util.function.Function;
class Func{
	public static void main(String args[]){
		Function<Integer,Integer> f=(a)->(int) Math.pow(a,2); 
		Function<Integer,Double> g=(a)->Math.sqrt(a);
		System.out.println(f.andThen(g).apply(12));
	}
}
