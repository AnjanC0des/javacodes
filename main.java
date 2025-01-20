import java.util.ArrayList;
import java.util.List;
interface F{
	double calculate(int a);
	default double sqrt(int a){
		return Math.sqrt(a);
	}
}
class NewClass{
	static double dostuff(int a){
		return Math.pow(a,3);
	}
}
class Dumdum{
	String name;
	int age;
	Dumdum(){
		this.name="Dum Name";
		this.age=18;
	}
	Dumdum(String name,int age){
		this.name=name;
		this.age=age;
	}
	public String toString(){
		return this.name+" "+this.age;
	}
}
interface Ex<D extends Dumdum>{
	D create(String name,int age);
}
class Main{
	int variable;
	static int staticvariable;
	public static void main(String args[]){
		F fobj=(int a)->Math.pow(a,2);
		System.out.println(fobj.calculate(10));
		System.out.println(fobj.sqrt(16));

		ArrayList<String> arr=new ArrayList<>(List.of("a","bcas","cdfadfadf"));
		arr.sort((a,b)-> b.length()>=a.length()?1:-1);
		System.out.println(arr.toString());

		F obj=  Math::sqrt;
		System.out.println(obj.calculate(100));

		F newobj= NewClass::dostuff;
		System.out.println(newobj.calculate(3));

		Ex<Dumdum> dumobj=Dumdum::new;
		Dumdum d=dumobj.create("Sloth",21);
		System.out.println(d.toString());

		int num=1;
		F abcd= (a)->num+a;
		System.out.println(abcd.calculate(10));
		Main mainobj=new Main();
		mainobj.test();
	}

	void test(){

		F varaccess=(a)->{
			variable=15;
			System.out.println(variable);
			return (double) a;
		};

		F staticvaraccess=(a)->{
			staticvariable=25;
			System.out.println(staticvariable);
			return (double) a;
		};

		varaccess.calculate(10);
		staticvaraccess.calculate(20);
	}
}
