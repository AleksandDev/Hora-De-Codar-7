import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //exercício 1
        String Planeta = "Plutão";
        System.out.println(Planeta);

        //exercício 2 e 3
        Scanner entradaDados = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String text = entradaDados.next();
        System.out.println("Olá" + text);
        System.out.println("Digite sua idade");
        int idade = entradaDados.nextInt();
        System.out.println("Olá" + text + "sua idade é" + idade);

        //exercício 4 retângulo
        System.out.println("Digite a base: ");
        int base = entradaDados.nextInt();
        System.out.println("Digite a altura: ");
        int altura = entradaDados.nextInt();
        System.out.println("O resultado é: " + base * altura);

        //exercício 4.2 quadrado
        System.out.println("Digite o lado 1: ");
        int lado1 = entradaDados.nextInt();
        System.out.println("Digite a lado 2: ");
        int lado2 = entradaDados.nextInt();
        System.out.println("O resultado é: " + lado1 * lado2 );

        //exercício 4.3 losango
        System.out.println("Digite o diagonal maior: ");
        int diagonalmaior = entradaDados.nextInt();
        System.out.println("Digite a diagonal menor: ");
        int diagonalmenor = entradaDados.nextInt();
        System.out.println("O resultado é: " + (diagonalmaior * diagonalmenor) / 2 );

        //exercício 4.4 trapézio
        System.out.println("Digite a base maior: ");
        int basemaior = entradaDados.nextInt();
        System.out.println("Digite a base menor: ");
        int basemenor = entradaDados.nextInt();
        System.out.println("O resultado é: " + (basemaior + basemenor) * 2 );

        //exxercíciio 4.5 paralelogramo
        System.out.println("Digite a base: ");
        int base2 = entradaDados.nextInt();
        System.out.println("Digite a altura: ");
        int altura2 = entradaDados.nextInt();
        System.out.println("O resultado é: " + base2 * altura2);

        //exercício 4.6 triângulo
        System.out.println("Digite a base: ");
        int base3 = entradaDados.nextInt();
        System.out.println("Digite a altura: ");
        int altura3 = entradaDados.nextInt();
        System.out.println("O resultado é: " + (base3 * altura3) / 2);

        //exercício 4.7 círculo
        System.out.println("Digite a base: ");
        double pi = 3.1415;
        System.out.println("Digite a altura: ");
        int r = entradaDados.nextInt();
        System.out.println("O resultado é: " + (pi * r) / 2);

        // exercício 5
        System.out.println("Digite um valor");
        double valor = entradaDados.nextDouble();
        if (valor > 0) {
            System.out.println("O valor é Positivo");
        } if (valor == 0) {
            System.out.println("O valor é Neutro");
        } else {
            System.out.println("O valor é Negativo");
        }

        //exercício 6
        System.out.println("Digite o primeiro valor: ");
        int num1 = entradaDados.nextInt();
        System.out.println("Digite o segundo valor: ");
        int num2 = entradaDados.nextInt();
        System.out.println("Digite o terceiro valor: ");
        int num3 = entradaDados.nextInt();
        if(num1 > num2) {
            System.out.println("O valor maior é: " + num1);
            if (num1 > num3) {
                System.out.println("O valor maior é: " + num1);
            }
            if ((double) num2 > num1) {
                System.out.println("O valor maior é: " + num2);
            }
            if (num2 > num3) {
                System.out.println("O valor maior é: " + num2);
            }
            if (num3 > num2) {
                System.out.println("O valor maior é: " + num3);
            }
            if (num3 > num1) {
                System.out.println("O valor maior é: " + num3);
            }

            //exercício 6.2
            System.out.println("Digite o primeiro valor: ");
            int v1 = entradaDados.nextInt();
            System.out.println("Digite o segundo valor: ");
            int v2 = entradaDados.nextInt();
            System.out.println("Digite o terceiro valor: ");
            int v3 = entradaDados.nextInt();
            System.out.println("Digite o quarto valor: ");
            int v4 = entradaDados.nextInt();
            if (v1 > v2 || v1 > v3 || v1 > v4) {
                System.out.println("O valor maior é: " + v1);
            }
            if (v2 > v1 || v2 > v3 || v2 > v4) {
                System.out.println("O valor maior é: " + v2);
            }
            if (v3 > v1 || v3 > v2 || v3 > v4) {
                System.out.println("O valor maior é: " + v3);
            }
            if (v4 > v1 || v4 > v2 || v4 > v3) {
                System.out.println("O valor maior é: " + v4);
            }


            // exercício 7
            System.out.println("Digite um valor: ");
            int value1 = entradaDados.nextInt();
            System.out.println("Digite outro valor: ");
            int value2 = entradaDados.nextInt();
            System.out.println("Digite mais um valor: ");
            int value3 = entradaDados.nextInt();
            if (value1 > value2 & value2 > value3) {
                System.out.println(value1 + value2);
            }
            if (value2 > value1 || value3 > value1) {
                System.out.println(value2 + value3);
            }
            if (value3 > value2 || value1 > value3) {
                System.out.println(value3 + value1);
            }


            // exercício 7.1
            System.out.println("Digite o primeiro valor");
            int primeiroValor = entradaDados.nextInt();
            System.out.println("Digite o segundo valor");
            int segundoValor = entradaDados.nextInt();
            System.out.println("Digite o terceiro valor");
            int terceiroValor = entradaDados.nextInt();
            System.out.println("Digite o quarto valor");
            int quartoValor = entradaDados.nextInt();
            System.out.println("Digite o quinto valor");
            int quintoValor = entradaDados.nextInt();
            int primeiroValorMaior = primeiroValor;
            int segundoValorMaior = segundoValor;

            if (segundoValor > primeiroValorMaior) {
                primeiroValorMaior = segundoValor;
                segundoValorMaior = primeiroValor;
            }
            if (terceiroValor > primeiroValorMaior) {
                segundoValorMaior = primeiroValorMaior;
                primeiroValorMaior = terceiroValor;
            } else if (terceiroValor > segundoValorMaior) {
                segundoValorMaior = terceiroValor;
            }
            if (quartoValor > primeiroValorMaior) {
                segundoValorMaior = primeiroValorMaior;
                primeiroValorMaior = quartoValor;
            } else if (quartoValor > segundoValorMaior) {
                segundoValorMaior = quartoValor;
            }
            if (quintoValor > primeiroValorMaior) {
                segundoValorMaior = primeiroValorMaior;
                primeiroValorMaior = quintoValor;
            } else if (quintoValor > segundoValorMaior) {
                segundoValorMaior = quintoValor;
            }
            int somaNumeros = primeiroValorMaior + segundoValorMaior;
            System.out.println("A soma dos dois maiores numeros é" + somaNumeros);
        }

        //exercício 8
        System.out.println("Digite um número: ");
        float numero1 = entradaDados.nextFloat();
        System.out.println("Digite um número: ");
        float numero2 = entradaDados.nextFloat();
        if(numero1 == 0) {
            System.out.println("Digite outro número: ");
        } if(numero2 <=0){
            System.out.println("Digite outro número: ");
        } else {
            System.out.println("Resultado: " + numero1 / numero2);
        }


        //exercício 9
        System.out.println("Digite o primeiro valor: ");
        int nmr1 = entradaDados.nextInt();
        System.out.println("Digite o primeiro valor: ");
        int nmr2 = entradaDados.nextInt();
        System.out.println("Digite o primeiro valor: ");
        int nmr3 = entradaDados.nextInt();
        System.out.println("Digite o primeiro valor: ");
        int nmr4 = entradaDados.nextInt();
        System.out.println("Digite o primeiro valor: ");
        int nmr5 = entradaDados.nextInt();
        System.out.println("Digite o primeiro valor: ");
        int nmr6 = entradaDados.nextInt();
        System.out.println("Digite o primeiro valor: ");
        int nmr7 = entradaDados.nextInt();
        System.out.println("Digite o primeiro valor: ");
        int nmr8 = entradaDados.nextInt();
        System.out.println("Digite o primeiro valor: ");
        int nmr9 = entradaDados.nextInt();
        System.out.println("Digite o primeiro valor: ");
        int nmr10 = entradaDados.nextInt();
        int medianum = (nmr1 + nmr2 + nmr3 + nmr4 + nmr5 + nmr6 + nmr7 + nmr8 + nmr9 + nmr10) / 10;
        System.out.println("Os números tem a média: " + medianum);


        //exercício 10
        System.out.println("Digite a primeira nota: ");
        int nota1 = entradaDados.nextInt();
        System.out.println("Digite a segunda nota: ");
        int nota2 = entradaDados.nextInt();
        System.out.println("Digite a terceira nota: ");
        int nota3 = entradaDados.nextInt();
        System.out.println("Digite a quarta nota: ");
        int nota4 = entradaDados.nextInt();
        double media = (double)(nota1 + nota2 + nota3 + nota4) / 4;
        if(media >= 6.0) {
            System.out.println("Parabéns, Você foi Aprovado!");
        } else {
            System.out.println("Você foi REPROVADO!");
        }

        //exercício 11
        for (int i = 30; i >= 0; i--) {
            System.out.println(i);
        }

        //exercício 12
        for (int j = 10; j >=0; j--) {
            System.out.println(j);
        }

        //exercício 13
        System.out.println("Digite um número:");
        int primeiroNum = entradaDados.nextInt();
        int segundoNum = entradaDados.nextInt();
        int soma = 0;
        int qtdNum = primeiroNum - segundoNum + 1;
        double mediaNum = (double) soma / qtdNum;
        for (int i = primeiroNum; i <= segundoNum; i++) {
            soma += i;
        }
        System.out.println("A média aritmética dos números entre " + primeiroNum + " e " + segundoNum + " é: " + mediaNum);

        //exercício 14
        double nota;
        char resp = 's';

        do {
            double mediant = 0;
            double somant = 0;

            for (int i = 1; i <= 6; i++) {
                System.out.println("Qual a " + i + " nota?");
                nota = entradaDados.nextDouble();
                somant += nota;
            }

            mediant = somant / 6;

            if (mediant >= 6.5) {
                System.out.println("Aluno Aprovado!");
            } else {
                System.out.println("Aluno Reprovado!");
            }

            System.out.println("Deseja continuar?\n[s | n]");
            resp = entradaDados.next().charAt(0);
        } while(resp=='s');

        //exercício 15
        double alturaAnacleto = 1.50;
        double alturaFelisberto = 1.10;
        double crescimentoAnacleto = 0.02; // 2 cm/ano em metros
        double crescimentoFelisberto = 0.03; // 3 cm/ano em metros
        int anos = 0;
        while (alturaFelisberto <= alturaAnacleto) {
            alturaAnacleto += crescimentoAnacleto;
            alturaFelisberto += crescimentoFelisberto;
            anos++;
        }
        System.out.println("Felisberto será mais alto que Anacleto em " + anos + " anos.");
    }
}