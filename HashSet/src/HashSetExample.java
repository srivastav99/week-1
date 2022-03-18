
    import java.util.*;
    class HashsetExample{
        public static void main(String args[]){

            HashSet al=new HashSet(); // creating hashSet
            al.add(1);                 // adding elements
            al.add(2);
            al.add(3);
            al.add(4);
            al.add(5);
            Iterator itr=al.iterator();
            while(itr.hasNext()){
                System.out.println(itr.next());
            }
        }
    }

