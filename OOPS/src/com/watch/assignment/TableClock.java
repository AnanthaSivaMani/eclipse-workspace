package com.watch.assignment;

public class TableClock extends Clock implements Alarm {

	public void minuteElapsed() {
		System.out.println("TableClock.minuteElapsed()");
	}

	public void hourElapsed() {
		System.out.println("TableClock.hourElapsed()");
	}

	public void setAlarm() {
		System.out.println("TableClock.setAlarm()");
	}

	public void ringAlarm() {
		System.out.println("TableClock.ringAlarm()");
	}
}
