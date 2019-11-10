package by.ad.les09_10.bean;
public class Airline {
	private String destin;
	private int numberAir;
	private String type;
	private String time;
	private String day;
	
	
	
	
	
	
	public Airline() {
		this.destin="";
		this.numberAir=0;
		this.type="";
		this.time="";
		this.day="";
	}
	public Airline (String destin,int numberAir,String type,String time,String day) {
		this.destin=destin;
		this.numberAir=numberAir;
		this.type=type;
		this.time=time;
		this.day=day;
	}
	
	public String getDestin() {
		return destin;
	}
	public void setDestin(String destin) {
		this.destin = destin;
	}
	public int getNumberAir() {
		return numberAir;
	}
	public void setNumberAir(int numberAir) {
		this.numberAir = numberAir;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	@Override
	public String toString() {
		return "Airline [destin=" + destin + ", numberAir=" + numberAir + ", type=" + type + ", time=" + time + ", day="
				+ day + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((day == null) ? 0 : day.hashCode());
		result = prime * result + ((destin == null) ? 0 : destin.hashCode());
		result = prime * result + numberAir;
		result = prime * result + ((time == null) ? 0 : time.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Airline other = (Airline) obj;
		if (day == null) {
			if (other.day != null)
				return false;
		} else if (!day.equals(other.day))
			return false;
		if (destin == null) {
			if (other.destin != null)
				return false;
		} else if (!destin.equals(other.destin))
			return false;
		if (numberAir != other.numberAir)
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	
	
	
	
}
