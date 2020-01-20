import java.util.Scanner;

class DogYears {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in); 
        int dogYears;
        int humanYears;

        dogYears = scrn.nextInt();
        humanYears = 7 * dogYears;

        System.out.print("A ");
        System.out.print(dogYears);
        System.out.print(" year old dog is about a ");
        System.out.println(humanYears);
        System.out.print("year old human.");

    }
}