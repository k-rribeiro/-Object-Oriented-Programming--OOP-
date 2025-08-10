//essa classe sera o processador do celular montado, onde suas duas funcionalidades
//serao ver o modelo e a velocidade

public class Processador {
    private String tipo;
    private double velocidade; // em GHz

    //construtor---------------------------------------------
    public Processador(String tipo, double velocidade) {
        this.tipo = tipo;
        this.velocidade = velocidade;
    }

    //get's e set's------------------------------------------------
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //primeira funcionalidade que o processador faz
    //como exercicio é apenas introdutorio decidi apenas imprimir uma frase
    public void processar(String tipo) {
        System.out.println("Seu processamento é do tipo: " + tipo);
    }

    //segunda funcionalidade de ve a sua velocidade e aumenta ela
    private void aumentarVelocidade(double aumentar) {
        this.velocidade += aumentar;
        System.out.println("A velocidade do processador foi aumentada para: " + this.velocidade + " GHz");
    }


}


