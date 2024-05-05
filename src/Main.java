import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        calc.menu();
        String operacao = sc.next();

        while (operacao.equalsIgnoreCase("q")){
            calc.menu();
            int a = sc.nextInt();
            int b = sc.nextInt();
            switch (operacao){
                case "1":
                    System.out.println(calc.soma(a, b));
                    break;
                case "2":
                    System.out.println(calc.subtracao(a, b));
                    break;
                case "3":
                    System.out.println(calc.multiplicacao(a, b));
                case "4":
                    if(b == 0){
                        System.out.println("Impossível realizar uma divisão por Zero");
                    }else System.out.println(calc.divisao(a, b));
                    break;
                case "5":
                    System.out.println(calc.potencia(a, b));
                    break;
                case "6":
                    System.out.println(calc.raiz(a));
                    break;
                case "7":
                    System.out.println("Adeus!");
                    break;
                default:
                    System.out.println("Opcão inválida, tente novamente!");
            }
            operacao = sc.next();
        }


    }
}
