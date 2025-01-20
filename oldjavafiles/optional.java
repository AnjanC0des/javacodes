import java.util.Optional;
import java.util.function.Consumer;
class Op{
	public static void main(String args[]){
		Optional<String> optional=Optional.ofNullable(null);
		optional.ifPresent(System.out::println);
		System.out.println(optional.orElse("not present"));
		optional=Optional.of("value");
		optional.ifPresent(System.out::println);
	}
}
