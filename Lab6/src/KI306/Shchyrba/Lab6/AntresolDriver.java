package KI306.Shchyrba.Lab6;

public class AntresolDriver {
	
	/**
     * The main entry point for the application.
     * @param args Command line arguments.
     */
        public static void main(String[] args) {
            Antresol<? super Item> suitcase = new Antresol<>();

            System.out.println();
            suitcase.addItem(new Hat("Fedora","Gucci", 35));
            suitcase.addItem(new Hat("Cap", "Gap", 32));

            suitcase.addItem(new Scarf("Brown", 20));
            suitcase.addItem(new Scarf("Amber", 25));
 

            suitcase.removeItem(3);

            System.out.print("\nContents of Antresol: \n");
            suitcase.printContents();

            Item minItem = suitcase.findMin();
            System.out.print("\nThe smallest item in the Antresol is: ");
            minItem.print();
        }
    }

