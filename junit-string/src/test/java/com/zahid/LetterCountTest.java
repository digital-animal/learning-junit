package com.zahid;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LetterCountTest {

	@Test
    @DisplayName("Letter Count Test")
	void test() {
		LetterCount t1 = new LetterCount();
		int output = t1.countLetter("Alphabet");
		assertEquals(8, output);
	}
}