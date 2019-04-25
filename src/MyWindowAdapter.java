import java.applet.Applet;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class MyWindowAdapter extends WindowAdapter {
    SampleFrame sampleFrame;

    public MyWindowAdapter(SampleFrame sampleFrame) {
        this.sampleFrame = sampleFrame;
    }


    @Override
    public void windowClosing(WindowEvent e) {
        sampleFrame.dispose();

        //sampleFrame.setVisible(false);
    }

    static class MyWindowAdapter2 extends WindowAdapter {
        MessageBox messageBox;

        public MyWindowAdapter2(MessageBox messageBox) {
            this.messageBox = messageBox;
        }

        public void windowClosing(WindowEvent e) {
            messageBox.dispose();

            //sampleFrame.setVisible(false);
        }
    }
}