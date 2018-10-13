package Transport;

public abstract class Nazemny_tr implements tr {
	@Override
	public void move() {	
	}
	@Override
	public void fill_up() {		
	}
	public static void main(String[] args){

	}
}
class Car extends Nazemny_tr {
	public void move() {	
		System.out.println("Би-би");
	}
	public void fill_up() {		
		System.out.println("Как машина без бензина?");
	}
    private String type,model;
    Car (String type){
    	this.type = type;
    }
   public static class Legkovaya extends Car{
	Legkovaya(String type) {
		super(type);
	    super.model = "Легковая машина";
	}
	public void move() {	
		System.out.println("Би-би");
	}
	public void fill_up() {		
		System.out.println("Как машина без бензина?");
	}
   }
	 public static class Gruzovaya extends Car{
			Gruzovaya (String type) {
				super(type);
			    super.model = "Грузовая машина";
			}
			public void move() {	
				System.out.println("Би-би");
			}
			public void fill_up() {		
				System.out.println("Как машина без бензина? Тем более грузовая");
			}
   }	
}
class Motocikol extends Nazemny_tr {
	public void move() {	
		System.out.println("Тр-тр");
	}
	public void fill_up() {		
		System.out.println("Бензина мне!");
	}
}
