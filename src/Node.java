
public class Node
{
    public String name;
    public Node next,prev;
    @Override
    public String toString() {
        return "Node{"  +
                " name='" + name + '\'' +
                '}';
    }

    public boolean compareTo(String name) {
        if(this.name == name) return true;
        else return false;
    }

    public Node(String name) {
        this.name = name;
    }

}