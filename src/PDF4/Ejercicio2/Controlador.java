package PDF4.Ejercicio2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Controlador implements ActionListener {

    Vista v;

    public Controlador() {
        v = new Vista();
        v.setVisible(true);
        v.Analizar.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == v.Analizar) {
            String x1="",a="";
            String u=v.txtFrase.getText();
            String z=v.txtSubcadena.getText();
            
               char[] arrayChar = v.txtSubcadena.getText().toCharArray();
            int n = arrayChar.length;
             char[] arrayChar2 = v.txtFrase.getText().toCharArray();
            int n2 = arrayChar2.length;
            String x = v.txtSubcadena.getText();
            int l= u.indexOf(z);
            int j=u.lastIndexOf(z);
            if(n>0){
            if(l==-1){
                JOptionPane.showMessageDialog(v, "ERROR 501 word not found");
            }else{
            System.out.println(l+"  "+j);     
            String u1=u.substring(0,l);
            String u2=u.substring(j+n);
            v.J1.setText("Texto anterior: "+u1);
            v.J2.setText("Texto posterior: "+u2);
            v.J3.setText("Posicion Inicial: "+l);
            v.J4.setText("Pocision Final: "+j);
            }
            }else{
                 JOptionPane.showMessageDialog(v, "ERROR 501 Empty box(es)");
            }
               // int indexOf( String str ): Devuelve el índice correspondiente al carácter en que empieza la primera aparición de la subcadena str.
//int lastIndexOf( char ch, int start )
                
            
//            String x1=v.txtFrase.getText().substring(0,n-1);
            
            
            
            
            
            
            
            
            
            
            
            
            
            
//            char[] arrayChar = v.txtSubcadena.getText().toCharArray();
//            int n = arrayChar.length;
//            String y = v.txtFrase.getText();
////            String y = v.txtFrase.getText().subSequence(0, 0);
//            char[] arrayChar2 = v.txtFrase.getText().toCharArray();
//            int m = arrayChar2.length;
//             String sub="";
//            for (int i = 0; i < n; i++) {
//                sub=sub+arrayChar[i];
//            }
//           

        }

    }

    public static void main(String[] args) {
        Controlador c = new Controlador();
    }

}
