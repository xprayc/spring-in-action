package com.springinaction.springidol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("eddie")
public class Instrumentalist implements Performer {

	public Instrumentalist() {
	}

	@Override
	public void perform() throws PerformanceException {
		System.out.println("Playing <" + song + "> : ");
		instrument.play();
	}

	@Value("#{systemProperties['os.name']}")
	private String song;

	public void setSong(String song) {
		this.song = song;
	}

	public String getSong() {
		return song;
	}

	@Autowired
	@StringedInstrument
	private Instrument instrument;

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

}
