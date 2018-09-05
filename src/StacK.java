import java.util.NoSuchElementException;
public class StacK {

    private static class Node{
    Object data; // Creating data type Object in our stacK not just Integer.
    Node next;

        private Node(Object D, Node N){
        data = D;
        next = N;
        }
    }


        Node first;
        Node last;
    public StacK(Node f, Node l){
    first = f;
    last = l;
    first.next = last;
    }

    public StacK(){
        first.next= last;
    }

    public Object Pop(){
        if ( first == null){
            throw new NoSuchElementException("the satck is null");
        }
        else {
            Object item = last.data;
            Node cont = first;
            while ( cont.next.next != null) cont = cont.next;
            last = cont;
            return item;
        }



    }
    public Object peek(){
        if ( first == null ) throw new NoSuchElementException(" the stack is null") ;
    }

}
