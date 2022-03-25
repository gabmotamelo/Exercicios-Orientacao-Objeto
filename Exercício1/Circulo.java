package Exercício1;

public class Circulo extends Figura {
    private double raio;

    public Circulo(){}

    public Circulo(double raio , String cor){
        super(cor);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getDiametro() {
        return 2 * this.raio;
    }

    @Override
    public double area() {
        return 3.14 * this.raio * 2;
    }

    @Override
    public String toString() {
        return "Circulo {" +
                "raio= " + raio +
                ", diametro= " + getDiametro() +
                ", cor= " + super.getCor() +
                ", area= " + this.area() +
                '}';
    }
}
