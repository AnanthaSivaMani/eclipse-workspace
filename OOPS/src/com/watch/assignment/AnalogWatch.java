package com.watch.assignment;

public class AnalogWatch extends Watch {
	
	public void setAlarm() {
		super.setAlarm();
	}

	public void ringAlarm() {
		System.out.println("AnalogWatch.ringAlarm()");
	}

	public void minuteElapsed() {
		super.minuteElapsed();
		System.out.println("AnalogWatch.minuteElapsed()");
	}

	public void hourElapsed() {
		System.out.println("AnalogWatch.hourElapsed()");
	}
}
