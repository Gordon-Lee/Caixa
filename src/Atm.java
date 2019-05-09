public class Atm {

    private int valorSaque;
    private int nota100;
    private int nota50;
    private int nota20;
    private int nota10;

    public void Atm(){
        this.valorSaque = 0;
        this.nota100 = 0;
        this.nota50 = 0;
        this.nota20 = 0;
        this.nota10 = 0;
    }

    public void setSaque(int saque) {
        this.valorSaque = saque;
    }

    public int getValorSaque() {
        return  this.valorSaque;
    }

    public int getNota100() {
        return nota100;
    }

    public int getNota50() {
        return nota50;
    }

    public int getNota20() {
        return nota20;
    }

    public int getNota10() {
        return nota10;
    }

    public void saqueValorNotas(int descontoSaque) {

        do {

            if(descontoSaque >=  100) {
                this.nota100 += 1;
                descontoSaque -= 100;
            }

            else if(descontoSaque >= 50) {
                this.nota50 +=1 ;
                descontoSaque -= 50;
            }

            else if(descontoSaque >= 20) {
                this.nota20 += 1;
                descontoSaque -= 20;
            }

            else if(descontoSaque >= 10) {
                this.nota10 += 1;
                descontoSaque -= 10;
            }

        } while (descontoSaque != 0);
    }
}
