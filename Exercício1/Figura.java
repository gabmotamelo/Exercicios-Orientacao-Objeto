package Exercício1;

public abstract class Figura {

    private String cor;

    public Figura(){}

    public Figura(String cor){
        super();
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public abstract double area();

    @Override
    public String toString() {
        return "Figura{" +
                "cor='" + cor + '\'' +
                '}';
    }

}
