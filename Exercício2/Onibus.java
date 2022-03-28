package Exercício2;

public class Onibus extends Veiculo{

    private int assentos;

    public Onibus(){}

    public Onibus(String placa, int ano, int assentos){
        super(placa, ano);
        this.assentos = assentos;
    }

    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    @Override
    public void exibirDados() {
        System.out.println("PLACA DO VEÍCULO: " + getPlaca() +
                "\nANO DE FABRICAÇÃO: " + getAno() +
                "\nEIXOS: " + getAssentos());
    }
}
