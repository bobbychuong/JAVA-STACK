public class StringManipulatorTest {
  public static void main(String[] args){
  // Set the class
    StringManipulator iD = new StringManipulator();

    String stra = iD.trimAndConcat("   Hi  ", "   World   "); //stra = new StringManipulator().trimAndConcat("","")
    System.out.println(stra); // console.log(hello)

    int strb = iD.getIndexOrNull("abcdefghijklmnop", 'k'); // strb = new StringManipulator().getIndexOrNull("", "")
    System.out.println(strb);

    int strc = iD.getIndexOrNull("Hello", "o");
    System.out.println(strc);

    String strd = iD.concatSubstring("Hello",2,3,"world");
    System.out.println(strd); // (Hello 2 3 world)
  }
}
