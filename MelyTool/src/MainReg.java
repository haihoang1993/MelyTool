import AutoRegFacebook.FacebookSetup;
import AutoRegGmail.BaseAutoRegGmail;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Administrator on 06/12/2016.
 */
public class MainReg {
    private JButton button1;
    public JPanel panel1;

    public MainReg() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                FacebookSetup facebookSetup =new FacebookSetup();
//                facebookSetup.init();
//                BaseAutoRegGmail baseAutoRegGmail=new BaseAutoRegGmail();
            }
        });
    }
}
