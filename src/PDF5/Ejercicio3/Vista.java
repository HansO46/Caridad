package PDF5.Ejercicio3;

import javax.swing.*;
import org.netbeans.lib.awtextra.*;

public class Vista extends JFrame {

    JTextField txtPalabra;
    JLabel a, b, c, d, e, f, g, h, i, j, k, l, n, m;
    JButton btnDeclinar;

    public Vista()  {
        this.setTitle("latin");
        this.setSize(1500, 500);
        this.getContentPane().setLayout(new AbsoluteLayout());
        txtPalabra = new JTextField();
        this.getContentPane().add(txtPalabra, new AbsoluteConstraints(60, 100, 150, 50));
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        btnDeclinar = new JButton("Declinar");
        this.getContentPane().add(btnDeclinar, new AbsoluteConstraints(60, 10, 150, 50));
        a = new JLabel("");
        this.getContentPane().add(a, new AbsoluteConstraints(10, 200, 1500, 50));
        b = new JLabel("");
        this.getContentPane().add(b, new AbsoluteConstraints(10, 230, 350, 50));
        c = new JLabel("");
        this.getContentPane().add(c, new AbsoluteConstraints(10, 260, 350, 50));
        d = new JLabel("");
        this.getContentPane().add(d, new AbsoluteConstraints(10, 290, 350, 50));
        e = new JLabel("");
        this.getContentPane().add(e, new AbsoluteConstraints(10, 310, 350, 50));
        f = new JLabel("");
        this.getContentPane().add(f, new AbsoluteConstraints(10, 340, 350, 50));
        g = new JLabel("");
        this.getContentPane().add(g, new AbsoluteConstraints(10, 370, 350, 50));
        h = new JLabel("");
        this.getContentPane().add(h, new AbsoluteConstraints(700, 200, 350, 50));
        i = new JLabel("");
        this.getContentPane().add(i, new AbsoluteConstraints(700, 230, 350, 50));
        j = new JLabel("");
        this.getContentPane().add(j, new AbsoluteConstraints(700, 260, 350, 50));
        k = new JLabel("");
        this.getContentPane().add(k, new AbsoluteConstraints(700, 290, 350, 50));
        l = new JLabel("");
        this.getContentPane().add(l, new AbsoluteConstraints(700, 310, 350, 50));
        n = new JLabel("");
        this.getContentPane().add(n, new AbsoluteConstraints(700, 340, 350, 50));
        m = new JLabel("");
        this.getContentPane().add(m, new AbsoluteConstraints(700, 370, 350, 50));
    }

}
