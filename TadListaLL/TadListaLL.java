public class TadListaLL{
    private Node head;
    private Node tail;
    int size;

    private static class Node{
        Object value;
        Node next;
        Node prev;
        Node(Object value){
            this.value = value;
            this.prev = null;
            this.next=null;
        }
    }
    public TadListaLL(){
        this.head = new Node(null);
        this.tail = new Node(null);
        head.next = tail;
        tail.prev = head;
        size=0;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        if(size==0){
            return true;
        }
        return false;
    }
    public boolean isFirst(Object O){
        if(size==0){
            throw new TadListaLLExcecao("A lista está vazia.");
        }
        if(head.next.value.equals(O)){
            return true;
        }
        return false;
    }
}