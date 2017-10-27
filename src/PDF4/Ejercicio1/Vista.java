package PDF4.Ejercicio1;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class Vista extends JFrame {

    JTextField txtFrase;
    JLabel jlHabia, jlUna, jlvez,jlFin;
    JButton btnAnalizar;

    public Vista() {
        this.setTitle("Ejercicio 1");
        this.setSize(600, 600);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setLayout(new AbsoluteLayout());
        jlFin=new JLabel();
        
                
        txtFrase = new JTextField();
        jlHabia = new JLabel();
        jlUna = new JLabel();
        jlvez = new JLabel();
        btnAnalizar = new JButton("ANALIZARRR");
        this.getContentPane().add(txtFrase, new AbsoluteConstraints(10, 10, 450, 70));
        this.getContentPane().add(jlHabia, new AbsoluteConstraints(10, 90, 450, 70));
        jlHabia.setBackground(Color.white);
        jlHabia.setOpaque(true);
        this.getContentPane().add(jlUna, new AbsoluteConstraints(10, 170, 450, 70));
        jlvez.setBackground(Color.white);
        jlvez.setOpaque(true);
        this.getContentPane().add(jlvez, new AbsoluteConstraints(10, 250, 450, 70));
        this.getContentPane().add(btnAnalizar, new AbsoluteConstraints(10, 430, 450, 70));
        jlUna.setBackground(Color.white);
        jlUna.setOpaque(true);
        this.getContentPane().add(jlFin, new AbsoluteConstraints(10, 340, 450, 70));
        jlFin.setBackground(Color.white);
        jlFin.setOpaque(true);
    }

    public static void main(String[] args) {
        Vista v = new Vista();
        v.setVisible(true);
    }

}
