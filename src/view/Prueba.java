package view;

import java.util.ArrayList;

import org.w3c.dom.Document;

import model.Time;

import model.Time;
import parser.DOMParserWeb;
import parser.WeatherMap;

public class Prueba {

	public static void main(String[] args) {

		WeatherMap weathermap = new WeatherMap();
		ArrayList<Time> times = weathermap.getTimes(); //llamar al array de la clase weathermap
		
		for (Time time:times) { //igualamos la variable de ambas clases e imprimimos el dia
			System.out.println(time);
		}


	}

}
