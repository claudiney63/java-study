package iniciante.estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaSequencial {
    public static void main(String[] args) {
        System.out.println("Hello World! - Aula de Estrutura Sequencial");

        // variaveisTipos();
        // operacoesBasicas();
        // saidaDeDados();

        // exercicioFixacao();
        // areaTrapezio();
        // casting();
        entradaDeDados();
    }

    public static void variaveisTipos() {
        System.out.println("Variáveis e Tipos Básicos"); 

        //Tipos de variáveis
        int a = 10; // Números inteiros
        double b = 20.5; // Números decimais
        String c = "Maria"; // Texto
        char d = 'A'; // Caractere
        boolean e = false; // Verdadeiro ou falso
        long f = 1000L; // Números inteiros longos
        short g = 12345; // Números inteiros curtos
        byte h = 127; // Números inteiros pequenos

        System.out.println(((Object) a).getClass().getName());
        System.out.println(((Object) b).getClass().getName());
        System.out.println(((Object) c).getClass().getName());
        System.out.println(((Object) d).getClass().getName());
        System.out.println(((Object) e).getClass().getName());
        System.out.println(((Object) f).getClass().getName());
        System.out.println(((Object) g).getClass().getName());
        System.out.println(((Object) h).getClass().getName());

    }

    public static void operacoesBasicas() {
        System.out.println("Operações Básicas");

        int a = 10;
        int b = 20;

        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        int divisao = a / b;
        int resto = a % b;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Resto: " + resto);
    }

    public static void saidaDeDados() {
        System.out.println("Saída de Dados");

        //PrintLn
        System.out.println("Olá Mundo!");

        //Print
        System.out.print("Olá ");

        //PrintF
        System.out.printf("Olá %s", "Mundo!");

        //Concatenação
        String nome = "Maria";
        int idade = 30;
        double altura = 1.70;
        System.out.println("Nome: " + nome + " Idade: " + idade + " Altura: " + altura);

        //Casas decimais
        double x = 10.35784;
        System.out.printf("%.2f%n", x);

        //Formatando
        System.out.printf("%.4f%n", x);
        System.out.printf("%.2f%n", x);

        //Locale
        Locale.setDefault(Locale.US);
    }

    public static void exercicioFixacao() {
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.printf("%s, which price is $ %.2f\n", product1, price1);
        System.out.printf("%s, which price is $ %.2f\n", product2, price2);
        System.out.println();

        System.out.printf("Record: %d years old, code %d and gender: %c\n", age, code, gender);
        System.out.println();

        System.out.printf("Measure with eight decimal places: %.8f\n", measure);
        System.out.printf("Rounded (three decimal places): %.3f\n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f\n", measure);
    }

    public static void areaTrapezio() {
        double b, B, h, area;

        b = 6.0;
        B = 8.0;
        h = 5.0;

        area = (b + B) / 2.0 * h;

        System.out.println(area);
    }

    public static void casting() {
        int a, b;
        double resultado;

        a = 5;
        b = 2;

        resultado = (double) a / b;

        System.out.println(resultado);
    }

    public static void entradaDeDados() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String x;
        int y;
        double z;

        System.out.print("Digite um texto: ");
        x = sc.next();

        System.out.print("Digite um número inteiro: ");
        y = sc.nextInt();

        System.out.print("Digite um número decimal: ");
        z = sc.nextDouble();

        System.out.println("Dados digitados:");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        sc.close();
    }
}
