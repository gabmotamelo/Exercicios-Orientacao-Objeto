package Exercício1;

public class Quadrado extends Retangulo {

    public Quadrado(){
        super();
    }

    public Quadrado(double lado1, double lado2, String cor){
        super(lado1, lado2 ,cor);
    }

    public Quadrado(String cor, double lado){
        lado = super.getLado1();
    }

    @Override
    public double area() {
        return this.getLado1() * this.getLado1();
    }

    @Override
    public String toString() {
        return "Quadrado {" +
                "lado1= " + this.getLado1() +
                ", cor = " + super.getCor() +
                ", area= " + area() +
                "}";
    }
}
