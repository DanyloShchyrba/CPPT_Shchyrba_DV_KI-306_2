package KI306.Shchyrba.Lab6;
/**
 * An interface representing an item.
 */
interface Item extends Comparable<Item> {
    /**
     * Gets the size of the item.
     * @return The size of the item.
     */
    int getSize();

    //int compareTo(Item item);

    /**
     * Prints information about the item.
     */
    void print();
}