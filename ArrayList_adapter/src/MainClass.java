import java.util.List;

public class MainClass {
	// main method for testing ArrayListAdapterClass

    public static void main(String[] args) {

                 List<Object> classAdapter = new Adapter_class();
                 System.out.println("**********************************************************");
                 System.out.println("*******COIS 3040 - Software Architecture and Design*******");
                 System.out.println("*************Adapter Class - Resultant Output*************");
                 System.out.println("**********************************************************");

                 ((Adapter_class) classAdapter).append("Nikhil");

                 ((Adapter_class) classAdapter).append("Natasha");

                 ((Adapter_class) classAdapter).append("Gokhan");

                 ((Adapter_class) classAdapter).prepend("Omar");

                 // should print [Omar, Nikhil , Natasha, Gokhan ]

                 System.out.println("Adapter Class Output List => " + classAdapter);

                 System.out.println("Does the list include Nikhil? => " + ((Adapter_class) classAdapter).include("Nikhil"));

                 System.out.println("Does the list include Nicholas? => " + ((Adapter_class) classAdapter).include("Nicholas"));

                 System.out.println("First in the list => " + ((Adapter_class) classAdapter).first());

                 System.out.println("Last in the list =>  " + ((Adapter_class) classAdapter).last());

                 System.out.println("*****Deleting first name from the list*****");

                 ((Adapter_class) classAdapter).deleteFirst();

                 System.out.println("New first name from the list => " + ((Adapter_class) classAdapter).first());

                 System.out.println("*****Deleting last name from the last*****");

                 ((Adapter_class) classAdapter).deleteLast();

                 System.out.println("New last name from the list: " + ((Adapter_class) classAdapter).last());

                 System.out.println("Count=> " + ((Adapter_class) classAdapter).count());

                 System.out.println("*****Delete all*****");

                 ((Adapter_class) classAdapter).deleteAll();

                 System.out.println("Count=> " + ((Adapter_class) classAdapter).count());

    }

}
