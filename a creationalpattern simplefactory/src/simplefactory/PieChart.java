package simplefactory;

public class PieChart implements Chart {
	
	public PieChart() {
		System.out.println("��ʼ����ͼ");
	}
	
	@Override
	public void display() {
		System.out.println("��ʾ��ͼ");
	}

}
