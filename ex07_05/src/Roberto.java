public class Roberto implements ICalcMedia{
    private double p1;
    private double p2;

    public Roberto(double p1, double p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public double CalculaMedia() {
        return (p1 + p2);
    }

    @Override
    public String Situacao() {
        return CalculaMedia() > 16.0 ? "Aprovado" : "Reprovado";
    }
}
