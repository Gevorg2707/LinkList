package ACA;

public class Linkedlist<T> {
    private  Node<T> head;

    public Linkedlist(){
        head=new Node<>();
    }

    public T getHead(){
        return head.element;
    }

    public T getAt(int index){
        Node<T> temp=head;
        for (int i = 0; i < index; i++) {
            if(temp.nextNode==null){
                throw new ArrayIndexOutOfBoundsException("You are out of bouund");
            } else {
                temp=temp.nextNode;
            }
        }
        return temp.element;
    }
    public T getTail(int index){
        Node<T> temp=head;
       while (temp.nextNode!=null){
           temp=temp.nextNode;
       }
        return temp.element;
    }
    public  void addHead(T element) {
        Node<T> tempNode=new Node<>;
        tempNode.element=element;
        tempNode.nextNode=head;
        head=tempNode;
    }

}
