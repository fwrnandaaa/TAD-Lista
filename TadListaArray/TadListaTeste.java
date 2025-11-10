public class TadListaTeste{
    public static void main(String[] args){
        TadListaArray v = new TadListaArray(10);
        v.insertFirst(10);
        v.insertBefore(10, 9);
        v.verLista();
       System.out.println("Primeiro elemento:"+ v.first());
       System.out.println("Ultimo elemento:"+ v.last());
     System.out.println("9 é o primeiro elemento? " + v.isFirst(9));
        System.out.println("10 é o ultimo elemento? "+ v.isLast(10));
    }
}