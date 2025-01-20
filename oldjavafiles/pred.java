import java.util.function.Predicate;
class Pred{
	public static void main(String args[]){
		Predicate<String> newpred= (a)-> a.length()>2;
		Predicate<String> newpred2= (a)-> a.length()>3;
		System.out.println(newpred.test("ay hello"));
		System.out.println(newpred.negate().test("ay hello"));
		System.out.println(newpred.and(newpred2).test("ay hello"));
		System.out.println(newpred.and(newpred2).test("a"));
	}
}
