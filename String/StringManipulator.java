import java.io.*;
public class StringManipulator {
  public String trimAndConcat(String string1, String string2){
    String stra = string1.trim(); // stra = string1.trim()
    String strb = string2.trim(); // strb = string2.trim()
    return stra.trim() + strb.trim();
  }
  public int getIndexOrNull(String string1, char c){
    int i = string1.indexOf(c); // i = string1.indexOf(4)
    return i;                      // return i
  }
  public int getIndexOrNull(String string1, String string2){
    int i = string1.indexOf(string2); // i = string1.indexOf(string2)
    return string1.indexOf(string2); // return "", ''
  }
  public String concatSubstring(String string1, int a , int b, String string2){
    String stra = string1.substring(a,b); // stra = string1.substring(a,b)
    return stra + string2; // return string1.trim() + string 2
  }
}
