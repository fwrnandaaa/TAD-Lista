
public class TadListaLL {

    private Node head;
    private Node tail;
    int size;

    private static class Node {

        Object value;
        Node next;
        Node prev;

        Node(Object value) {
            this.value = value;
            this.prev = null;
            this.next = null;
        }
    }

    public TadListaLL() {
        this.head = new Node(null);
        this.tail = new Node(null);
        head.next = tail;
        tail.prev = head;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public boolean isFirst(Object O) {
        if (size == 0) {
            throw new TadListaLLExcecao("A lista está vazia.");
        }
        if (head.next.value.equals(O)) {
            return true;
        }
        return false;
    }

    public boolean isLast(Object O) {
        if (size == 0) {
            throw new TadListaLLExcecao("A lista está vazia.");
        }
        if (tail.prev.value.equals(O)) {
            return true;
        }
        return false;
    }

    public Object first() {
        if (size == 0) {
            throw new TadListaLLExcecao("A lista está vazia.");
        }
        return head.next.value;
    }

    public Object last() {
        if (size == 0) {
            throw new TadListaLLExcecao("A lista está vazia.");
        }
        return tail.prev.value;
    }

    public void insertFirst(Object O) {
        Node current = new Node(O);
        if (size == 0) {
            current.prev = head;
            current.next = tail;
            head.next = current;
            tail.prev = current;
            size++;
        } else {
            current.next = head.next;
            head.next.prev = current;
            head.next = current;
            current.prev = head;
            size++;
        }
    }

    public void verListaLL() {
        Node current = head.next;
        for (int i = 0; i < size; i++) {
            System.err.println(current.value + " ");
            current = current.next;
        }
    }
    public void insertBeforeLL(Object N, Object O){
        Node novo = new Node(O);
        if(size==0){
            throw new TadListaLLExcecao("A lista está vazia.");
        }
        Node current = head.next;
        while(current.value != null){
             if(current.value.equals(N)){
                novo.prev = current.prev;
                novo.next = current;
                current.prev.next = novo;
                size++;
                break;
            }
            else{
                current=current.next;
            }
        }
    }
}
