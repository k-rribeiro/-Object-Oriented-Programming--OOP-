public class produto {
/* no exercicio Ã© solicitado que nesta classe devemos declarar as variaveis deixando 
claro qual Ã© o valor maximo e o valor minimimo que nosso estoque aguenta*/
    private String Nome;
    private float Preco;
    private int Qnt;
    //utilizamos esse final pois assim nÃ£o se Ã© possivel alterar o valor
    final int MAXestoque = 20000;
    final int MINestoque = 100;

    //aqui vamos iniciar nossa classe e as variaveis
    public  produto (String Nome, float Preco, int Qnt){
        //no netbeans
        /*Nome = umNome;
        Preco = umPreco;
        Qnt = umaQnt;*/

        //no vs code
        this.Nome = Nome;
        this.Preco = Preco;
        this.Qnt = Qnt;

        //veriguar se de fato funcionou
        System.out.println("inicializaÃ§Ã£o feita com sucesso");
    }

    //agora fazer os get para recebermos sua informaÃ§Ã£o
    // com o netbeans( o software utilizado em aula) consegue fazer essas partes do codigo com "insert code"
    public String getNome(){
        return Nome;
    }

    public float getPreco(){
        return Preco;
    }

    public int getQnt(){
        return Qnt;
    }

    //para adicionar um ou mais produtos
    public void adiciona (int umaQnt){
        if (Qnt+umaQnt > MAXestoque){
            //atalho para a soma e atribuiÃ§Ã£o ao msm tempo, ex:Qnt = Qnt + Quantidade
            Qnt+=umaQnt;
        }
        else {
            System.out.println("Ultrapassa a capacidade maxima do estoque");
        }
    }

    //para remover quantidades de produtos do estoque
    public void remove (int umaQnt){
        if (Qnt+umaQnt > MINestoque){
            //atalho para a soma e atribuiÃ§Ã£o ao msm tempo, ex:Qnt = Qnt + Quantidade
            Qnt-=umaQnt;
        }
        else {
            System.out.println("O estoque nÃ£o pode armazenar menos que 100");
        }
    }

    //uma funÃ§Ã£o para printar todas as informaÃ§Ãµes dos produtos solicitados quando solicitado
    public String toString(){
        return("nome do produto: " +Nome+ " preÃ§o:"+Preco+ " Quantidade: "+Qnt);
    }
}
