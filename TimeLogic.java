package by.ad.les09_6.logic;

import by.ad.les09_6.bean.Time;

public class TimeLogic {
	public void setTime(int hour, int min, int sec, Time time) {
		if (sec < 59 && sec > 0) {
			time.setSec(sec);
		} else {
			time.setSec(0);
		}
		if (min < 59 && min > 0) {
			time.setMin(min);
		} else {
			time.setMin(0);
		}
		if (hour < 59 && hour > 0) {
			time.setHour(hour);
		} else {
			time.setHour(0);
		}
	}

	@Override
	public String toString() {
		return "TimeLogic [toString()=" + super.toString() + "]";
	}
}
