public class Geometrica implements IMedia{

    double calc;
    @Override

    public  double Media(double a, double b) {
        calc = Math.sqrt(a * b);
        return calc;
    }

    @Override
    public String Situacao() {
        if(calc >= 7)
            return "Passou";
        else
            return "Reprovou";
    }

}
