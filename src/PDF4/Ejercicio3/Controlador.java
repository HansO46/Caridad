package PDF4.Ejercicio3;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {

    Vista v;

    public Controlador() {
        v = new Vista();
        v.setVisible(true);
        v.Analizar.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String z = v.txtp1.getText();
        String z3 = v.txtp3.getText();
        String z2 = v.txtp2.getText();
        String z1 = v.txtFrase.getText();
        char[] arrayChar4 = v.txtp2.getText().toCharArray();
        int n4 = arrayChar4.length;

        char[] arrayChar = v.txtp1.getText().toCharArray();
        int n = arrayChar.length;

        char[] arrayChar3 = v.txtFrase.getText().toCharArray();
        int n3 = arrayChar3.length;

        String J = v.txtFrase.getText().substring(0, n3);
        System.out.println(J+"º"+z2);
        if(z.length()==z1.length()){
        try {
            
        
        if (z1.equals(z)) {
            v.J1.setText("La frase  es igual a :" + z);
        } else {
            v.J1.setText("La frase NO es igual a :" + z);
            v.J1.setBackground(Color.yellow);
            v.J1.setOpaque(true);
        }
        }catch (Exception e) {
            v.J1.setText("La frase NO es igual a :" + z);
            
        }
        }else{
            v.J1.setText("La frase NO es igual a :" + z); 
        }
        System.out.println(z);
        if(J.length()==z2.length()){
        try {
            
       
        if (J.equals(z2)) {
            v.J2.setText("La palabra inicial es '" + z2+"'");
            v.J2.setOpaque(false);

        } else {
            v.J2.setText("La palabra inicial NO es '" + z2 + "' ");
            v.J2.setBackground(Color.YELLOW);
            v.J2.setOpaque(true);
        }
         } catch (Exception e) {
              v.J2.setText("La palabra inicial NO es '" + z2 + "' ");
            v.J2.setBackground(Color.YELLOW);
            v.J2.setOpaque(true);
        }
        }else{
            v.J2.setText("La palabra inicial NO es '" + z2 + "' ");
            v.J2.setBackground(Color.YELLOW);
            v.J2.setOpaque(true);
        }
        char[] arrayChar2 = v.txtp3.getText().toCharArray();
        int n2 = arrayChar.length;
        String J3 = v.txtFrase.getText().substring(n3 - n2, n3);
        if(J3.length()==z3.length()){
        try {
            
        
        if (J3.equals(z3)) {
            v.J3.setText("La palabra Final es '" + z3+"'");
            v.J3.setOpaque(false);
        } else {
            v.J3.setText("La palabra  Final NO es '" + z3+"'");
            v.J3.setOpaque(true);
            v.J3.setBackground(Color.yellow);

        }
        } catch (Exception e) {
              v.J3.setText("La palabra  Final NO es '" + z3+"'");
            v.J3.setOpaque(true);
            v.J3.setBackground(Color.yellow);

        }
        }else{
             v.J3.setText("La palabra Final NO es  '" + z3+"'");
            v.J3.setOpaque(true);
            v.J3.setBackground(Color.yellow);
            
        }
            String q1;
            q1=v.txtp4.getText();
            int l=z1.indexOf(q1);
            int l2=z1.lastIndexOf(q1);
            System.err.println(l+"  "+l2);
            if(l==-1&&l2==-1){
                v.J4.setText("La palabra no se encuentra en el texto");
                
            }else{
            if(l>=0&&l==l2){
                v.J4.setText("Posicion de la palabra: "+l);
            }else{
            if(l>=0&&l2>=0){
                 v.J4.setText("Posicion Inicial: "+l+"\n Pocision Final: "+l2); 
            }
            }
            }
          
            
            
        
        
        
//        if (J2==l) {
//            v.J1.setText(("La frase inicia con la palabra" + v.txtp1.getText()));
//        } else {
//            v.J1.setText(("La frase NO inicia con la palabra" + v.txtp1.getText()+"!!"));
//
//        }
        String y = v.txtFrase.getText().substring(0);
        System.err.println(y);

    }

    public static void main(String[] args) {
        Controlador c = new Controlador();
    }
}
