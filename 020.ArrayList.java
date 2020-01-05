--------------------GroceryList.java-----------------------
import java.util.ArrayList;

public class GroceryList{
    private int[] myNumber = new int[50];
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item){
        groceryList.add(item);


    }

    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items on your grocery list");
        for(int i=0;i< groceryList.size();i++){
            System.out.println((i+1) + ". " + groceryList.get(i));
        }   
    }

    public void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("Grocery Item " + (position+1) + " has been modified.");
    }

    public void removeGroceryItem(int position){
        String theItem = groceryList.get(position);
        groceryList.remove(position);

    }

    public String findItem(String searchItem){
        //boolean exists = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);
        if(position >= 0){
            return groceryList.get(position);
        }
        return null;

    }


}

-----------------------Main.java---------------------
import java.util.Scanner;

/**
 * Main
 */
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.println("Enter you choice :: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 0:
                    printInstructions();break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }

        
    }

    public static void printInstructions(){
        System.out.println("Enter Options and Enjoy brooo... :: ");
    }

    public static void addItem(){
        System.out.print("Pleae enter item :: " );
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.print("Pleae enter item number :: " );
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter replacement item :: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo-1, newItem);
    }

    public static void removeItem(){
        System.out.print("Pleae enter item number :: " );
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }

    public static void searchForItem(){
        System.out.println("Item to search for :: ");
        String searchItem = scanner.nextLine();

        if(groceryList.findItem(searchItem)!=null){
            System.out.println("Found in our grocery List");
        }else{
            System.out.println("Item not found.");
        }
    }
}
