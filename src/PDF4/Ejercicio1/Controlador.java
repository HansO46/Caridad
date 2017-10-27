package PDF4.Ejercicio1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {

    Vista v;

    public Controlador() {
        v = new Vista();
        v.btnAnalizar.addActionListener(this);
        v.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == v.btnAnalizar) {
            String resultado = v.txtFrase.getText().toUpperCase();
            v.jlUna.setText(resultado);
            String resultado2 = v.txtFrase.getText().toLowerCase();
            v.jlHabia.setText(resultado2);
            char[] arrayChar = v.txtFrase.getText().toCharArray();
            int n=arrayChar.length;
            for (int i=0;i<arrayChar.length;i++){
                if(arrayChar[i]==' '){
                    n=n-1;
                }
            }
            v.jlvez.setText(""+arrayChar.length);
            v.jlFin.setText(""+n);
            
            if(n==0){
                  v.jlvez.setText("Error");
            v.jlFin.setText("Error");
             v.jlUna.setText("Error");
                v.jlHabia.setText("Error"); 
            }
            
            
        }

    }
//    public String toUpperCase(){
//         String x;
//        x = System.out.println(v.txtFrase.toUpperCase()));
//        return null;
//        
//    }

    public static void main(String[] args) {
        Controlador c = new Controlador();

    }

}
