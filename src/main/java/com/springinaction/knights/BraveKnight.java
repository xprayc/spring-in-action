package com.springinaction.knights;

public class BraveKnight implements Knight {
	private Quest quest;
	
	public BraveKnight(Quest quest) {
		this.quest = quest;
	}
	
	/* (non-Javadoc)
	 * @see org.springinaction.chapter1.Knight#embarkOnQuest()
	 */
	@Override
	public void embarkOnQuest() throws QuestException {
		quest.embark();
	}
}
