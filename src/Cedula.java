public class Cedula {

    private int quantidade_100;
    private int quantidade_50;
    private int quantidade_20;
    private int quantidade_10;

    public Cedula(){
        this.quantidade_100 = 0;
        this.quantidade_50 = 0;
        this.quantidade_20 = 0;
        this.quantidade_10 = 0;
    }

    public int getQuantidade_100() {
        return quantidade_100;
    }

    public int getQuantidade_50() {
        return quantidade_50;
    }

    public int getQuantidade_20() {
        return quantidade_20;
    }

    public int getQuantidade_10() {
        return quantidade_10;
    }

    public void somarNotas(int valor){

        switch (valor){
            case 100:
                quantidade_100 += 1;
                break;
            case 50:
                quantidade_50 += 1;
                break;
            case 20:
                quantidade_20 += 1;
                break;
            case 10:
                quantidade_10 += 1;
                break;
        }
    }
}
