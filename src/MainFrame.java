import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class MainFrame extends Frame{
    private Button Exitbtn=new Button("Exit");
    private Button plus=new Button("ADD");
    private Label lab=new Label("XD");
    private Timer t1;
    private boolean flag = true;
    private int labx=30 , laby=40;
    public MainFrame(){
        initcomp();
    }
    private void initcomp(){
        this.setLocation(100,120);
        this.setSize(400,300);
        this.setLayout(null);
        this.add(Exitbtn);
        this.add(plus);
        this.add(lab);
        Exitbtn.setBounds(260,210,80,30);
        plus.setBounds(100,210,80,30);
        lab.setBounds(30,40,80,30);
        Exitbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
           t1.start();
            }
        });
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {

                System.exit(0);
            }
        });
        t1 = new Timer(50, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    labx+=5;
                    lab.setLocation(labx,laby);
                    if (labx>=400){
                        lab.setLocation(labx,(int)Math.random()*10);
                    }




                }

        });
    }
}