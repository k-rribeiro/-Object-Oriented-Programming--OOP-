//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //recebe qual o tamanho maximo da lista de compras
        Pedido pedido = new Pedido(5);
        //os itens a serem colocados no carrinho
        //nessa versao nn colocamos a quantidade de cada produto, como se só pudesse comprar uma unica unidade de cada produto
        pedido.adicionarItem(new Item("mouse", 49));
        pedido.adicionarItem(new Item("headset", 89));
        pedido.adicionarItem(new Item("teclado", 199));
        pedido.adicionarItem(new Item("garrafa", 30));
        pedido.adicionarItem(new Item("tinta de cabelo", 29));
        //item para ver se adiciona mais do maximo de itens
        pedido.adicionarItem(new Item("panela", 78));

        //aqui mostra os itens que estao na lista
        pedido.exibirPedido();
        // e o valor total da lista
        pedido.calculaTotal();
    }
}