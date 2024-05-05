import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        String operacao = "1";


        while (!operacao.equalsIgnoreCase("q")){
            calc.menu();
            operacao = sc.next();
            int a;
            int b;
            switch (operacao){
                case "1":
                    System.out.println("Digite um numero: ");
                    a = sc.nextInt();
                    System.out.println("Digite um numero: ");
                    b = sc.nextInt();
                    System.out.println("Resultado: " + calc.soma(a, b));
                    break;

                case "2":
                    System.out.println("Digite um numero: ");
                    a = sc.nextInt();
                    System.out.println("Digite um numero: ");
                    b = sc.nextInt();
                    System.out.println("Resultado: " + calc.subtracao(a, b));
                    break;

                case "3":
                    System.out.println("Digite um numero: ");
                    a = sc.nextInt();
                    System.out.println("Digite um numero: ");
                    b = sc.nextInt();
                    System.out.println("Resultado: " + calc.multiplicacao(a, b));
                    break;

                case "4":
                    System.out.println("Digite o numerador: ");
                    a = sc.nextInt();
                    System.out.println("Digite o denominador: ");
                    b = sc.nextInt();
                    if(b == 0){
                        System.out.println("Impossível realizar uma divisão por Zero");
                    }else System.out.println("Resultado: " + calc.divisao(a, b));
                    break;

                case "5":
                    System.out.println("Digite um numero: ");
                    a = sc.nextInt();
                    System.out.println("Digite a potencia: ");
                    b = sc.nextInt();
                    if(b == 0){
                        System.out.println("Todo numro elevado a zero é zero!");
                    }else System.out.println("Resultado: " + calc.potencia(a, b));
                    break;

                case "6":
                    System.out.println("Digite um numero: ");
                    a = sc.nextInt();
                    if(a < 0){
                        System.out.println("Não existe raiz de numero negativo!");
                    }else System.out.println("Resultado: " + calc.raiz(a));
                    break;

                case "q":
                    System.out.println("Adeus!");
                    break;

                default:
                    System.out.println("Opcão inválida, tente novamente!");
                    break;
            }
            System.out.println("----------------------------------------");
        }
    }
}
