public class TadListaLLTeste {
    public static void main(String[] args){
        TadListaLL v = new TadListaLL();
        TadListaLL.Node aux1 = new TadListaLL.Node(15);
        TadListaLL.Node aux2 = new TadListaLL.Node(10);
        TadListaLL.Node aux3 = new TadListaLL.Node(11);
        v.insertFirst(aux1);
        v.insertBeforeLL(aux1, aux2);
        v.insertAfterLL(aux1, aux3);
        v.verListaLL();
        System.out.println(v.size());
    }
}