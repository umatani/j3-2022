import java.io.File;
import java.awt.event.*;
import javax.swing.*;

class FileChooser extends JFrame {
  private JFileChooser chooser = new JFileChooser();
  private JButton button = new JButton("show file chooser");

  public FileChooser() {
    super("Simple File Chooser Application");
    this.add(button);		
    this.pack();
    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
	int state = chooser.showOpenDialog(null);
        //ï€ë∂ÇÃèÍçáÇÕÅCshowOpenDialog ÇÃë„ÇËÇ…showSaveDialogÇégópÇ∑ÇÈ
        //int state = chooser.showSaveDialog(null);
        File file = chooser.getSelectedFile();

        if(file != null && state == JFileChooser.APPROVE_OPTION)
          System.out.println("file name:"+file.getPath());
        else if(state == JFileChooser.CANCEL_OPTION)
          System.out.println("canceled");
        else if(state == JFileChooser.ERROR_OPTION) 
          System.out.println("error");
      }
    });
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
  }

  public static void main(String args[]) {
    new FileChooser();
  }
}
