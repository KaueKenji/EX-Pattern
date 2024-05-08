public class Aritmetica implements IMedia{

    double calc;
    @Override


    public  double Media(double a, double b) {
        calc = (a + b) / 2;
        return calc;
    }

    @Override
    public String Situacao() {
        if(calc >= 5)
        return "passou";
        else
            return "reprovou";
    }

}