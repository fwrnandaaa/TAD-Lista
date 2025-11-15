
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
    public void aumenta

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
       
    }

    public void verLista() {
        for (int i = 0; i < size; i++) {
            System.out.println("Tamanho: " + i + "Object: " + TadListaArray[i] + " ");
        }

    }

    public void insertAfter(Object n, Object O) {
       

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
        size++;
        TadListaArray[size-1] = O;

    }

    public void swapElements(Object n, Object O) {
        if (size == 0) {
            throw new TAdListaExcecao("A lista está vazia");
        }
        for (int i = 0; i < size; i++) {
            if (TadListaArray[i].equals(n)) {
                TadListaArray[i] = O;

            }
        }
        throw new TAdListaExcecao("Elemento não encontrado.");
    }
}
