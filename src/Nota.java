public enum Nota {

    _100(100), _50(50), _20(20), _10(10);
    private final int valor;

    private Nota(int valor){
        this.valor = valor;
    }

    public int getValor(){
        return valor;
    }
}
