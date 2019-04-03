package laborator6.PA;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class Toolbar extends JPanel implements ActionListener {
    String[] colors = {"Red","Blue","Yellow","Black" };
    private DrawingFrame frame;
    protected JSpinner size = new JSpinner(new SpinnerNumberModel(0,0,30,1));
    protected JComboBox cols = new JComboBox(colors);



    public Toolbar(DrawingFrame frame){
        this.frame=frame;
        this.setBorder(BorderFactory.createTitledBorder("Tools"));
        init();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    private void init(){
        this.add(size);
        this.add(cols);
    }
}
