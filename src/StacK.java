import java.util.NoSuchElementException;
public class StacK<Item> {

    private static class Node<Item>{
        private Item data;
        private Node<Item> next;

    }


    private Node<Item> first;
    private int n;

    public StacK(){
        first = null;
        n = 0;

    }

    public int size(){
        return n;
    }


    public boolean isEmpty(){ return first == null; }



    public void push(Item data){
        Node <Item> oldfirst = first;
        first = new Node<Item>();
        first.data = data;
        first.next = oldfirst;
        n++;
    }

    public Item peek(){
        if (isEmpty())throw new NoSuchElementException("Stack is empty");
        return first.data;
    }

    public Item pop(){
        if (isEmpty())throw new NoSuchElementException("Stack is empty");
        else {
            Item data = first.data;
            first = first.next;
            n--;
            return data;
        }
    }




}








//implementation No.2
//    private static class Node{ // linked list helper class
//    Object data; // Creating data type Object in our stacK not just Integer.
//    Node next;
//
//        private Node(Object D, Node N){
//        data = D;
//        next = N;
//        }
//    }
//
//
//        Node first;
//        Node last;
//    public StacK(Node f, Node l){
//    first = f;
//    last = l;
//    first.next = last;
//    }
//
//    public StacK(){
//        first.next= last;
//    }
//
//    public Object Pop(){
//        if ( first == null){
//            throw new NoSuchElementException("the satck is null");
//        }
//        else {
//            Object item = last.data;
//            Node cont = first;
//            while ( cont.next.next != null) cont = cont.next;
//            last = cont;
//            return item;
//        }
//
//
//
//    }
//    public Object peek(){
//        if ( first == null ) throw new NoSuchElementException(" the stack is null") ;
//        else{ Object item = last.data;
//        return item;}
//
//    }
//
//
//    public void push(Object data ){
//        if ( first == null) first = new Node(data, null );
//        else {
//            last.next = new Node(data, null);
//            last = last.next;
//        }
//
//    }
//
//    public boolean empty(){
//        return first == null;
//    }
//
//    public
//
//}
