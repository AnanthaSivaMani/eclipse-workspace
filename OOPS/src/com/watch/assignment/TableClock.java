package com.watch.assignment;

/**
 * .
 *
 * @author vamsoft.
 *
 */
public class TableClock extends Clock implements Alarm {

	/*
	 * (non-Javadoc).
	 *
	 * @see com.watch.assignment.Ticking#minuteElapsed().
	 */
	@Override
	public void minuteElapsed() {
		System.out.println("TableClock.minuteElapsed()");
	}

	/*
	 * (non-Javadoc).
	 *
	 * @see com.watch.assignment.Ticking#hourElapsed().
	 */
	@Override
	public void hourElapsed() {
		System.out.println("TableClock.hourElapsed()");
	}

	/*
	 * (non-Javadoc).
	 *
	 * @see com.watch.assignment.Alarm#setAlarm().
	 */
	@Override
	public void setAlarm() {
		System.out.println("TableClock.setAlarm()");
	}

	/*
	 * (non-Javadoc).
	 *
	 * @see com.watch.assignment.Alarm#ringAlarm().
	 */
	@Override
	public void ringAlarm() {
		System.out.println("TableClock.ringAlarm()");
	}
}
