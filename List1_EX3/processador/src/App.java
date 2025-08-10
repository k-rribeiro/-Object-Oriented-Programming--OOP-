//nesse exercicio solicita a montagem de um celular que possua processador, tela, som, e sistema de comunicação.
//onde cada componete desses deve ter duas funcionalidades
public class App {
    public static void main(String[] args) throws Exception {
        // Criando os componentes
        Processador processador = new Processador("apple", 5);
        Tela tela = new Tela(6.5, "apple");
        Som sistemaSom = new Som(78, "Alta");
        SisComunic sistemaComunicacao = new SisComunic(true, "5G");

        Celular celular = new Celular(processador, tela, sistemaSom, sistemaComunicacao);

        // Usando as funcionalidades do celular
        celular.ligarCelular();
        celular.reproduzir("namorada");
        celular.ligando("tia patricia");
        celular.processar("apple");
    }
}
