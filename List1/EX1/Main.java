public class App {
    //esta sera nossa funcao main, onde devemos instanciar os 
    //produtos, printar-los, adicionar e remove-los
    
    public static void main(String[] args) { 
       produto p1 = new produto( "TV ", 4.99f, 200);
       produto p2 = new produto("SofÃ¡ " , 7.8f, 700);
    
       //testando nossa funÃ§Ã£o toString
       System.out.println(p1.toString());
       System.out.println(p2.toString());

       //------------------------------------------------------------------------------------

       //testando a funÃ§Ã£o adicionar
       p2.adiciona(105);
       System.out.println(p2.toString());

       //agora testando a capacidade total do estoque
       p2.adiciona(10000);
       //deve aparecer "Ultrapassa a capacidade maxima do estoque"


       //------------------------------------------------------------------------------------

       //testando a funÃ§Ã£o de remover
       p2.remove(105);
       System.out.println(p2.toString());

       //agora testando a capacidade minima do estoque
       p2.remove(10000);
       //deve aparecer "O estoque nÃ£o pode armazenar menos que 100"
    }
}
