@SuppressWarnings("unchecked")
public class FilaCircular<T> {
    private final T[] Q;
    private int f;
    private int r;
    private final int N;

    public FilaCircular(int capacidade) {
        N = capacidade;
        Q = (T[]) new Object[N];
        f = 0;
        r = 0;
    }

    public int size() {
        return (N - f + r) % N;
    }

    public boolean isEmpty() {
        return f == r;
    }

    public T front() {
        if (isEmpty()) {
            throw new EmptyQueueException("A fila está vazia.");
        }
        return Q[f];
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new EmptyQueueException("A fila está vazia.");
        }
        T temp = Q[f];
        Q[f] = null;
        f = (f + 1) % N;
        return temp;
    }

    public void enqueue(T e) {
        if (size() == N - 1) {
            throw new FullQueueException("A fila está cheia.");
        }
        Q[r] = e;
        r = (r + 1) % N;
    }
}
