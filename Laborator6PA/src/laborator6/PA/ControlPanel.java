package laborator6.PA;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class ControlPanel extends JPanel implements ActionListener {
    JButton load=new JButton("Load");
    JButton save=new JButton("Save");
    JButton clear=new JButton("Clear");
    private DrawingFrame frame;

    public ControlPanel(DrawingFrame frame){
        this.frame=frame;
        this.setBorder(BorderFactory.createTitledBorder("Options"));
        init();
    }

    public void init(){
        this.add(load);
        this.add(save);
        this.add(clear);
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
