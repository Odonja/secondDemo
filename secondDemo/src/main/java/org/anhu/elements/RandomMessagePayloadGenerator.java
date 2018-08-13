package org.anhu.elements;

import java.util.Random;

public class RandomMessagePayloadGenerator {
	private static final String[] addresses = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n",
			"o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };

	public static MessagePayload generateRandomMessage() {
		Random random = new Random();
		PositionValue[] positions = { new PositionValue("posX", random.nextDouble() * 100 - 50),
				new PositionValue("posY", random.nextDouble() * 100 - 50) };
		Tag tag = new Tag(random.nextInt(50), addresses[random.nextInt(23)], positions);
		return new MessagePayload(tag, "/feed/" + random.nextInt(26));
	}

}
