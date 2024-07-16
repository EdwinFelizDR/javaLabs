package PA303103;

public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        //Create an instance of the KidUser class.
        KidUser kid1= new KidUser();

        //Create an instance of the AdultUser class.
        AdultUser adult1 = new AdultUser();

        //Set the age as specified in the below table and invoke the registerAccount()
        System.out.println("----------------------------------------------");
        kid1.setAge(10);
        kid1.registerAccount();
        kid1.setAge(18);
        kid1.registerAccount();

        //Set the bookType as specified in the below table and invoke the requestBook()
        System.out.println("----------------------------------------------");
        kid1.setBookType("Kids");
        kid1.requestBook();
        kid1.setBookType("Fiction");
        kid1.requestBook();

        //Set the age as specified in the below table and invoke the registerAccount()
        System.out.println("----------------------------------------------");
        adult1.setAge(5);
        adult1.registerAccount();
        adult1.setAge(23);
        adult1.registerAccount();

        //Set the bookType as specified in the below table and invoke the requestBook()
        System.out.println("----------------------------------------------");
        adult1.setBookType("Kids");
        adult1.requestBook();
        adult1.setBookType("Fiction");
        adult1.requestBook();
    }
}
