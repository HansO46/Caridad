
package PDF4.Ejercicio2;

import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextField;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class Vista extends JFrame{
    JButton Analizar;
    JTextField txtFrase,txtSubcadena;
    JLabel J1,J2,J3,J4,J5,J6,J7;
    public Vista() {
     this.setTitle("Ejercicio 1");
        this.setSize(700, 600);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setLayout(new AbsoluteLayout());
    Analizar=new JButton();
            this.getContentPane().add(Analizar, new AbsoluteConstraints(400, 10, 100, 50));
             txtFrase=new JTextField();
            this.getContentPane().add(txtFrase, new AbsoluteConstraints(10, 10, 150, 70));
             txtSubcadena=new JTextField();
            this.getContentPane().add(txtSubcadena, new AbsoluteConstraints(200, 10, 150, 70));
             J1=new JLabel();
            this.getContentPane().add(J1, new AbsoluteConstraints(10, 100, 500, 70));
             J2=new JLabel();
            this.getContentPane().add(J2, new AbsoluteConstraints(10, 180, 500, 70));
             J3=new JLabel();
            this.getContentPane().add(J3, new AbsoluteConstraints(10, 260, 500, 70));
             J4=new JLabel();
            this.getContentPane().add(J4, new AbsoluteConstraints(10, 340, 500, 70));
             J5=new JLabel();
            this.getContentPane().add(J5, new AbsoluteConstraints(10, 420, 500, 70));
              J6=new JLabel();
            this.getContentPane().add(J6, new AbsoluteConstraints(10, 500, 500, 70));
              J7=new JLabel();
            this.getContentPane().add(J7, new AbsoluteConstraints(10, 580, 100, 70));

}
    public static void main(String[] args) {
        Vista v=new Vista();
        v.setVisible(true);
    }
}


