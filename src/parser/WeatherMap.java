package parser;

import java.util.ArrayList;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import model.Time;

public class WeatherMap {
	ArrayList<Time> times;

	public  WeatherMap() {
		DOMParserWeb parser = new DOMParserWeb("http://api.openweathermap.org/data/2.5/forecast?q=Toledo,es&mode=xml&APPID=601c9db344b44f9774ef76a4c07979b1&lang=sp"); 
		Document doc = parser.getDocumento();
		Element eleForecast = (Element)doc.getElementsByTagName("forecast").item(0);
		NodeList nodostimes = eleForecast.getElementsByTagName("time");
		
		times = new ArrayList<Time>();
		
		for (int i=0;i<nodostimes.getLength();i++) {
			Element nodostime = (Element)nodostimes.item(i);
			Time time = new Time();
			time.setFrom(nodostime.getAttribute("from"));  
			time.setTo(nodostime.getAttribute("to"));
			Element eleestadocielo = (Element) nodostime.getElementsByTagName("clouds").item(0);
			time.setProno(eleestadocielo.getAttribute("value"));
			Element icono = (Element) nodostime.getElementsByTagName("symbol").item(0);
			time.setIcono(icono.getAttribute("var"));
			Element preci = (Element) nodostime.getElementsByTagName("precipitation").item(0);
			time.setPreci(preci.getAttribute("probability"));
			Element eletemp= (Element)nodostime.getElementsByTagName("temperature").item(0);
			time.setMax(eletemp.getAttribute("max"));
			time.setMin(eletemp.getAttribute("min"));			
			times.add(time);
		}

	}
	
	public ArrayList<Time> getTimes() {
		return times;
	}

}
