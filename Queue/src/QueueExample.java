import java.util.*;
   class QueueExample {
        public static void main(String args[]){
// creating priority queue
            PriorityQueue queue=new PriorityQueue <String>();
            queue.add(1);                             // adding elements
            queue.add(2);
            queue.add(3);
            queue.add(4);
            queue.add(5);
            queue.add(6);
            System.out.println("iterating the queue elements:");
            Iterator itr=queue.iterator();
            while(itr.hasNext()){
                System.out.println(itr.next());
            }
            System.out.println("Elements removed:");
            System.out.println(queue.remove());
            System.out.println(queue.poll());
            System.out.println("after removing two elements:");
            Iterator itr2=queue.iterator();
            while(itr2.hasNext()){
                System.out.println(itr2.next());
            }
        }
    }

