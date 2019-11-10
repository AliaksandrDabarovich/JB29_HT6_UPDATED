package by.ad.les09_4.bean;

public class Train {
	private String punkt;
	private int num;
	private int time;
	private int minutes;

	public Train(String punkt, int num, int time, int minutes) {
		this.punkt = punkt;
		this.num = num;
		this.time = time;
		this.minutes = minutes;
	}

	public int getNum() {
		return num;
	}

	public String getPunkt() {
		return punkt;
	}

	public int getTime() {
		return time;
	}

	public int getMin() {
		return minutes;
	}

	@Override
	public String toString() {
		return "Train [punkt=" + punkt + ", num=" + num + ", time=" + time + ", minutes=" + minutes + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + minutes;
		result = prime * result + num;
		result = prime * result + ((punkt == null) ? 0 : punkt.hashCode());
		result = prime * result + time;
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
		Train other = (Train) obj;
		if (minutes != other.minutes)
			return false;
		if (num != other.num)
			return false;
		if (punkt == null) {
			if (other.punkt != null)
				return false;
		} else if (!punkt.equals(other.punkt))
			return false;
		if (time != other.time)
			return false;
		return true;
	}

}
