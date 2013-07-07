package com.springinaction.knights;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;

import com.springinaction.knights.BraveKnight;
import com.springinaction.knights.Quest;
import com.springinaction.knights.QuestException;

public class BraveKnightTest {

	@Test
	public void knightShouldEmarkOnQuest() throws QuestException {
		Quest mockQuest = mock(Quest.class);

		BraveKnight knight = new BraveKnight(mockQuest);
		knight.embarkOnQuest();

		verify(mockQuest, times(1)).embark();
	}

}
