package KI306.Shchyrba.Lab6;

import java.util.ArrayList;


public class Antresol<T extends Item> {
   private ArrayList<T> items;

   /**
    * Constructs a new Antresol object.
    */
   public Antresol() {
       items = new ArrayList<>();
   }

   /**
    * Finds the item with the minimum size in the Antresol.
    * @return The item with the minimum size, or null if the Antresol is empty.
    */
   public T findMin() {
       if (!items.isEmpty()) {
           T min = items.get(0);
           for (int i = 1; i < items.size(); i++) {
               if (items.get(i).compareTo(min) < 0)
                   min = items.get(i);
           }
           return min;
       }
       return null;
   }
   /**
    * Adds an item to the suitcase.
    * @param item The item to be added.
    */
   public void addItem(T item) {
       items.add(item);
       System.out.print("Item added: ");
       item.print();
   }

   /**
    * Removes an item from the suitcase at the specified index.
    * @param i The index of the item to be removed.
    */
   public void removeItem(int i) {
       if (i >= 0 && i < items.size()) {
           items.remove(i);
           System.out.println("Item removed at index " + i);
       } else {
           System.out.println("Invalid index. Cannot remove item.");
       }
   }

   
   public void printContents() {
       if (!items.isEmpty()) {
           for (T item : items) {
               item.print();
           }
       } else {
           System.out.println("Antresol is empty. No items available.");
       }
   }
}


class Hat implements Item {
   private String hatType;
   private String hatBrand;
   private int hatSize;

  
   
   public Hat(String hType, String hBrand, int hSize) {
       hatType = hType;
       hatBrand = hBrand;
       hatSize = hSize;
   }

   // SET + GET [TYPE]
   public String getHatType() {
       return hatType;
   }

   public void setHatType(String type) {
       hatType = type;
   }

   // SET + GET [BRAND]
   public String getHatBrand() {
       return hatBrand;
   }

   public void setHatBrand(String brand) {
       hatBrand = brand;
   }

   // SET [SIZE]
   public void setHatSize(int size) {
       hatSize = size;
   }

   // Implementing methods from Item interface:
   public int getSize() {
       return hatSize;
   }

   public int compareTo(Item item) {
       Integer s = hatSize;
       return s.compareTo(item.getSize());
   }

   public void print() {
       System.out.println("[Hat]");
       System.out.println("  Type: " + hatType);
       System.out.println("  Brand: " + hatBrand);
       System.out.println("  Size: " + hatSize);
       System.out.println();
   }
}

/**
* A class representing Scarfs.
*/
class Scarf implements Item {
   private String scarfColor;
   private int scarfLength;

  
   
   public Scarf(String sColor,  int sLength) {
       scarfColor = sColor;
       scarfLength = sLength;
     
   }

   // SET + GET [Color]
   public String getScarfColor() {
       return scarfColor;
   }
   public void setScarfColor(String color) {
       scarfColor = color;
   }


   // SET [Length]
   public void SetBookSize(int n) {
       scarfLength = n;
   }

   // Implementing methods from Item interface:
   public int getSize() {
       return scarfLength;
   }
   public int compareTo(Item item) {
       Integer s = scarfLength;
       return s.compareTo(item.getSize());
   }
   public void print() {
       System.out.println("[Scarf]");
       System.out.println("  Color: " + scarfColor);
       System.out.println("  Length: " + scarfLength);
       System.out.println();
   }
}
