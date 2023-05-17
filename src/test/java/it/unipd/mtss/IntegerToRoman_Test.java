////////////////////////////////////////////////////////////////////
// Matteo Vignaga 1201147
// Yuri Lovato 1238100
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IntegerToRoman_Test {

    @Test
    public void testNumeroRomano999inAscii()
    {
        assertEquals("CMXCIX",IntegerToRoman.convert(999));
    }
    @Test
    public void testNumeroRomano888nAscii()
    {
        assertEquals("DCCCLXXXVIII",IntegerToRoman.convert(888));
    }
    @Test
    public void testNumeroRomano777inAscii()
    {
        assertEquals("DCCLXXVII",IntegerToRoman.convert(777));
    }
    @Test
    public void testNumeroRomano666inAscii()
    {
        assertEquals("DCLXVI",IntegerToRoman.convert(666));
    }
    @Test
    public void testNumeroRomano555inAscii()
    {
        assertEquals("DLV",IntegerToRoman.convert(555));
    }
    @Test
    public void testNumeroRomano444inAscii()
    {
        assertEquals("CDXLIV",IntegerToRoman.convert(444));
    }
    @Test
    public void testNumeroRomano333inAscii()
    {
        assertEquals("CCCXXXIII",IntegerToRoman.convert(333));
    }
    @Test
    public void testNumeroRomano222inAscii()
    {
        assertEquals("CCXXII",IntegerToRoman.convert(222));
    }
    @Test
    public void testNumeroRomano111inAscii()
    {
        assertEquals("CXI",IntegerToRoman.convert(111));
    }
}