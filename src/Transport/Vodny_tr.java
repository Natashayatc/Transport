package Transport;

public abstract class Vodny_tr implements tr{
	@Override
	public void fill_up() {
		System.out.println("Кушать хочется и мне");
	}
	@Override
	public abstract void move();
	
}
class sydno extends Vodny_tr{ // внутренний класс
	private Corpus Karkas = new Corpus("Крутой","корпус");
    private class Corpus {
    	private String model, sostav;
    	private Corpus (String model, String sostav){
    		this.model = model;
    		this.sostav = sostav;
    	}
    }
  
	@Override
	public void fill_up() {
		 System.out.println("Я большое судно и хочу кушать");
	}

	@Override
	public void move() {
		System.out.println("Поплыли!");
	}
}
	
class parom extends Vodny_tr{
		@Override
		public void fill_up() {
			 System.out.println("И паром не поплывет пока не заправят");
		}

		@Override
		public void move() {
			System.out.println("Ура! Поплыли!");
		}
		
	
}

