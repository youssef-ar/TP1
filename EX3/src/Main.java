
public class Main {
    public static void main(String[] args) {
        // Create a CustomArrayList
        CustomArrayList customList = new CustomArrayList();

        // Add elements to the list
        customList.add("Element 1");
        customList.add("Element 2");
        customList.add("Element 3");

        // Display the size of the list
        System.out.println("Size of the list: " + customList.size());

        // Display elements in the list
        System.out.println("Elements in the list:");
        for (int i = 0; i < customList.size(); i++) {
            System.out.println(customList.get(i));
        }

        // Check if an element is in the list
        System.out.println("Is 'Element 2' in the list? " + customList.isIn("Element 2"));

        // Find the index of an element
        System.out.println("Index of 'Element 3': " + customList.find("Element 3"));

        // Remove an element
        customList.remove("Element 1");

        // Display elements in the modified list
        System.out.println("Elements in the modified list:");
        for (int i = 0; i < customList.size(); i++) {
            System.out.println(customList.get(i));
        }
    }
}