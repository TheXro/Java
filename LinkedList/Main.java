package LinkedList;

public class Main {
    public static void main(String[] args) {//fsdf
        LL ll = new LL();
        ll.InserFirst(1);
        ll.InserFirst(2);
        ll.InserFirst(3);
        ll.InserFirst(4);
        //display and size
        ll.Display();
        ll.Size();
        //insert last
        ll.InsertLast(5);
        ll.InsertLast(6);
        ll.Display();
        ll.Size();

        ll.InsertAtIndex(7, 0);
        ll.Display();

        ll.InsertAtIndex(8, 3);
        ll.Display();
        
        //delete first
        System.out.println(ll.DeleteFirst());
        ll.Display();

        //delete last
        System.out.println(ll.DeleteLast());
        ll.Display();

        //delete at index
        System.out.println(ll.DeleteAtIndex(2));
        ll.Display();

        //search
        System.out.println(ll.Find(5));
        System.out.println(ll.Find(10));

    }
}
