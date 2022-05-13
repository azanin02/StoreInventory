import java.util.Scanner;
public class StoreInventory 
{
    static Scanner sc = new Scanner (System.in);
    
    String itemCode, itemName, purchaseDate, supplierName;
    int quantityStock, quantityReorder, serialNumber, warranty;
    double value;
    
    public StoreInventory (String itemCode, String itemName, String purchaseDate, String supplierName, int quantityStock, int quantityReorder, 
            int serialNumber, int warranty, double value)
    {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.purchaseDate = purchaseDate;
        this.supplierName = supplierName;
        this.quantityStock = quantityStock;
        this.quantityReorder = quantityReorder;
        this.serialNumber = serialNumber;
        this.warranty = warranty;
        this.value = value;
    }
    
    public static void inputInformation ()
    {
        System.out.print ("Enter item code            : ");
        String itemCode = sc.next() + sc.nextLine();
    
        System.out.print ("Enter item name            : ");
        String itemName = sc.next() + sc.nextLine();
        
        System.out.print ("Enter purchase date        : ");
        String purchaseDate = sc.next() + sc.nextLine();
        
        System.out.print ("Enter supplier name        : ");
        String supplierName = sc.next() + sc.nextLine();
        
        System.out.print ("Enter quantity in stock    : ");
        int quantityStock = sc.nextInt();
        
        System.out.print ("Enter quantity in reorder  : ");
        int quantityReorder = sc.nextInt();
        
        System.out.print ("Enter serial number        : ");
        int serialNumber = sc.nextInt();
        
        System.out.print ("Enter warranty             : ");
        int warranty = sc.nextInt();
    
        System.out.print ("Enter value                : ");
        double value = sc.nextDouble();
        
        System.out.println();
        System.out.println("The data have been stored");
    }
    
    public static int search (String searchItem, String itemCode[])
    {
        int foundIndex = -1;
                
        for (int i = 0; i < itemCode.length; i++)
        {
           if(itemCode[i]==searchItem)
           {
               foundIndex= i;
               break;
           }//if
        }//for
        return foundIndex;
    }
    
    public static void displaySearchRecord(int foundIndex, String [] itemCode, String [] itemName, String [] purchaseDate, String [] supplierName, int [] quantityStock, int [] quantityReorder, int [] serialNumber, int [] warranty, double [] value)
    {
        int i = 0;
        
        if (foundIndex == -1)
        {
            System.out.println();
            System.out.println("Data does not exist");
        }//if
        else
        {
            if (itemCode[i] != null)
            {
                System.out.println();
                System.out.printf("%10s %10s %10s %10s %15s %15s %15s %10s %10s %10s \n", "Item Code","Item Name","Purchase Date","Supplier Name","Quantity Stock","Quantity Reorder","Serial Number","Warranty","Value");
                System.out.printf("%10s %10s %10s %10s %15s %15s %15s %10s %10s %10s \n", "=========","=========","=============","=============","==============","================","=============","========","=====");
                System.out.printf("%10s %10s %10s %10s %15s %15s %15s %10s %10s %10.2f \n",itemCode[foundIndex], itemName[foundIndex], purchaseDate[foundIndex], supplierName[foundIndex], quantityStock[foundIndex], quantityReorder[foundIndex], serialNumber[foundIndex], warranty[foundIndex], value[foundIndex]);
            }//if
                
        }//else
    } // displaySearchRecord
    
    public static void editData(int foundIndex, String [] itemCode, String [] itemName, String [] purchaseDate, String [] supplierName, int [] quantityStock, int [] quantityReorder, int [] serialNumber, int [] warranty, double [] value)
    {
        Scanner sc = new Scanner(System.in);
        
        if (foundIndex == -1)
        {
            System.out.println();
            System.out.println("Data does not exist");
        }//if
        
        else
        {
            System.out.print("Please input Item Code         = ");
            itemCode[foundIndex] = sc.next() + sc.nextLine();

            System.out.print("Please input Item Name         = ");
            itemName[foundIndex] = sc.next() + sc.nextLine();

            System.out.print("Please input Purchase Date     = ");
            purchaseDate[foundIndex] = sc.next() + sc.nextLine();

            System.out.print("Please input Supplier Name     = ");
            supplierName[foundIndex] = sc.next() + sc.nextLine();

            System.out.print("Please input Quantity Stock    = ");
            quantityStock[foundIndex] = sc.nextInt();

            System.out.print("Please input Quantity Reorder  = ");
            quantityReorder[foundIndex] = sc.nextInt();
            
            System.out.print("Please input Serial Number     = ");
            serialNumber[foundIndex] = sc.nextInt();
            
            System.out.print("Please input Warranty          = ");
            warranty[foundIndex] = sc.nextInt();
            
            System.out.print("Please input Value             = ");
            value[foundIndex] = sc.nextDouble();
            
            System.out.println();
            System.out.println("The data have been updated");

        }//else
        
    } // editData
    
    public static void deleteData(int foundIndex, String [] itemCode, String [] itemName, String [] purchaseDate, String [] supplierName, int [] quantityStock, int [] quantityReorder, int [] serialNumber, int [] warranty, double [] value)
    {
        int index = 0;
        
        if (foundIndex == -1)
        {
            System.out.println();
            System.out.println("The data does not exist");
        }//if
        
        else
        {
            index--;
            itemCode[foundIndex] = null;
            itemName[foundIndex] = null;
            purchaseDate[foundIndex] = null;
            supplierName[foundIndex] = null;
            quantityStock[foundIndex] = 0;
            quantityReorder[foundIndex] = 0;
            serialNumber[foundIndex] = 0;
            warranty[foundIndex] =0;
            value[foundIndex] =0.0;
            System.out.println();
            System.out.println("The data has been deleted");
       
        }//else
    }//deleteData
    
    public static void displayData(int itemTotal, String [] itemCode, String [] itemName, String [] purchaseDate, String [] supplierName, int [] quantityStock, int [] quantityReorder, int [] serialNumber, int [] warranty, double [] value)
    {
        if (itemTotal == 0)
        {
            System.out.println();
            System.out.println("No data stored.");
        }//if
        
        else
        {
            System.out.printf("%10s %10s %10s %10s %15s %15s %15s %10s %10s %10s \n", "Item Code","Item Name","Purchase Date","Supplier Name","Quantity Stock","Quantity Reorder","Serial Number","Warranty","Value");
            System.out.printf("%10s %10s %10s %10s %15s %15s %15s %10s %10s %10s \n", "=========","=========","=============","=============","==============","================","=============","========","=====");
            
            for(int count=0; count<itemCode.length;count++)
            {

                if (itemCode[count] !=  null)
                {
                    System.out.printf("%10s %10s %10s %10s %15s %15s %15s %10s %10s %10.2f \n",itemCode[count], itemName[count], purchaseDate[count], supplierName[count], quantityStock[count], quantityReorder[count], serialNumber[count], warranty[count], value[count]);
                    
                }//if
            }//for
        }//else
    } // displayData
}


