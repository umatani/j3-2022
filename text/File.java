import java.io.*;

class File {
  public static void main(String args[]){
    String filename = "test1.txt";
    try{
      // �e�L�X�g�t�@�C���o��
      PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(filename)));
      pw.println("Test");
      pw.close();

      // �e�L�X�g�t�@�C������
      BufferedReader br = new BufferedReader(new FileReader(filename));
      String str = br.readLine();
      System.out.println(str);
      br.close();
      
    }catch(IOException e){
      System.out.println("IO error");
    }
  }
}
