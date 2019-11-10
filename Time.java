package by.ad.les09_6.bean;

public class Time {
	private int sec;
	private int min;
	private int hour;

	public Time() {
		sec = 0;
		min = 0;
		hour = 0;
	}

	public Time(int hour, int min, int sec) {
		if (sec < 59 && sec > 0) {
			this.sec = sec;
		} else {
			this.sec = 0;
		}
		if (min < 59 && min > 0) {
			this.min = min;
		} else {
			this.min = 0;
		}
		if (hour < 59 && hour > 0) {
			this.hour = hour;
		} else {
			this.hour = 0;
		}
	}

	public int getSec() {
		return sec;
	}

	public void setSec(int sec) {
		if (sec < 59 && sec > 0) {
			this.sec = sec;
		} else {
			this.sec = 0;
		}
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		if (min < 59 && min > 0) {
			this.min = min;
		} else {
			this.min = 0;
		}

	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if (hour < 59 && hour > 0) {
			this.hour = hour;
		} else {
			this.hour = 0;
		}
	}

	@Override
	public String toString() {
		return "Time [hour=" + hour + ", min=" + min + ", sec=" + sec + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hour;
		result = prime * result + min;
		result = prime * result + sec;
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
		Time other = (Time) obj;
		if (hour != other.hour)
			return false;
		if (min != other.min)
			return false;
		if (sec != other.sec)
			return false;
		return true;
	}
}
