import java.awt.*;

class CheckFont{
  public static void main(String argv[]){
    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
    String[] fs = ge.getAvailableFontFamilyNames();
    for (String name : fs) 
      System.out.println(name);

  }
}
