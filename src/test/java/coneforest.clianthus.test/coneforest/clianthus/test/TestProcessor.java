package coneforest.clianthus.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import coneforest.clianthus.processor.Processor;
import coneforest.clianthus.processor.ProcessingException;
import coneforest.clianthus.option.*;
import org.junit.jupiter.api.Test;

public class TestProcessor
{

	@Test
	public void testOptionString()
		throws ProcessingException
	{
		var processor=new Processor(new OptionString("s string"));
		processor.parse(new String[] {"-s", "XYZ"});
		assertEquals("XYZ", processor.getValue("s"));
		assertEquals("XYZ", processor.getValue("string"));
	}

	@Test
	public void testOptionInt()
		throws ProcessingException
	{
		var processor=new Processor(new OptionInteger("n number"));
		processor.parse(new String[] {"-n", "-5"});
		assertEquals(-5, (int)processor.getValue("n"));
		assertEquals(-5, (int)processor.getValue("number"));
	}

	@Test
	public void testOptionLong()
		throws ProcessingException
	{
		var processor=new Processor(new OptionLong("n number"));
		processor.parse(new String[] {"-n", "-5"});
		assertEquals(-5L, (long)processor.getValue("n"));
		assertEquals(-5L, (long)processor.getValue("number"));
	}

	@Test
	public void testOptionFloat()
		throws ProcessingException
	{
		var processor=new Processor(new OptionFloat("n number"));
		processor.parse(new String[] {"-n", "-5."});
		assertEquals(-5.F, (float)processor.getValue("n"), 0.F);
		assertEquals(-5.F, (float)processor.getValue("number"), 0.F);
	}

	@Test
	public void testOptionDouble()
		throws ProcessingException
	{
		var processor=new Processor(new OptionDouble("n number"));
		processor.parse(new String[] {"-n", "-5."});
		assertEquals(-5.D, (double)processor.getValue("n"), 0.F);
		assertEquals(-5.D, (double)processor.getValue("number"), 0.F);
	}
}
