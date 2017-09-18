package com.watch.assignment;

public interface Ticking {
	
	int factor = 60;

	void tick();

	void minuteElapsed();

	void hourElapsed();
}
