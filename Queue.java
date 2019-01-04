public class Queue<T> {
    private T q[];
    private int head , tail, size;

    public Queue(int size) {
        this.size = size;
        this.q = (T[]) new Object[size];
        head = tail = -1;
    }

    public boolean isFull() {
        return (tail + 1) % size == head;
    }

    public boolean isEmpty() {
        return (head == 0 && tail == 0);
    }

    public void insert(T datum) throws IllegalStateException {
        if(isFull()){
            throw new IllegalStateException("queue is full");
        }
        if (isEmpty()) {
            head = tail = 0;
        }
        else {
            tail = (tail + 1) % size;
        }
        q[tail] = datum;
    }

    public void delete() throws IllegalStateException {
        //T temp;
        if(isEmpty()){
            //System.out.print("empty");
            throw new IllegalStateException("queue is empty");
            //return;
        }
        if(head == tail){
           // temp = q[head];
            head = tail = -1;
            return;
        }
        else {
           // temp = q[head];
            head = (head + 1) % size;
        }

    }

    public void print() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
            int i = head;
            while(i != tail){
                i = (i + 1) % size;
                System.out.print(q[i] + " ");
            }
            System.out.println(q[tail]);
        }
    }