package L8_Json_test.entity;

public class Node<T> {
    public T value;
    public String desString;

    public Node(T value, String desString) {
        this.value = value;
        this.desString = desString;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", desString='" + desString + '\'' +
                '}';
    }
}
