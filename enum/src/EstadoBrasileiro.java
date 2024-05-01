public enum EstadoBrasileiro {
    SAO_PAULO("SP", "Sao Paulo", 11),
    RIO_JANEIRO("RJ", "Rio de Janeiro", 12),
    PIAUI("PI", "Piaui", 13),
    MARANHAO("MA", "Maranhao", 14),
    CEARA("CE", "Ceara", 15);

    private String nome;
    private String sigla;
    private int ibge;

    private EstadoBrasileiro(String sigla, String nome, int ibge){
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;
    }
    public String getSigla() {
        return sigla;
    }
    public String getNome() {
        return nome;
    }
    public int getIbge() {
        return ibge;
    }
    public String getNomeMaiusculo(){
        return nome.toUpperCase();
    }
}
