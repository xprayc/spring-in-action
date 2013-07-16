package com.springinaction.springidol;

import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("keyboard")
public class Piano implements Instrument {

	@Override
	public void play() {
		System.out.println("PLINK PLINK PLINK");
	}

}
