class Innerclass{
	public static void main(String args[]){
		Shoppingcart cart=new Shoppingcart();
		cart.add(cart.new Item());
		cart.add(cart.new Item("Cologne",1));
		cart.add(cart.new Item("biscuit",2));
		System.out.println(cart);
	}
}

class Shoppingcart{
	Item[] items;
	int capacity;
	int occupied;

	Shoppingcart(){
		capacity=10;
		occupied=0;
		items=new Item[capacity];
	}
	Shoppingcart(int x){
		this.capacity=x;
		this.occupied=0;
		items=new Item[capacity];
	}
	class Item{
		String name;
		int id;
		Item(){
			name="random";
			id=0;
		}
		Item(String name,int id){
			this.name=name;
			this.id=id;
		}
	}

	void add(Item item){
		if(occupied==capacity) return;
		items[occupied++]=item;
	}

	public String toString(){
		StringBuilder sb=new StringBuilder();
		for(Item item:this.items) if(item!=null) sb.append(item.name+"\n");
		return sb.toString();
	}
}
