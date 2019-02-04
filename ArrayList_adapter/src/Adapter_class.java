import java.util.ArrayList;

/**

* class using class adapter technique to use array list for implementing

* methods in List interface

*/

@SuppressWarnings("serial")
public class Adapter_class extends ArrayList<Object>{

              public int count() {
                           // size() is equivalent of count
                           return size();
              }
        
              public Object first() {
                           // returning element at 0 if not empty
                           if (size() > 0) {
                                         return get(0);
                           }
                           return null;
              }
    
              public Object last() {
                           // returning element at index size-1 if not empty
                           if (size() > 0) {
                                         return get(size() - 1);
                           }
                           return null;
              }
    
              public boolean include(Object object) {
                           // contains() is equal to include
                           return contains(object);
              }
     
              public void append(Object obj) {
                           // add() is equal to append
                           add(obj);
              }
   
              public void prepend(Object obj) {
                           // adding to index 0
                           add(0, obj);
              }

              public void delete(Object obj) {
                           if (contains(obj)) {
                                         // removing object if present
                                         remove(obj);
                           }
              }

              public void deleteLast() {
                           // removing last element if not empty
                           if (size() > 0) {
                                         remove(size() - 1);
                           }
              }

             public void deleteFirst() {
                           // removing first element if not empty
                           if (size() > 0) {
                                         remove(0);
                           }
              }

              public void deleteAll() {
                           // clearing all elements
                           clear();
              }
}
              