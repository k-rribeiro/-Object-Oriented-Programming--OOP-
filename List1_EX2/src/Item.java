import javax.lang.model.element.Name;
//nessa classe vamos armazenar o nome, preco de um item da loja, quando comprado

public class Item {
    private String name;
    private int price;

    //construtor com argumentos
    public Item (String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    //get's---------------------------
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }

    //set's-------------------------------
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(int price) {
        this.price = price;
    }

}
