public class TadListaLLTeste{
    public static void main(String[] args){
        TadListaLL v = new TadListaLL();
        v.insertFirst(10);
        v.verListaLL();
        System.out.println("First: "+ v.first());
        System.out.println("Last: "+ v.last());
        v.insertBefore(10, 9);
        v.verListaLL();
    }
}