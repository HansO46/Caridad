
package PDF4.Ejercicio3;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextField;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class Vista extends JFrame{
    JTextField txtFrase,txtp1,txtp2,txtp3,txtp4;
    JLabel J1,J2,J3,J4;
    JButton Analizar;
    public Vista(){
        this.setTitle("Ejercicio 1");
        this.setSize(800, 600);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setLayout(new AbsoluteLayout());
    Analizar=new JButton("Analizar");
            this.getContentPane().add(Analizar, new AbsoluteConstraints(400, 10, 100, 50));
            txtFrase=new JTextField("=");
            this.getContentPane().add(txtFrase, new AbsoluteConstraints(10, 10, 250, 70));
            txtp1=new JTextField("=");
            this.getContentPane().add(txtp1, new AbsoluteConstraints(10, 100, 250, 70));
             txtp2=new JTextField("palabra inicial");
            this.getContentPane().add(txtp2, new AbsoluteConstraints(10, 180, 250, 70));
             txtp3=new JTextField("palabra final");
            this.getContentPane().add(txtp3, new AbsoluteConstraints(10, 260, 250, 70));
             txtp4=new JTextField("Palabra");
            this.getContentPane().add(txtp4, new AbsoluteConstraints(10, 340, 250, 70));
             J1=new JLabel();
            this.getContentPane().add(J1, new AbsoluteConstraints(300, 100, 420, 70));
             J2=new JLabel();
            this.getContentPane().add(J2, new AbsoluteConstraints(300, 180, 500, 70));
             J3=new JLabel();
            this.getContentPane().add(J3, new AbsoluteConstraints(300, 260, 580, 70));
             J4=new JLabel();
            this.getContentPane().add(J4, new AbsoluteConstraints(300, 340, 660, 70));
    }
    public static void main(String[] args) {
        Vista v=new Vista();
        v.setVisible(true);
    }
    
    
}
