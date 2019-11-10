package by.ad.les09_10.main;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import by.ad.les09_10.bean.*;
import by.ad.les09_10.logic.*;
import java.time.LocalTime;


import java.time.LocalTime;


/*
 * 10. Создать класс Airline, спецификация которого приведена ниже. 
 * Определить конструкторы, set- и get- методы и метод  toString(). 
 * Создать второй класс, агрегирующий массив типа Airline, 
 * с подходящими конструкторами и методами. Задать критерии выбора 
 * данных и вывести эти данные на консоль.  Airline: пункт назначения,
 *  номер рейса, тип самолета, время вылета, дни недели.  Найти и вывести:
 *    a) список рейсов для заданного пункта назначения; 
 *     b) список рейсов для заданного дня недели; 
 *      c) список рейсов для заданного дня недели, время вылета для 
 *      которых больше заданного. 
 */
public class Runner10 {

	public static void main(String[] args) {
		
		
		Airline air1=new Airline("Минск", 11, "пассажирский", "05:30","Monday");
		Airline air2=new Airline("Москва", 22, "пассажирский", "07:30","Tuesday");
		Airline air3=new Airline("Нью-Йорк", 21, "грузовой", "15:00","Wednesday");
		Airline air4=new Airline("Лиссабон", 25, "пассажирский", "18:00","Friday");
		
		AirlineGroup airlist1=new AirlineGroup();
		List <Airline> List2=airlist1.getAirlineList();
	    
	    AirlineListLogic log1=new AirlineListLogic();
		airlist1.addAirline(air1);
		airlist1.addAirline(air2);
		airlist1.addAirline(air3);
		airlist1.addAirline(air4);
		
		
	    System.out.println(airlist1);
	    
	    System.out.println("--------------------------------");
	    
	    log1.destination(List2,"Лиссабон");
	    System.out.println("--------------------------------");
	    log1.day(List2, "Tuesday");
	    System.out.println("--------------------------------");
	    log1.dayTime(List2, "Monday","05:30");
	    
	}

}
