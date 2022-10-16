//stereo type annotation

package com.rspc.cab.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rspc.cab.eng.Engine;

@Component
public class Car {

	@Autowired
	private Engine engine;
	
	public void show()
	{
		System.out.println("Engine Name: "+engine.getEngName());
	}
	
}
