import java.util.HashSet;
import java.util.Iterator;
import java.util.*;
class HashSetUnique {

        public static void main(String args[]){

            HashSet al=new HashSet(); // creating hashSet
            al.add(1);                 // adding elements
            al.add(2);
            al.add(3);
            al.add(3);
            al.add(1);
            Iterator itr=al.iterator();
            while(itr.hasNext()){
                System.out.println(itr.next());
            }
        }
    }

