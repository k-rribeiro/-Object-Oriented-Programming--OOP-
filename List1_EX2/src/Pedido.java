//nessa classe sera armazenado uma lista de compras com um numero fixo de produtos comprados

public class Pedido {
    private int MAX;
    private Item[] itens;
    private int qnt = 0;

    //construtor
    public Pedido(int MAX) {
        this.itens = new Item[MAX];
        this.MAX = MAX;

    }

    //set's e get's do atributo da quantidade de produtos
    public int getMAX() {
        return MAX;
    }
    public void setMAX(int MAX) {
        this.MAX = MAX;
    }

    //metodo para adicionar itens para o pedido(essa estrutura é solicitada pelo enunciado que esteja no metodo abaixo)
    public void adicionarItem(Item item){
        if (qnt < itens.length){
            itens [qnt]= item;
            qnt++;
        }
        else{
            System.out.println("nn é possivel adicionar mais itens na lista");
        }
    }

    //metodo para calcular o valor total da compra feita
    public void calculaTotal(){
        int total = 0;

        //percorre o array incrementando o preço dos produtos no atributo total
        for (int i = 0; i < qnt; i++){
            total+= itens[i].getPrice();
        }
        //devolve o valor da compra
        System.out.println(total);
    }

    //metodo para exibir todas informações do pedido realizado
    public void exibirPedido(){
        for (int i = 0; i < qnt; i++){
            System.out.println( itens[i].getName() + " - " + itens[i].getPrice());
        }
    }
}
