import java.awt.*;

import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.xml.soap.Text;
public class MAINFRAME extends JFrame {
    private Container cp;
    private JLabel jlb1 = new JLabel("歡樂吹氣球");
    private JLabel jlb2 = new JLabel("請輸入使用者");
    private JLabel jlb3 = new JLabel();
    private JLabel jlb4 = new JLabel();
    private JTextField jlf = new JTextField();
    private JButton jbtnENTER = new JButton("ENTER ");
    private JButton jbtnEXIT = new JButton("EXIT");
    private ImageIcon icon1 = new ImageIcon("C:\\Users\\User\\Documents\\GitHub\\20180603\\1.png");
    private ImageIcon icon2 = new ImageIcon("C:\\Users\\User\\Documents\\GitHub\\20180603\\2.png");

    public MAINFRAME() {
        init();
    }
    private void init() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);
        this.setLocation(100, 50);
        this.setSize(1800, 1000);
        cp = this.getContentPane();
        jlb1.setBounds(800,50,400,200);
        jlb1.setFont(new Font(null,Font.BOLD,70));
        jlb2.setBounds(850,200,400,200);
        jlb2.setFont(new Font(null,Font.BOLD,40));
        jlb3.setIcon(icon1);
        jlb3.setBounds(200,50,800,1000);
        jlb4.setIcon(icon2);
        jlb4.setBounds(1200,40,800,1000);
        jbtnEXIT.setBounds(850, 800, 200, 100);
        jbtnEXIT.setFont(new Font(null,Font.BOLD,25));
        jbtnENTER.setBounds(850,600,200,100);
        jbtnENTER.setFont(new Font(null,Font.BOLD,25));
        jlf.setBounds(850,400,200,100);
        this.add(jlb1);
        this.add(jlb2);
        this.add(jlb3);
        this.add(jlb4);
        this.add(jbtnEXIT);
        this.add(jbtnENTER);
        this.add(jlf);
        jbtnENTER.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
        jbtnEXIT.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.exit(0);
            }
        });
        jlf.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}