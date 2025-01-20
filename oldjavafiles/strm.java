import java.util.ArrayList;
import java.util.Optional;
class Strm{
	public static void main(String args[]){
		ArrayList<Integer> arr=new ArrayList<>();
		for(int i=0;i<20;i++) arr.add((int)(Math.random()*100));
/*		arr
			.stream()
			.forEach(System.out::println);
		System.out.println("-----------");
		arr
			.stream()
			.filter((i)-> i>50)
			.forEach(System.out::println); */

/*		arr
			.stream()
			.sorted()
			.filter((i)-> i%2==0)
			.forEach(System.out::println);*/

/*		arr
			.stream()
			.sorted()
			.map(String::valueOf)
			.forEach((i)->System.out.println("-"+i+"-"));*/

/*		System.out.println(
			arr
			.stream()
			.map(String::valueOf)
			.anyMatch((i)-> i.length()==1));*/

		
/*		System.out.println(
			arr
			.stream()
			.filter((i)->i>=50)
			.count());*/

		
		Optional<Integer> op=
			arr
			.stream()
			.filter((i)->i>=50)
			.peek(System.out::println)
			.reduce((i,j)->i+j);		

		op.ifPresent(System.out::println);
	}
}
