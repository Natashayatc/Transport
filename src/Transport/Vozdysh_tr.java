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

	


	
