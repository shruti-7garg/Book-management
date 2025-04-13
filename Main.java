import java.util.Scanner;

class Book{
    String title;
    String author;
    double price;

    //Constructor
     Book(String title, String author, double price){
         this.title = title;
         this.author = author;
         this.price= price;
     }

    //Method to diplay details of searched book
    public void displayDetails(){
        System.out.println("Title: "+ title);
        System.out.println("Author: "+ author);
        System.out.println("Price: "+ price);
    }
}



class Main{
    public static void main(String[] args) {

    //Creating an array of Book class - primitive type so it does not contain data type
    Book[] booksArray = new Book[5];
       
    booksArray[0] = new Book("The Alchemist", "Paulo Colheo",150.0);
    booksArray[1] = new Book("The Power of Now","Eckhart Tolle",200.00);
    booksArray[2] = new Book("The subtle art of not giving a f","Mark manson", 180.00);
    booksArray[3] = new Book("Who moved my cheese","Spencer Johmson", 120.00);
    booksArray[4] = new Book("The Magic", "Rhonda Byrne",100.00);

     // Taking "title" as input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the title of book");
        String title = sc.nextLine();

        //Searching for book in array
        boolean found = false;
        for(Book item: booksArray){

            // function to ignore case sensitivity and avoid space between words
            if(item.title.replaceAll(" ","").equalsIgnoreCase(title.replaceAll(" ",""))){  
                found = true;
                System.out.println("book found");
                item.displayDetails();
                break;
            }
        }
        if(found == false){
            System.out.println("Book not found");
        }

        //Closing the scanner object to avoid memory leak - good practice
        sc.close();
    }
}