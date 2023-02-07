package com.company.SummativeProject;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.company.SummativeProject.models.Answer;
import com.company.SummativeProject.models.Definition;
import com.company.SummativeProject.models.Quote;


import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SummativeProjectApplicationTests {

	@Test
	void testQuote() {
		Quote quote = new Quote(1, "author", "quote");
		assertEquals(1, quote.getId());
		assertEquals("author", quote.getAuthor());
		assertEquals("quote", quote.getQuote());

		Quote quote2 = new Quote(2, "author2", "quote2");
		assertEquals(2, quote2.getId());
		assertEquals("author2", quote2.getAuthor());
		assertEquals("quote2", quote2.getQuote());

		//Change quote 2 to quote 1
		quote2.setId(1);
		quote2.setAuthor("author");
		quote2.setQuote("quote");

		//Check that quote 2 is now quote 1
		assertEquals(quote, quote2);
	}

	@Test
	void testAnswer() {
		Answer answer = new Answer(1, "question", "answer");
		assertEquals(1, answer.getId());
		assertEquals("answer", answer.getAnswer());

		Answer answer2 = new Answer(2, "question2", "answer2");
		assertEquals(2, answer2.getId());
		assertEquals("answer2", answer2.getAnswer());

		//Change answer 2 to answer 1
		answer2.setId(1);
		answer2.setAnswer("answer");

		//Check that answer 2 is now answer 1
		assertEquals(answer.getId(), answer2.getId());
		assertEquals(answer.getAnswer(), answer2.getAnswer());
	}



	@Test
	void testDefinition() {
		Definition definition = new Definition(1, "word", "definition");
		assertEquals(1, definition.getId());
		assertEquals("definition", definition.getDefinition());

		Definition definition2 = new Definition(2, "word2", "definition2");
		assertEquals(2, definition2.getId());
		assertEquals("definition2", definition2.getDefinition());

		//Change definition 2 to definition 1
		definition2.setId(1);
		definition2.setDefinition("definition");

		//Check that definition 2 is now definition 1
		assertEquals(definition.getId(), definition2.getId());
		assertEquals(definition.getDefinition(), definition2.getDefinition());
	}

}
