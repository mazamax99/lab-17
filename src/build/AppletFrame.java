import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppletFrame extends Applet implements ActionListener {
    Frame f;
    Frame mf;
    public void init(){
        f=new SampleFrame("A Frame Windows");
        mf=new MessageBox("MessageBox");
        f.setSize(300,300);
        mf.setSize(300,100);
        Panel panel=new Panel();
        Button button=new Button("Нажми меня");
        panel.add(button);
        button.addActionListener(this);
        Label lb=new Label("Привет,я из компании орифлейм");
        f.add(panel);
        mf.add(lb);
        f.setVisible(true);
    }
    public void start(){
        f.setVisible(true);
    }
    public void stop(){
        f.setVisible(false);
    }
    public void paint(Graphics g){
        g.drawString("\r\n AYE",10,20);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String str=e.getActionCommand();
        if(str.equals("Нажми меня")){
            mf.setVisible(true);

        }
    }
}