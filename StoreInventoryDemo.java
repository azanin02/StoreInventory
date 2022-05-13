import java.util.Scanner;
public class StoreInventoryDemo 
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner (System.in);
        String [] itemCode = new String [2];
        String [] itemName = new String [2];
        String [] purchaseDate = new String [2];
        String [] supplierName = new String [2];
        int [] quantityStock = new int [2];
        int [] quantityReorder = new int [2];
        int [] serialNumber = new int [2];
        int [] warranty = new int [2];
        double [] value = new double [2];

        String searchItem;
        int i = -1, choice, foundIndex, itemTotal=0;
        boolean menu = true;
        
        while(menu)
        {
            System.out.println();
            System.out.println("MENU");
            System.out.println("1 - Add data");
            System.out.println("2 - Delete data");
            System.out.println("3 - Edit data");
            System.out.println("4 - Search Data");
            System.out.println("5 - Display data");
            System.out.println("6 - Exit");
            System.out.println();
            System.out.print("Please enter the menu : ");
            choice = sc.nextInt();
        
            System.out.println();
            
            if (choice == 1)
            {
                i++;
                StoreInventory.inputInformation();
                
            }//(choice == 1)
            
            else if (choice == 2)
            {
                System.out.print("Please input the item code to search = ");
                searchItem = sc.nextLine() + sc.next();
                foundIndex = StoreInventory.search(searchItem, itemCode);
                StoreInventory.displaySearchRecord (foundIndex, itemCode, itemName, purchaseDate, supplierName, quantityStock, quantityReorder, serialNumber, warranty, value);
            }//(choice == 2)
            
            else if (choice == 3)
            {
                System.out.print("Please input the item code to edit = ");
                searchItem = sc.nextLine() + sc.next();
                
                foundIndex = StoreInventory.search(searchItem, itemCode);
                StoreInventory.editData (foundIndex, itemCode, itemName, purchaseDate, supplierName, quantityStock, quantityReorder, serialNumber, warranty, value);
            }//(choice == 3)
            
            else if (choice == 4)
            {
                System.out.print("Please input the item code to delete = ");
                searchItem = sc.nextLine() + sc.next();
                
                foundIndex = StoreInventory.search(searchItem, itemCode);
                StoreInventory.deleteData (foundIndex, itemCode, itemName, purchaseDate, supplierName, quantityStock, quantityReorder, serialNumber, warranty, value);
            }//(choice == 4)
            
            else if (choice == 5)
            {
                StoreInventory.displayData(itemTotal, itemCode, itemName, purchaseDate, supplierName, quantityStock, quantityReorder, serialNumber, warranty, value);
            }
            
            else
                menu=false;
            
            System.out.println("Thanks for using this system");
            System.out.println();
        }
    }
}
