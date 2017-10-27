package PDF5.Ejercicio3;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Controlador implements ActionListener {

    Vista v;

    public Controlador() {
        v = new Vista();
        v.setVisible(true);
        v.btnDeclinar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
            int ax=1;
        //etiqueta M es columna izq
        if (v.btnDeclinar == ae.getSource()) {
            
            String a = v.txtPalabra.getText();
            char[] arrayChar = v.txtPalabra.getText().toCharArray();
            int n = arrayChar.length;
           
           if(v.txtPalabra.getText().equals("")){
               
               JOptionPane.showMessageDialog(v, "Fatal Error 501 Text Empty");
           }else{
                String b=a.substring(n-1);
           
                
           
            if (b.equals("a")) {
                v.a.setText("Singular:");
            
            v.b.setText("Nominativo       " + a);
            v.c.setText("Vocativo            " + a);
            v.d.setText("Acusativo          " + a + "m");
            v.e.setText("Genitivo              " + a + "e");
            v.f.setText("Dativo                 " + a + "e");
            v.g.setText("Ablativo              " + a);

            v.h.setText("Plural:      ");

            v.i.setText(a + "e");
            v.j.setText(a + "e");
            v.k.setText(a + "s");
            v.l.setText(a + "rum");

            String x = v.txtPalabra.getText().substring(0, n - 1);
            v.m.setText(x + "is");
            v.n.setText(x + "is");

        }else{ if(a.equals("Hans")){
            v.setForeground(Color.MAGENTA);
            v.getContentPane().setBackground(Color.CYAN);
            v.btnDeclinar.setSize(100,1000);
            v.a.setText("ACHUMETCHAAAAAAA AGUENIPANANA CHUMAIWEI!!!");
            v.a.setForeground(Color.pink);
           v.a.setFont(new Font("Arial Black",1,40));
            v.a.setLocation(500,500);
                  v.setTitle("I have a pen , I Have a apple ♫♫♫...");
                     v.b.setBackground(Color.yellow);
                     v.c.setBackground(Color.red);
                     v.d.setBackground(Color.white);
                     v.e.setBackground(Color.black);
                     v.f.setBackground(Color.BLUE);v.m.setBackground(Color.yellow);
                     v.g.setBackground(Color.GREEN);
                     v.h.setBackground(Color.gray);
                     v.i.setBackground(Color.ORANGE);
                     v.j.setBackground(Color.pink);
                     v.k.setBackground(Color.darkGray);
                     v.l.setBackground(Color.magenta);
                     v.a.setOpaque(true); v.b.setOpaque(true); v.c.setOpaque(true); v.d.setOpaque(true); v.e.setOpaque(true); v.f.setOpaque(true); v.g.setOpaque(true); v.h.setOpaque(true); v.i.setOpaque(true); v.j.setOpaque(true); v.k.setOpaque(true); v.l.setOpaque(true); v.m.setOpaque(true);
                     v.a.setText("-.-- --- ..- / .- .-. . / - .-. .- ... .... .-.-.");
                     v.b.setText("Te AMO o.O");
                     v.m.setText("Metiche");
                     v.f.setText("El de abajo miente");
                     v.f.setForeground(Color.white);
                     v.g.setText("El de arriba dice la verdad");
                     v.btnDeclinar.setLocation(500,1500);
                     v.btnDeclinar.setSize(50,50);
                     v.btnDeclinar.setText("No me pegues");
                     v.e.setText("NOOO, SOY NEGROO!!");
                             v.txtPalabra.setLocation(1000, 1000);
                             v.txtPalabra.setBackground(Color.PINK);
                             v.txtPalabra.setForeground(Color.white);
                     

                     
             }if(a.equals("Lalo")){
                for (int i = 0; i < i+1; i++) {
                    i++;
                    JOptionPane.showMessageDialog(v, "HAHAHAHAHAHAHAHAHA ");
                    System.err.println(i);
                    
                    v.setResizable(false);
                      v.setBounds(0,0,3000, 3000);

                }
    
                 
             }
            else{
                JOptionPane.showMessageDialog(v, "Fatal Error 500 TERMINATED 'A' not found");
                System.err.println(b);
        }
            }
            
            }
           }
}
            
    

    public static void main(String[] args) {
        Controlador c = new Controlador();
    }

}
