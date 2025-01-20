import java.util.function.Supplier;
class Person{
	String name;
	int age;
	Person(){
		this.name="Random";
		this.age=10;
	}
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	public String toString(){
		return this.name+" "+this.age;
	}
}
class Supp{
	public static void main(String args[]){
		Supplier<Person> personS= Person::new;
		System.out.println(personS.get());
	}
}


