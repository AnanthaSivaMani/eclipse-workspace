package com.watch.assignment;

public class DigitalWatch extends Watch implements StopWatch {

  public void minuteElapsed() {
	super.minuteElapsed();
  }

  public void setAlarm(String tone) {
	System.out.println("DigitalWatch.setAlarm()" + tone);
  }

  public void ringAlarm() {
	System.out.println("DigitalWatch.ringAlarm()");
  }

  public void hourElapsed() {
	System.out.println("DigitalWatch.hourElapsed()");
  }

  public void start() {
	System.out.println("DigitalWatch.start()");
  }

  public void pause() {
	System.out.println("DigitalWatch.pause()");
  }

  public void stop() {
	System.out.println("DigitalWatch.stop()");
  }

  public void lapTimer() {
	System.out.println("DigitalWatch.lapTimer()");
  }
}
