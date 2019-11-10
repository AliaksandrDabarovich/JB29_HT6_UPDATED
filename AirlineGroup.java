package by.ad.les09_10.bean;
import java.util.List;
import java.util.ArrayList;

public class AirlineGroup {

	private List<Airline> airlineList;
	
	public AirlineGroup() {
		airlineList=new ArrayList <Airline>();
	}

	public List<Airline> getAirlineList() {
		return airlineList;
	}

	public void setAirlineList(List<Airline> airlineList) {
		this.airlineList = airlineList;
	}
	
	public void addAirline(Airline air) {
		this.airlineList.add(air);
	}

	@Override
	public String toString() {
		return "AirlineList [airlineList=" + airlineList + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((airlineList == null) ? 0 : airlineList.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AirlineGroup other = (AirlineGroup) obj;
		if (airlineList == null) {
			if (other.airlineList != null)
				return false;
		} else if (!airlineList.equals(other.airlineList))
			return false;
		return true;
	}
	
	
	
	
}
