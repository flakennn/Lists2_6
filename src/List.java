public class List
{
    private Node head;
    private Node tail;

    public List()
    {
        head = null;
        tail = null;
    }

    public boolean IsEmpty()
    {
        return head == null;
    }

    public void addInHead(String name)
    {
        Node temp = new Node(name);
        if(IsEmpty()){
            head = temp;
            tail = temp;
        }
        else {
            head.prev = temp;
            temp.next = head;
            head = temp;
        }
    }
    public void add(String name)
    {
        Node temp = new Node(name);
        if(IsEmpty()){
            head = temp;
            tail = temp;
        }
        else if(name.length() <= head.name.length()) addInHead(name);
        else if(name.length() >= tail.name.length()) addInTail(name);
        else {
            Node prev = head;
            Node cur = prev.next;
            while (cur != null) {
                if ((name.length() >= prev.name.length())&&(name.length() < cur.name.length())) {
                    prev.next = temp;
                    cur.prev = temp;
                    temp.prev = prev;
                    temp.next = cur;
                }
                if(cur.next == null) return;
                prev = prev.next;
                cur = prev.next;

            }
        }
    }
    public void deleteNodeHead()
    {
        head = head.next;
    }

    public void deleteNodeTail() {
        tail.prev.next = null;
        tail.prev = null;
        //tail = tail.prev;
    }

    public void deleteNodeAt(String name) {
        if(head.compareTo(name)) head = head.next;
        else {
            Node prev = head;
            Node cur = prev.next;
            while (cur != null) {
                if (cur.compareTo(name)) {
                    prev.next = cur.next;
                }
                if(cur.next == null) return;
                prev = prev.next;
                cur = prev.next;

            }
        }
    }
    public void addInTail(String name)
    {
        Node temp = new Node(name);
        if(IsEmpty()){
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }

    }
    public void print()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.println(temp.toString());
            temp = temp.next;
        }
    }
    public void printHead()
    {
        System.out.println(this.head);
    }
}
