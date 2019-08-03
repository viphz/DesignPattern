package simplefactory;

public class Client {

	public static void main(String[] args) {
//		String chartType = "histogram";
		String chartType = XMLUtil.getChartType();// 读取配置文件中的参数
		Chart chart = ChartFactory.getChart(chartType); // 通过静态工厂方法创建产品
		chart.display();
	}

}
