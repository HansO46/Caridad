package PDF5.Ejercicio2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Controlador implements ActionListener {

    Vista v;

    public Controlador() {
        v = new Vista();
        v.setVisible(true);
        v.btnPrepararDNI.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == v.btnPrepararDNI) {
            String m = v.txtDNI.getText();
            if(m.equals("")){
                JOptionPane.showMessageDialog(v,"error");
            
            }else{
                m=m.replace(".", "");
                m=m.replace(" ", "");
                m=m.replace("-", "");                
            }
            v.etiDNI.setText(m);

        }

    }

    public static void main(String[] args) {
        Controlador c = new Controlador();
    }
}
