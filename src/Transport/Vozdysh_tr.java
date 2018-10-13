package Transport;

public abstract class Vozdysh_tr implements tr {
	@Override
	public void move() {	
	}
	@Override
	public void fill_up() {		
	}
	public static void main(String[] args){
		
	}
	private String type;
 public static class Vertolet extends Vozdysh_tr { //вложенный класс
	 public void move() {	
		 System.out.println("Полетели!!!");
		}
	 public void fill_up() {
		 System.out.println("Заправь меня, иначе не полетим!");
		}
	public Vertolet (){
		super.type = "Вертолет";	
	}
	 
 }
 public static class Samolet extends Vozdysh_tr { //вложенный класс
	 public void move() {	
		 System.out.println("Все готовы?? Полетели!");
		}
	 public void fill_up() {
		 System.out.println("Заправь меня, иначе не полетим!");
		}
	public Samolet (){
		super.type = "Самолет";	
	}
	 
 }
 public static class Dirizhabl extends Vozdysh_tr { //вложенный класс
	 public void move() {	
		 System.out.println("Полетели!");
		}
	 public void fill_up() {
		 System.out.println("Дирижабль тоже хочет кушать");
		}
	public Dirizhabl (){
		super.type = "Дирижабль";	
	}
	 
 }
	
}

	


	
