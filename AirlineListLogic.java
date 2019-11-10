package by.ad.les09_10.logic;
import by.ad.les09_10.bean.*;
import java.time.LocalTime;

import java.util.List;
public class AirlineListLogic {

	public void destination(List<Airline> list1, String destin) {
		for (Airline air : list1) {
			if(air.getDestin()==destin) {
				System.out.println(air);
			} 
		}
		
	}
	public void day(List<Airline> list1, String day) {
		for (Airline air : list1) {
			if(air.getDay()==day) {
				System.out.println(air);
			} 
		}
		
	}
	public void dayTime(List<Airline> list1, String day, String time) {
		LocalTime local2 = LocalTime.parse(time);
		
		for (Airline air : list1) {
			LocalTime local1 = LocalTime.parse(air.getTime());
			
			
			if(air.getDay()==day && local1.isAfter(local2)) {
				System.out.println(air);
			} 
		}
		
	}
	
	
}
