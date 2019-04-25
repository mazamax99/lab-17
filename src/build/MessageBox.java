import java.awt.*;
import java.awt.event.WindowEvent;

public class MessageBox extends Frame {
    MessageBox(String title) {
        super(title);
        MyWindowAdapter.MyWindowAdapter2 adapter = new MyWindowAdapter.MyWindowAdapter2(this);
        addWindowListener(adapter);
    }
    public void paint(Graphics g){
        g.drawString("\r\n Hello",70,80);
    }
}
