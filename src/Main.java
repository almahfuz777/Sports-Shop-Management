
import java.util.*;

public class Main {
    private static Collection<Customer> c = new ArrayList<Customer>();
    
    public static void main(String[] args) {
        landing();
    }
    
    // landing page
    static void landing(){
        displayHeading("Sports Arena");
        verification();
    }
    // displays a heading
    static void displayHeading(String s){
        System.out.println("=======================");
        System.out.printf("%18s\n",s);
        System.out.println("=======================\n");
    }
    static void verification(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("""
                           1) Login as Seller
                           2) Login as Customer
                           3) Sign Up as Customer
                           4) Exit
                           """);
        System.out.print("Enter your choice: ");
        int sel = sc.nextInt();
        switch(sel){
            case 1: SellerLogin();
            case 2: //CustomerLogin();
            case 3: signUp();
            case 4: System.exit(0);
        }
    }
    static void SellerLogin(){
        displayHeading("Verification | Seller");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your credentials- ");
        System.out.print("Username: ");
        String username = sc.next();
        System.out.print("Password: ");
        String pass = sc.next();
        if(username.equals("admin") && pass.equals("admin")){
            // successful login
            // sellerMenu();
        }
        else {
            System.out.println("Wrong Input.\n1) Try Again\n2) Exit\n");
            System.out.print("Enter your choice: ");
            int sel = sc.nextInt();
            if(sel == 1) {
                SellerLogin();
            } else {
                System.exit(0);
            }
        }
    }

    private static void signUp() {
        displayHeading("Sign Up");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your email: ");
        String email = sc.nextLine();
        System.out.print("Enter a new Password: ");
        String pass = sc.nextLine();
        c.add(new Customer(name, email,pass));
        
        System.out.println("\n\nAccount Created Successfully\n");
        System.out.println("1) Login\n2) Exit");
        System.out.print("Enter your choice: ");
            int sel = sc.nextInt();
            if(sel == 1) {
                SellerLogin();
            } else {
                System.exit(0);
            }
    }

}
