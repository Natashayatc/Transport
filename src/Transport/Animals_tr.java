package Transport;

public abstract class Animals_tr implements tr{
	@Override
	public abstract void move(); 
	@Override
	public abstract void fill_up() ;
	
}
class Verhov extends Animals_tr {
	public void move() {
		System.out.println("Тык-дык,тык-дык");
	}
	public void fill_up() {		
		System.out.println("Животным тоже нужна заправка в виде еды");
	}
}
class Vychnyu extends Animals_tr {
	public void move() {
		System.out.println("Тык-дык,тык-дык");
	}
	public void fill_up() {		
		System.out.println("Животным тоже нужна заправка в виде еды, а как ты хотел?");
	}
}