//essa classe representa a tela do noss o celular, onde suas funcionalidade  ajustar o brilho da tela e
// ligar para alguem

public class Tela {
    private double tamanho; //tam da tela do celular
    private String marca; //marca do celular.

    //construtor----------------------------------------
    public Tela(double tamanho, String marca) {
        this.tamanho = tamanho;
        this.marca = marca;
    }
    // get's e set's----------------------------------------------------
    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public String getmarca() {
        return marca;
    }

    public void setmarca(String marca) {
        this.marca = marca;
    }

    //a primeira funcionalidade da tela e mostrar que esta ligando para alguem
    public void ligando(String pessoa) {
        System.out.println("voce esta ligando para: " + pessoa);
    }

    //agora a segunda funcionalidade para ajustar o brilho
    private void ajustarBrilho(int qnt) {
        System.out.println("o brilho da tela se encontra em " + qnt);
    }

}
