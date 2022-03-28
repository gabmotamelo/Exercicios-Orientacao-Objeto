package Exercício2;

public class Veiculo {

    protected String placa;
    protected int ano;

    public Veiculo(){}

    public Veiculo(String placa, int ano){
        this.placa = placa;
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void exibirDados(){
        System.out.println("PLACA DO VEÍCULO: " + getPlaca() + "\nANO DE FABRICAÇÃO: " + getAno());
    }
}


