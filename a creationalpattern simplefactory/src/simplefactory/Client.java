package simplefactory;

public class Client {

	public static void main(String[] args) {
//		String chartType = "histogram";
		String chartType = XMLUtil.getChartType();// ��ȡ�����ļ��еĲ���
		Chart chart = ChartFactory.getChart(chartType); // ͨ����̬��������������Ʒ
		chart.display();
	}

}
