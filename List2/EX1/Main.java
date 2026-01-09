public class App {
    public static void main(String[] args) {
        // calculando um termo por vez
        termo t1 = new termo (2, 3.0d);
        termo t2 = new termo (4, 2.4d);
        
        double x = 4.0d;

        t1.Calcula(x);
        t2.Calcula(x);
        System.out.println("termo 1= " + t1.Calcula(x));
        System.out.println("termo 2= " + t2.Calcula(x));

        //calculando os polinomios
        polinomio p = new polinomio(5);

        p.adiciona(3.0d,2);
        p.adiciona(4.0d,2);
        p.adiciona(5.0d,2);
        System.out.println("P(x) = "+ p.CalculaP(x));
    }
}
