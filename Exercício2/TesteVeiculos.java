package Exercício2;

public class TesteVeiculos {
    public static void main(String[] args) {

        //Teste do Caminhao
        Caminhao caminhao = new Caminhao("232-CFDS" , 1999 , 4);
        caminhao.exibirDados();

        //Teste do Onibus
        Onibus onibus = new Onibus("AAAA-343" , 2002 , 8);
        onibus.exibirDados();

    }
}
