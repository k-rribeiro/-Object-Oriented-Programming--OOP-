//essa classe eh responsavel por juntar todos os componentes do celular que foi criado ate agora
// onde possui a funcionalidade de ligar o celular

public class Celular {
    private Processador processador;
    private Tela tela;
    private Som Som;
    private SisComunic sisComunic;

    //construtor-------------------------------------------------------
    public Celular(Processador processador, Tela tela, Som Som, SisComunic sisComunic) {
        this.processador = processador;
        this.tela = tela;
        this.Som = Som;
        this.sisComunic = sisComunic;
    }

    //primeira funcionalidade eh ligar o celular e ja mostra qual conexao esta conectado
    public void ligarCelular() {
        System.out.println("o celular  esta ligado");
        sisComunic.conectar();
    }

    //aqui fala a pessoa que quer ouvir o audio
    public void reproduzir(String pessoa) {
        Som.reproduzir(pessoa);
    }

    //aqui ligamos para uma pessoa selecionada
    public void ligando(String nome) {
        tela.ligando(nome);
    }

    //aqui fala qual  o tipo do processador do celular
    public void processar(String tipo) {
        processador.processar(tipo);
    }

}
