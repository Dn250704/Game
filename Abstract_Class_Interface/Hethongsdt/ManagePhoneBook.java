package Java.Abstract_Class_Interface.Hethongsdt;
import java.util.Scanner;
public class ManagePhoneBook {
    public static PhoneBook pb = new PhoneBook();
    public static Scanner input = new Scanner(System.in);
    public static String name, phone;
    static void menu() {
        System.out.println("         -------------MENU-------------          ");
        System.out.println("          PHONEBOOK MANAGEMENT SYSTEM            ");
        System.out.println("'-----------------------------------------------'");
        System.out.println("|               1. Insert phone                 |");
        System.out.println("|               2. Remove phone                 |");
        System.out.println("|               3. Update phone                 |");
        System.out.println("|               4. Search phone                 |");
        System.out.println("|               5. Sort                         |");
        System.out.println("|               6. Exit                         |");
        System.out.println("'-----------------------------------------------'");
    }

    static void insertPhone() {
        input.nextLine();
        System.out.print("Input name: "); 
        name = input.nextLine();  
        System.out.print("Input phone: ");
        phone = input.nextLine();
        pb.insertPhone(name, phone);
    }

    static void removePhone() {
        input.nextLine();
        System.out.print("Input name of person you want to remove: "); 
        name = input.nextLine(); 
        pb.removePhone(name);
    }

    static void updatePhone() {
        boolean searched = false;
        input.nextLine();
        System.out.print("Input name of person you want to update: ");
        name = input.nextLine();
        for (String s : pb.PhoneList) {
            if (name.equals(s.substring(0, s.indexOf(",")))) {
                searched = true;
                System.out.print("Input phone number you want to update: ");
                phone = input.nextLine();
                pb.updatePhone(name, phone);
            }
        }
        if (!searched) {
            System.out.println("Not found person with name is: " + name);
        }
    }

    static void searchPhone() {
        input.nextLine();
        System.out.print("Please input name of person you want to search the phone: "); 
        name = input.nextLine();  
        pb.searchPhone(name);
    }

    static void sortPhone() {
        pb.sort();
    }
    public static void main(String[] args) {
        menu();
        while (true) {
            System.out.println("Please choose an option: ");
            switch (input.nextInt()) {
                case 1:
                    insertPhone();
                    break;
                case 2:
                    removePhone();
                    break;
                case 3:
                    updatePhone();
                    break;
                case 4:
                    searchPhone();
                    break;
                case 5:
                    sortPhone();
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        }
    }
}
