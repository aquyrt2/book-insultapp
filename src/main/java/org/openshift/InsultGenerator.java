package org.openshift;

import java.util.Random;

public class InsultGenerator {
	public String generateInsult() {
		String words[][] = {{"domme", "luie", "dikke"}, {"gedachtenloze", "bodemloze", "vervelende"}, {"Eikel", "Klootzak", "Zakkenwasser"}};
		String article = "een";
		String firstAdjective = words[0][new Random().nextInt(words[0].length)];
		String secondAdjective = words[1][new Random().nextInt(words[1].length)];
		String noun = words[2][new Random().nextInt(words[2].length)];
		return String.format("Jij bent %s %s %s %s!", article, firstAdjective, secondAdjective, noun);
	}

}
