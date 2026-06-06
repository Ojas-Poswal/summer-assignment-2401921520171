interface LibraryUser{
     void registerAccount();
     void requestBook();
}
class KidUser implements LibraryUser{
   int age;
   String bookType;
   KidUser(int age, String bookType){
       this.age = age;
       this.bookType = bookType;
   }
   public void registerAccount(){
       if(age<12){
          System.out.println("You have successfully registered under a Kids Account");
       } 
       else {
          System.out.println("Sorry, Age must be less than 12 to register as a kid");
        }
   }
    public void requestBook(){
         if(bookType.equals("Kids")){
             System.out.println("Book Issued successfully, please return the book within 10 days");
         } 
         else {
             System.out.println("Oops, you are allowed to take only kids books");
          }
    }
}
class AdultUser implements LibraryUser{
   int age;
   String bookType;
   AdultUser(int age, String bookType){
       this.age = age;
       this.bookType = bookType;
   }
   public void registerAccount(){
       if(age>12){
          System.out.println("You have successfully registered under an Adult Account");
       } 
       else {
          System.out.println("Sorry, Age must be greater than 12 to register as an adult");
        }
   }
    public void requestBook(){
         if(bookType.equals("Fiction")){
             System.out.println("Book Issued successfully, please return the book within 7 days");
         } 
         else {
             System.out.println("Oops, you are allowed to take only adult fiction books");
          }
    }
}
public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        KidUser kid = new KidUser(10, "Kids");
        KidUser kid2 = new KidUser(18, "Fiction");
        kid.registerAccount();
        kid.requestBook();

        kid2.registerAccount();
        kid2.requestBook();
        
        AdultUser adult = new AdultUser(5, "Kids");
        AdultUser adult2 = new AdultUser(25, "Fiction");
        adult.registerAccount();
        adult.requestBook();

        adult2.registerAccount();
        adult2.requestBook();

    }
}

