public class Main {
    public static void main(String[] args) {
        FilaCircular<Integer> fila = new FilaCircular<>(5);

        fila.enqueue(1);
        fila.enqueue(2);
        fila.enqueue(3);
        System.out.println("Frente da fila: " + fila.front());

        System.out.println("Removendo: " + fila.dequeue());
        System.out.println("Novo frente da fila: " + fila.front());

        fila.enqueue(4);
        fila.enqueue(5);
        fila.enqueue(6);

        System.out.println("Tamanho da fila: " + fila.size());

        while (!fila.isEmpty()) {
            System.out.println("Removendo: " + fila.dequeue());
        }
    }
}
