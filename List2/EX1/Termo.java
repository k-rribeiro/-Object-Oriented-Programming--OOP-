public class termo {

    private double Coeficiente;
    private int ordem;


    public termo (int ordem, double Coeficiente){
        this.ordem = ordem;
        this.Coeficiente = Coeficiente;
    }

    public double getCoeficiente(){
        return Coeficiente;
    }

    public int getordem(){
        return ordem;
    }

    public String toString (){
        return "termo{"+ "coeficiente= " +Coeficiente+ ", ordem= " + ordem +'}' ; 
    }

    public double Calcula (double x){
        double T = Math.pow(x, ordem);

        double Resultado = Coeficiente*T;

        return Resultado;
    }
}
