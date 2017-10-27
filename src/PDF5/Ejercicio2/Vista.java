package PDF5.Ejercicio2;

import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextField;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class Vista extends JFrame {

    JTextField txtDNI;
    JLabel etiDNI;
    JButton btnPrepararDNI;

    public Vista() {
        this.setTitle("Ejercicio 1");
        this.setSize(600, 600);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setLayout(new AbsoluteLayout());
        txtDNI = new JTextField();
        etiDNI = new JLabel();
        btnPrepararDNI = new JButton();
        this.getContentPane().add(txtDNI, new AbsoluteConstraints(10, 10, 70, 50));
        this.getContentPane().add(etiDNI, new AbsoluteConstraints(10, 110, 470, 50));
        this.getContentPane().add(btnPrepararDNI, new AbsoluteConstraints(10, 220, 70, 50));
        
    }
}
