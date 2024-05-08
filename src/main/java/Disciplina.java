public class Disciplina {
    private IMedia calcmedia;
    private double media;
    public double getMedia() {
        return media;
    }


    private int p1;
    private int p2;


    public Disciplina(IMedia med) {
        this.calcmedia = med;
    }

    public double getP1() {
        return p1;
    }

    public void setP1(int p) {
        p1 = p;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(int p) {
        p2 = p;
    }
    public void setNome(String nom) {
       System.out.println(nom);
    }
    public String getSituacao() {
        return calcmedia.Situacao();
    }
    public void CalcularMedia()
    {
        media =  calcmedia.Media(this.p1 , this.p2);
    }


}
