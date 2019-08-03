package simplefactory;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLUtil {

	public static String getChartType() {
		try {
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			String path = System.getProperty("java.class.path");//»ñÈ¡binÂ·¾¶
			Document doc = builder.parse(new File(path+"\\simplefactory\\config.xml"));
//			Document doc = builder.parse(new File("D:\\springboot\\a creationalpattern simplefactory\\src\\simplefactory\\config.xml"));
			NodeList nl = doc.getElementsByTagName("chartType");
			Node classNode = nl.item(0).getFirstChild();
			String chartType = classNode.getNodeValue().trim();
			return chartType;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
