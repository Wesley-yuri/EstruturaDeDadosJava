package refazendo.Enqueue.dequeue;

public class Main {
    public static void main(String[] args) {

        Fila minhaFila = new Fila();

        minhaFila.enqueue(new No("primeiro 1 "));
        minhaFila.enqueue(new No("segundo 2 "));
        minhaFila.enqueue(new No("terceiro 3 "));
        minhaFila.enqueue(new No("quarto 4 "));

        System.out.println(minhaFila);
        System.out.println(minhaFila.first());
        System.out.println(minhaFila);

    }
}
