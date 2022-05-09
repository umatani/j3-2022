import java.io.*;

class File {
  public static void main(String args[]){
    String filename = "test1.txt";
    try{
      // テキストファイル出力
      PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(filename)));
      pw.println("Test");
      pw.close();

      // テキストファイル入力
      BufferedReader br = new BufferedReader(new FileReader(filename));
      String str = br.readLine();
      System.out.println(str);
      br.close();
      
    }catch(IOException e){
      System.out.println("IO error");
    }
  }
}
