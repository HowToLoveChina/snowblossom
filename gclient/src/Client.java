package snowblossom.gclient;

import javax.swing.*;

public class Client
{


  private JPanel panel = new JPanel();
  private JTabbedPane tabbedPane1;

  public static void main(String[] args)
  {
    JFrame frame = new JFrame("Client");
    frame.setContentPane(new Client().panel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }


}
