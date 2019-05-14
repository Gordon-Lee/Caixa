import javax.swing.*;

public class Main {

    public static void main(String[] args){
        Atm saqueCliente = new Atm();

        saqueCliente.setValorSaque(Integer.parseInt(JOptionPane.showInputDialog("Qual valor a ser sacado")));

        System.out.print(saqueCliente.saqueValor(saqueCliente.getValorSaque()));
    }
}