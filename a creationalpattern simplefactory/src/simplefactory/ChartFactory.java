package simplefactory;

public class ChartFactory {
	
	//��̬��������
	public static Chart getChart(String type) {
		Chart chart = null;
		if ("histogram".equals(type)) {
			chart = new HistogramChart();
		} else if ("pie".equals(type)) {
			chart = new PieChart();
		}
		return chart;
	}
	
}
