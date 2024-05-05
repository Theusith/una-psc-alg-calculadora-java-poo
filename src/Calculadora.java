public class Calculadora {

    public void menu(){
        System.out.println("Digite 1 para soma.");
        System.out.println("Digite 2 para subtração.");
        System.out.println("Digite 3 para multiplicação.");
        System.out.println("Digite 4 para divisão.");
        System.out.println("Digite 5 para uma potência.");
        System.out.println("Digite 6 para raiz quadrada.");
        System.out.println("Digite 'q' para sair.  ");
    }
    public int soma(int a, int b) {
        return a + b;
    }
    public int subtracao(int a, int b) {
        return a - b;
    }
    public int multiplicacao(int a, int b) {
        return a * b;
    }
    public double divisao(int a, int b) {
        return (double) a / b;
    }
    public double potencia(int a, int b) {
        return Math.pow(a, b);
    }
    public double raiz(int a) {
        return Math.sqrt(a);
    }
}
