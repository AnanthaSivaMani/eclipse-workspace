package com.watch.assignment;

public abstract class Watch extends Clock implements Alarm {
	
	public void minuteElapsed() {
		System.out.println("Watch.minuteElapsed()");
	}

	public void setAlarm() {
		System.out.println("Watch.setAlarm()");
	}
}
