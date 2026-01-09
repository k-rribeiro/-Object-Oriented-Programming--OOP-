//aqui e a classe do sistema de comunicacao onde suas funcoes vao ser apresentar a rede em que ele esta conectado
// e mostrar se essa conexÃ£o esta ativa ou nao

public class SisComunic {
    private boolean conexaoAtiva;
    private String rede;

    //construtor-------------------------------------------------------
    public SisComunic(boolean conexaoAtiva, String rede) {
            this.conexaoAtiva = conexaoAtiva;
            this.rede = rede;
        }
    // a primeira funcionalidade de mostrar qual a conexao utilizada
    public void conectar() {
       if (this.conexaoAtiva) {
          System.out.println("o dispositivo esta conectado Ã  rede: " + rede);
       }
       else {
          System.out.println("houve uma falha na conexÃ£o.");
       }
    }

    //e a segunda funcionalidade eh mostrar se esta conectada ou nao
    private void desativarConexao() {
        this.conexaoAtiva = false;
        System.out.println("conexÃ£o nao encontrada.");
    }

}
