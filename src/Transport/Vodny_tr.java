package Transport;

public abstract class Vodny_tr implements tr{
	@Override
	public void fill_up() {
	}
	@Override
	public void move() {
	}
	public static void main(String[] args){
	}
}
class sydno extends Vodny_tr{ // ���������� �����
	private Corpus Karkas = new Corpus("������","������");
    private class Corpus {
    	private String model, sostav;
    	private Corpus (String model, String sostav){
    		this.model = model;
    		this.sostav = sostav;
    	}
    }
  
	@Override
	public void fill_up() {
		 System.out.println("� ������� ����� � ���� ������");
	}

	@Override
	public void move() {
		System.out.println("�������!");
	}
}
	
class parom extends Vodny_tr{
		@Override
		public void fill_up() {
			 System.out.println("� ����� �� �������� ���� �� ��������");
		}

		@Override
		public void move() {
			System.out.println("���! �������!");
		}
		
	
}

