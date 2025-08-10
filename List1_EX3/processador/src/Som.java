// a classe do som, onde suas funcionalidades é reproduzir um audio do whatsapp e ajustar o volume do celular

public class Som {
    private int volume;
    private String qualidade;

    //construtor-------------------------------------------------------
    public Som(int volume, String qualidade) {
        this.volume = volume;
        this.qualidade = qualidade;
    }
    //get's e set's-------------------------------------------------
    public String getQualidade() {
        return qualidade;
    }

    public void setQualidade(String qualidade) {
        this.qualidade = qualidade;
    }

    // a primeira funcionalidade de som é reproduzir o audio do whatsapp
    public void reproduzir(String tipo) {
        System.out.println("reproduzindo o audio da : " + tipo);
    }

    // a segunda funcionalidade da classe de som ajustar o volume
    private void ajustarVolume(int novoVolume) {
        this.volume = novoVolume;
        System.out.println("volume foi ajustado para: " + this.volume);
    }

}
