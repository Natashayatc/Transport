package Transport;

public abstract class Vozdysh_tr implements tr {
	@Override
	public abstract void move();
	@Override
	public abstract void fill_up();
	private String type;
 public static class Vertolet extends Vozdysh_tr { //��������� �����
	 public void move() {	
		 System.out.println("��������!!!");
		}
	 public void fill_up() {
		 System.out.println("������� ����, ����� �� �������!");
		}
	public Vertolet (){
		super.type = "��������";	
	}
	 
 }
 public static class Samolet extends Vozdysh_tr { //��������� �����
	 public void move() {	
		 System.out.println("��� ������?? ��������!");
		}
	 public void fill_up() {
		 System.out.println("������� ����, ����� �� �������!");
		}
	public Samolet (){
		super.type = "�������";	
	}
	 
 }
 public static class Dirizhabl extends Vozdysh_tr { //��������� �����
	 public void move() {	
		 System.out.println("��������!");
		}
	 public void fill_up() {
		 System.out.println("��������� ���� ����� ������");
		}
	public Dirizhabl (){
		super.type = "���������";	
	}
	 
 }
	
}

	


	
