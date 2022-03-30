import java.util.LinkedList;
import java.util.Queue;
/*
 ****************************************************************************************************
 * Queue is a FIFO (First-in First-out) data structure. It's a collection used for holding elements *
 * prior to processing linear data structure.                                                       *
 *                                                                                                  *
 *    add =  enqueue, offer                                                                         *
 *    remove =  dequeue, poll                                                                       *
 *    examine = element, peek                                                                       *
 *                                                                                                  *
 * Queues inherit everything from Collection                                                         *
 ****************************************************************************************************                                                      *
 */
public class Queues {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.offer("Katy");
        queue.offer("Steve");
        queue.offer("Elliot");

        System.out.println(queue);
        System.out.println(queue.peek() + " is the first one in the queue.");

        String left = queue.poll();
        System.out.println();
        System.out.println(left + " has left the queue.");
        System.out.println(queue);

    }
}
