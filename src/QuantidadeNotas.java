public enum QuantidadeNotas {

    _100(5), _50(5), _20(5), _10(5);
    private final int quantidade;

    private QuantidadeNotas(int quantidade){
        this.quantidade = quantidade;
    }

    public int getQuantidade(){
        return quantidade;
    }
}
