package dadosV;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Random aleatorio = new Random();
        Scanner ler = new Scanner (System.in);

        System.out.println("Digite a quantidade de lados do dado");
        int lados = ler.nextInt();

        System.out.println("Digite quantas vezes?");
        int dadoQ = ler.nextInt();

        System.out.println("Rodando dados");


        int soma = 0;

        for(int numero = 0; numero < dadoQ; numero++){
            System.out.println(aleatorio.nextInt(dadoQ)+1);
            numero++;
        soma += numero;
            System.out.println("A soma é: " + numero);


        }
    }
}
