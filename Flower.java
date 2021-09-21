class Flower{
	String name;
	String color;
	int NoOfPetals;
	void bloom(){
		System.out.println(color+" "+name+" "+"is blooming......!");

	}
	void ShedFragrance(){
		System.out.println(color+" "+name+" "+"is shedding fragrance....!");

	}
	public static void main(String args[]){
Flower rose=new Flower();
rose.name="Rose";
rose.color="yellow";
rose.NoOfPetals=16;
rose.bloom();
rose.ShedFragrance();

	}
}