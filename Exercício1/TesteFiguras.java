package Exercício1;

public class TesteFiguras {
    public static void main(String[] args) {

        //teste do retangulo
        Retangulo retangulo = new Retangulo(4 ,4 , "Amarelo");
        System.out.println(retangulo);

        //teste quadrado
        Quadrado quadrado = new Quadrado();
        quadrado.setCor("Rosa");
        quadrado.setLado1(3);
        System.out.println(quadrado);

        //teste triangulo
        Triangulo triangulo = new Triangulo(5,6,"Cinza");
        System.out.println(triangulo);

        //teste circulo
        Circulo circulo = new Circulo(3 , "Laranja");
        System.out.println(circulo);

    }
}
