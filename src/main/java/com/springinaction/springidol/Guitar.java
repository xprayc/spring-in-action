package com.springinaction.springidol;

import org.springframework.stereotype.Component;

@StringedInstrument
@Component
public class Guitar implements Instrument {

	@Override
	public void play() {
		System.out.println("guitar");
	}

}
