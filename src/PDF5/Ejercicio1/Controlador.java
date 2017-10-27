
package PDF5.Ejercicio1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class Controlador implements ActionListener {
    Vista v;
    public Controlador() {
        v = new Vista();
        v.setVisible(true);
        v.btnAnalizar.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
    String A=v.txtFrase.getText();
    int contador = 0;
    int contador3 = 0;
    int contador2 = 0;
    int contador4 = 0;
    int contador5 = 0;
    if( A.equals("")){
  JOptionPane.showMessageDialog(v,"error");        
        }else{
    for(int x=0;x<A.length();x++) {
  if ((A.charAt(x)=='a') || (A.charAt(x)=='A')){
    contador++;
  }
  if ((A.charAt(x)=='e') || (A.charAt(x)=='E')){
    contador2++;
  }
  if ((A.charAt(x)=='i') || (A.charAt(x)=='I')){
    contador3++;
  }
 if ((A.charAt(x)=='o') || (A.charAt(x)=='O')){
    contador4++;
  }
 if ((A.charAt(x)=='u') || (A.charAt(x)=='U')){
    contador5++;
  } 

  v.a.setText("A: "+contador);
  v.e.setText("E: "+contador2);
  v.i.setText("I: "+contador3);
  v.o.setText("O: "+contador4);
  v.u.setText("U: "+contador5);
    }
    }
   
}
     public static void main(String[] args) {
         Controlador c=new Controlador();
}
}