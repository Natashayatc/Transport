package Transport;

public abstract class Animals_tr implements tr{
	@Override
	public void move() {	
	}
	@Override
	public void fill_up() {		
	}
	public static void main(String[] args){
		
	}
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