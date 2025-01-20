import java.util.Comparator;
class  Person{
	int age;
	Person(int age){
		this.age=age;
	}
}
class Comp{
	public static void main(String args[]){
		Comparator<Person> comp=(a,b)-> b.age>=a.age?1:-1;
		Person p=new Person(5),q= new Person(7);
		System.out.println(comp.compare(p,q));
		System.out.println(comp.reversed().compare(p,q));
	}
}
