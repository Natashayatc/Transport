package Transport;

public abstract class Animals_tr implements tr{
	@Override
	public abstract void move(); 
	@Override
	public abstract void fill_up() ;
	
}
class Verhov extends Animals_tr {
	public void move() {
		System.out.println("���-���,���-���");
	}
	public void fill_up() {		
		System.out.println("�������� ���� ����� �������� � ���� ���");
	}
}
class Vychnyu extends Animals_tr {
	public void move() {
		System.out.println("���-���,���-���");
	}
	public void fill_up() {		
		System.out.println("�������� ���� ����� �������� � ���� ���, � ��� �� �����?");
	}
}