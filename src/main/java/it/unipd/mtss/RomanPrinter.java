////////////////////////////////////////////////////////////////////
// Matteo Vignaga 1201147
// Yuri Lovato 1238100
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;
public class RomanPrinter
{
  public static String print(int num)
  {
    return printAsciiArt(IntegerToRoman.convert(num));
  }
  private static String costruisciRiga(String Matrix[][],int riga) {
    String ret="";
    for(int colonna=0;colonna<Matrix[riga].length;colonna++) {
      ret+=Matrix[riga][colonna];
    }
    return ret;
  }
  private static String printAsciiArt(String romanNumber)
  {
    return "";
  }
}