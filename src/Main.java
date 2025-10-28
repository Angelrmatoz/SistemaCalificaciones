import static java.lang.IO.println;
import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);
    println("Introduce tu calificación para proporcionarte tu evaluación: ");
    int calificacion = Integer.parseInt(scanner.nextLine());

    if (calificacion >= 9 && calificacion <= 10) {
        println("Sacaste una A");
    } else if (calificacion >= 8 && calificacion < 9) {
        println("Sacaste una B");
    } else if (calificacion >= 7 && calificacion < 8) {
        println("Sacaste una C");
    } else if (calificacion >= 6 && calificacion < 7) {
        println("Sacaste una D");
    } else if (calificacion >= 0 && calificacion < 6) {
        println("Sacaste una F, ¡estás reprobado!");
    } else {
        println("Calificación no válida");
    }
}
