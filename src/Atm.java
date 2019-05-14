public class Atm {

    private int valorSaque;
    private Cedula cedula = new Cedula();

    public void Atm(){
        this.valorSaque = 0;
    }

    public void setValorSaque(int valorSaque) {
        this.valorSaque = valorSaque;
    }

    public int getValorSaque() {
        return valorSaque;
    }

    public String saqueValor(int descontoSaque) {

        if(descontoSaque >= Nota._100.getValor() && cedula.getQuantidade_100() < QuantidadeNotas._100.getQuantidade()) {
            this.cedula.somarNotas(Nota._100.getValor());
            return saqueValor(descontoSaque - Nota._100.getValor());
        } else if(descontoSaque >= Nota._50.getValor() && cedula.getQuantidade_50() < QuantidadeNotas._50.getQuantidade()) {
            cedula.somarNotas(Nota._50.getValor());
            return saqueValor(descontoSaque - Nota._50.getValor());
        } else if(descontoSaque >= Nota._20.getValor() && cedula.getQuantidade_20() < QuantidadeNotas._20.getQuantidade()) {
            cedula.somarNotas(Nota._20.getValor());
            return saqueValor(descontoSaque - Nota._20.getValor());
        } else if(descontoSaque >= Nota._10.getValor() && cedula.getQuantidade_10() < QuantidadeNotas._10.getQuantidade()) {
            cedula.somarNotas(Nota._10.getValor());
            return saqueValor(descontoSaque - Nota._10.getValor());
        } else if(descontoSaque == 0){
            return impressaoSaque();
        }
        return ((descontoSaque < 10) ? " Notas disponíveis para saque: 100, 50, 20, 10 " :
                                       " Número de notas insuficientes no caixa ");
    }

    private String impressaoSaque(){

        return  "\n Saque = " +  getValorSaque() +
                "\n Notas de " + Nota._100.getValor() + " = " + cedula.getQuantidade_100() +
                "\n Notas de " + Nota._50.getValor() +  " = " + cedula.getQuantidade_50() +
                "\n Notas de " + Nota._20.getValor() + " = " + cedula.getQuantidade_20() +
                "\n Notas de " + Nota._10.getValor() + " = " + cedula.getQuantidade_10();
    }
}
