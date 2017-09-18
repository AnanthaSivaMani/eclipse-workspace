package com.watch.assignment;

public abstract class Clock implements Ticking {
	
	public void tick() {
		System.out.println("Clock.tick()");
	}
}
