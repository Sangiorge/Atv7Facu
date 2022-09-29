import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Requisito 1: Entre com lado de um quadrado
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com medida do lado do quadrado: ");
        double lado = scanner.nextDouble();
        scanner.close();

        // Requisito 2: Calcule o lado do quadrado
        double area = lado * lado;
        double dobroArea = area * 2;

        // Requisito 3: Imprima o resultado do dobro da area
        System.out.print("O dobro da area do quadrado digitado será: " + dobroArea);

    }
}
