import java.util.ArrayList;

public class polinomio {
    private int grauMAX;
    private final ArrayList<termo> K;

    public polinomio(int grauMAX){
        this.grauMAX = grauMAX;
        //nossa lista de termos se chama K
        K = new ArrayList<termo>();
    }

    public int getgrauMAX(){
        return grauMAX;
    }

    public void adiciona (double Coeficiente, int ordem){
        termo temp = new termo (ordem, Coeficiente);
        
        K.add(temp);
    }

    public String toString(){
        termo temp = null;
        String mostra = "Os termos sÃ£o: \n";

        for (int i = 0; i < K.size();i++){
            temp = K.get(i);
            mostra += temp.toString()+"\n";
        }
        return mostra;
    }

    public double CalculaP (double x){
        //a variavel resultado ira guardar o valor total de p(x)
        double resultado =0.0;

        //andamos pela lista de termo, ao inves de fazer um contador para ir contando quantos
        //termos temos o for ira percorrer a propria lista de termos pegando um termo por vez 
        for(termo termo : K){
            //calcula o valor do termo adicionando o resultado de cada termo na variavel resultado
            resultado += termo.Calcula(x);
        }
        return resultado;
    }
}
