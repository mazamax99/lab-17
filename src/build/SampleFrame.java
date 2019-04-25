import java.awt.*;

class SampleFrame extends Frame {
    SampleFrame(String title) {
        super(title);
        MyWindowAdapter adapter = new MyWindowAdapter(this);
        addWindowListener(adapter);
    }
    public void paint(Graphics g){
        g.drawString("\r\n AYE",70,80);
    }
}