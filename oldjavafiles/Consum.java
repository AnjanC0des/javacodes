import java.util.function.Supplier;
import java.util.function.Consumer;

class Consum{
	public static void main(String args[]){
		Supplier<String> sup= ()-> "new String";
		Consumer<String> con=(String s)-> System.out.println(s);
		con.accept(sup.get());
	}
}
