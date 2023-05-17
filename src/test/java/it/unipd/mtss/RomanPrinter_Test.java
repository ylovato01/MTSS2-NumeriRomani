////////////////////////////////////////////////////////////////////
// Matteo Vignaga 1201147
// Yuri Lovato 1238100
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanPrinter_Test {
	@Test
    public void testAsciiArtNumero44inRomano()
    {
        assertEquals("__   __ _       _____ __      __\n"
        		  + "\\ \\ / /| |     |_   _|\\ \\    / /\n"
        		  + " \\ V / | |       | |   \\ \\  / / \n"
        		  + "  > <  | |       | |    \\ \\/ /  \n"
        		  + " / . \\ | |____  _| |_    \\  /   \n"
        		  + "/_/ \\_\\|______||_____|    \\/    \n",RomanPrinter.print(44));
    }
    @Test
    public void testAsciiArtNumero1000inRomano()
    {
        assertEquals(" __  __ \n"
        			+ "|  \\/  |\n"
        			+ "| \\  / |\n"
        			+ "| |\\/| |\n"
        			+ "| |  | |\n"
        			+ "|_|  |_|\n"
        			+ "",RomanPrinter.print(1000));
    }
    @Test
    public void testAsciiArtNumero500inRomano()
    {
        assertEquals(" _____  \n"
        			+ "|  __ \\ \n"
        			+ "| |  | |\n"
        			+ "| |  | |\n"
        			+ "| |__| |\n"
        			+ "|_____/ \n",RomanPrinter.print(500));
    }
    @Test
    public void testAsciiArtNumero100inRomano()
    {
        assertEquals("  _____ \n"
        			+ " / ____|\n"
        			+ "| |     \n"
        			+ "| |     \n"
        			+ "| |____ \n"
        			+ " \\_____|\n",RomanPrinter.print(100));
    }
}
