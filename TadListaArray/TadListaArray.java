
public class TadListaArray {

    private int size;
    private Object[] TadListaArray;

    public TadListaArray(int capacidadeInicial) {
        TadListaArray = new Object[capacidadeInicial];
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

    public Object first() {
        if (size == 0) {
            throw new TAdListaExcecao("Lista vazia.");
        } else {
            return TadListaArray[0];
        }
    }

    public Object last() {
        if (size == 0) {
            throw new TAdListaExcecao("Lista vazia.");
        } else {
            return TadListaArray[size - 1];
        }
    }

    public Object before(int p) {
        if (size == 0 || p >= size || p <= 0) {
            throw new TAdListaExcecao("índice não encontrado.");
        } else {
            return TadListaArray[p - 1];
        }
    }

    public Object after(int p) {
        if (size == 0 || p >= size - 1 || p < 0) {
            throw new TAdListaExcecao("índice não encontrado.");
        } else {
            return TadListaArray[p + 1];
        }
    }

    public boolean isFirst(Object n) {
        if (size == 0) {
            throw new TAdListaExcecao("Lista vazia.");
        }
        if (TadListaArray[0] == n) {
            return true;
        }
        return false;
    }

    public boolean isLast(Object n) {
        if (size == 0) {
            throw new TAdListaExcecao("Lista vazia.");
        }
        if (TadListaArray[size - 1] == n) {
            return true;
        }
        return false;
    }

    public void insertBefore(Object n, Object O) {
        if (size == 0) {
            throw new TAdListaExcecao("Lista vazia.");
        }
        int indice = -1;
        for (int i = 0; i < size; i++) {
            if (TadListaArray[i].equals(n)) {
                indice = i;
                break;
            }
        }
        if (indice == -1) {
            throw new TAdListaExcecao("Elemento não encontrado.");
        }
        Object[] aux = new Object[size + 1];
        for (int i = 0; i < indice; i++) {
            aux[i] = TadListaArray[i];
        }
        aux[indice] = O;
        for (int i = indice; i < size; i++) {
            aux[i + 1] = TadListaArray[i];
        }
        size++;
        TadListaArray = aux;
    }

    public void verLista() {
        for (int i = 0; i < size; i++) {
            System.out.println(TadListaArray[i] + " ");
        }

    }

    public void insertAfter(Object n, Object O) {
        if (size == 0) {
            throw new TAdListaExcecao("Lista vazia.");
        }
        int indice = -1;
        for (int i = 0; i < size; i++) {
            if (TadListaArray[i].equals(n)) {
                indice = i + 1;
                break;
            }
        }
        if (indice == -1) {
            throw new TAdListaExcecao("Elemento não encontrado.");
        }
        Object[] aux = new Object[size + 1];
        for (int i = 0; i < indice; i++) {
            aux[i] = TadListaArray[i];
        }
        aux[indice] = O;
        for (int i = indice; i < size; i++) {
            aux[i] = TadListaArray[i];
        }
        TadListaArray = aux;
        size++;

    }

    public void insertFirst(Object O) {
        if (size == 0) {
            TadListaArray[0] = O;
            size++;
        } else {
            Object[] aux = new Object[size + 1];
            aux[0] = O;
            for (int i = 0; i < size; i++) {
                aux[i + 1] = TadListaArray[i];
            }

            TadListaArray = aux;
            size++;
        }
    }

    public void insertLast(Object O) {
        TadListaArray[size - 1] = O;
        size++;
    }
    public void swapElements(Object n, Object O){
        
    }
}
