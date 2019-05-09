import javax.swing.*;
import javax.xml.soap.SAAJMetaFactory;

public class Main {

    public static void main(String[] args){
        Atm saqueCliente = new Atm();

        saqueCliente.setSaque(Integer.parseInt(JOptionPane.showInputDialog("Qual valor a ser sacado")));

        saqueCliente.saqueValorNotas(saqueCliente.getValorSaque());

        System.out.print("SAQUE "+saqueCliente.getValorSaque() +"\n"+
                         "Notas de 100 "+saqueCliente.getNota100()+"\n"+
                         "Notas de 50 "+saqueCliente.getNota50()+"\n"+
                         "Notas de 20 "+saqueCliente.getNota20()+"\n"+
                         "Notas de 10 "+saqueCliente.getNota10());

    }
}