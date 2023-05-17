////////////////////////////////////////////////////////////////////
// Matteo Vignaga 1201147
// Yuri Lovato 1238100
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman 
{
  public static String convert(int value)
  {
    if (value==1000) {
      return "M";
    }

    String str="";

    int unita;
    int decine;
    int centinaia;

    centinaia=value/100;
    decine=(value-(centinaia*100))/10;
    unita=(value-(centinaia*100)-(decine*10));
    switch (centinaia)
    {
      case 1:
        str+="C";
        break;
      case 2:
        str+="CC";
        break;
      case 3:
        str+="CCC";
        break;
      case 4:
        str+="CD";
        break;
      case 5:
        str+="D";
        break;
      case 6:
        str+="DC";
        break;
      case 7:
        str+="DCC";
        break;
      case 8:
        str+="DCCC";
        break;
      case 9:
        str+="CM";
        break;
    }

    switch (decine)
    {
      case 1:
        str+="X";
        break;
      case 2:
        str+="XX";
        break;
      case 3:
        str+="XXX";
        break;
      case 4:
        str+="XL";
        break;
      case 5:
        str+="L";
        break;
      case 6:
        str+="LX";
        break;
      case 7:
        str+="LXX";
        break;
      case 8:
        str+="LXXX";
        break;
      case 9:
        str+="XC";
        break;
    }

    switch (unita)
    {
      case 1:
        str+="I";
        break;
      case 2:
        str+="II";
        break;
      case 3:
        str+="III";
        break;
      case 4:
        str+="IV";
        break;
      case 5:
        str+="V";
        break;
      case 6:
        str+="VI";
        break;
      case 7:
        str+="VII";
        break;
      case 8:
        str+="VIII";
        break;
      case 9:
        str+="IX";
        break;
    }
    return str;
  }
}
