package view.pharmacist;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import control.LoginoutControl;

import storage.staff.Staff;

public class PharmacistMainView extends JFrame {
    Staff me;

    private static final long serialVersionUID = 1L;
    private JPanel jContentPane = null;
    private PharmacistMainTabbedPane pharmacistMainTabbedPane = null;

    /**
     * This is the default constructor
     */
    public PharmacistMainView(Staff aStaff) {
        super();
        me = aStaff;
        initialize();
    }

    /**
     * This method initializes this
     * 
     * @return void
     */
    private void initialize() {
        this.setSize(390, 200);
        this.setContentPane(getJContentPane());
        this.setTitle("藥劑師主畫面");
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.out.println("" + me.name() + me.occupation() + "登出");
                new LoginoutControl().logout(me);
                }
        });
    }

    /**
     * This method initializes jContentPane
     * 
     * @return javax.swing.JPanel
     */
    private JPanel getJContentPane() {
        if (jContentPane == null) {
            jContentPane = new JPanel();
            jContentPane.setLayout(new BorderLayout());
            jContentPane.add(getPharmacistMainTabbedPane(), BorderLayout.CENTER);
        }
        return jContentPane;
    }

    /**
     * This method initializes pharmacistMainTabbedPane	
     * 	
     * @return javax.swing.JTabbedPane	
     */
    private PharmacistMainTabbedPane getPharmacistMainTabbedPane() {
        if (pharmacistMainTabbedPane == null) {
            pharmacistMainTabbedPane = new PharmacistMainTabbedPane();
        }
        return pharmacistMainTabbedPane;
    }

}
