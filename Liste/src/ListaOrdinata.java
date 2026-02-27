public class ListaOrdinata<T extends Comparable<T>> extends Lista<T> {
    
    Nodo<T> head;
 
    public void add( T v ) {
        Nodo<T> n = new Nodo<T>(v);
        if (head==null || head.getValue().compareTo(v)>0) {
            n.setNext(head);
            head = n;
            return;
        } else {
            Nodo<T>  temp = head;
            while (temp.getNext()!=null && temp.getNext().getValue().compareTo(v)<0) temp=temp.getNext();
            n.setNext(temp.getNext());
            temp.setNext(n);
        }
    }

}
