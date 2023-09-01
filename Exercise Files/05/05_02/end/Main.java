import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList();

        queue.add("Sam");
        queue.add("Anna");
        queue.add("Heidi");
        queue.add("Sally");
        queue.add("Charlotte");

        System.out.println(queue);

        System.out.println("Next up! " + queue.peek());

        while(!queue.isEmpty()) {
            String removed = queue.remove();
            System.out.println(removed);
        }
    }

}












