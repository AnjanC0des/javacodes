class CovariantExample{
	static class Animal{
		boolean brain;
		Animal(){
			this.brain=false;
		}
		Animal(boolean brain){
			this.brain=brain;
		}
		static Animal get(){
			return new Animal();
		}
		static Animal get(boolean val){
			return new Animal(val);
		}
		public String toString(){
			return "Animal has "+(this.brain?"a":"no")+" brain\n";
		}
	}

	static class Human extends Animal{
		Human(){
			super();
		}
		Human(boolean val){
			this.brain=val;
		}
		static Human get(){
			return new Human();
		}
		public String toString(){
			return "Human has "+(this.brain?"a":"no")+" brain\n";
		}
		
	}
	public static void main(String args[]){
		Animal a=new Animal(true);
		Animal b=Animal.get();
		Human c=new Human(true);
		Human d= Human.get();
		System.out.printf("%s%s%s%s",a,b,c,d);
	}
}
