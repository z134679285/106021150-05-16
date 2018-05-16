import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class  frame5  extends JFrame{
    private JLabel lab1 = new JLabel("ID:");
    private JLabel lab2 = new JLabel("password:");
    private JTextField text = new JTextField("");
    private  JPasswordField pass = new JPasswordField("");
    private  JButton b1 = new JButton("Exit");
    private  JButton b2 = new JButton("Login");

    public frame5(){
        init();
    }
    private  void init(){
       this.setBounds(100,100,500,600);
       this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
       this.add(lab1);
        this.add(lab2);
        this.add(text);
        this.add(pass);
        this.add(b1);
        this.add(b2);
        lab1.setLocation(100,100);
        lab2.setLocation(100,150);
        text.setLocation(250,100);
        pass.setLocation(250,150);
        b1.setLocation(150,200);
        b2.setLocation(300,200);
        lab1.setSize(100,50);
        lab2.setSize(100,50);
        text.setSize(200,50);
        pass.setSize(200,50);
        b1.setSize(150,50);
        b2.setSize(150,50);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(EXIT_ON_CLOSE);
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              if(text.getText().equals("106021150") && new String(pass.getPassword()).equals("123456")) {
                  frame5 frm = new frame5();
                  frm.setVisible(true);
                  JOptionPane.showMessageDialog(null, "成功了");
                  frame5.this.setVisible(false);
              }  else{
                  JOptionPane.showMessageDialog(null, "失敗了");
              }
            }
        });
    }
}
