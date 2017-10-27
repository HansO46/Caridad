
package PDF5.Ejercicio1;

import javax.swing.*;
import org.netbeans.lib.awtextra.*;

public class Vista extends JFrame {
 JTextField txtFrase;
 JLabel a,e,i,o,u;
 JButton btnAnalizar;

    public Vista() {
        this.setTitle("frases");
        this.setSize(2000, 2000);
        this.getContentPane().setLayout(new AbsoluteLayout());
        txtFrase=new  JTextField();
        this.getContentPane().add(txtFrase, new AbsoluteConstraints(60, 100, 150, 50));
        this.setVisible(true);
        a=new  JLabel("");
        this.getContentPane().add(a, new AbsoluteConstraints(60, 200, 150, 50));
        e=new  JLabel("");
        this.getContentPane().add(e, new AbsoluteConstraints(60, 300, 150, 50));
        i=new  JLabel("");
        this.getContentPane().add(i, new AbsoluteConstraints(60, 400, 150, 50));
        o=new  JLabel("");
        this.getContentPane().add(o, new AbsoluteConstraints(60, 500, 150, 50));
        u=new  JLabel("");
        this.getContentPane().add(u, new AbsoluteConstraints(60, 600, 150, 50));
        btnAnalizar=new  JButton("Analizar");
        this.getContentPane().add(btnAnalizar, new AbsoluteConstraints(60, 10, 150, 50));
    }

    public static void main(String[] args) {
        Vista v=new Vista();
        v.setVisible(true);
    }
 
}
