public class TadListaLLTeste {
    public static void main(String[] args){
        TadListaLL v = new TadListaLL();
        TadListaLL.Node aux = new TadListaLL.Node(15);
        v.insertFirst(aux);
        v.verListaLL();
    }
}