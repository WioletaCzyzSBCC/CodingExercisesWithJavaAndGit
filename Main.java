public class Main {
    public static void main(String[] args) {
         Person joe = new Person("Joe", "Gaucho"); 
         System.out.println(joe.getNumberOfNameChanges() );
         System.out.println(joe.getFirstName());
         joe.setFirstName("Craig");
         System.out.println(joe.getFirstName());
         System.out.println(joe.getNumberOfNameChanges() );

         Person jane = new Person("Jane", "Gaucho"); 
         System.out.println(jane.getNumberOfNameChanges() );
         System.out.println(jane.getFirstName());
         joe.setFirstName("Allison");
         System.out.println(jane.getFirstName());
         System.out.println(jane.getNumberOfNameChanges() );

         System.out.println(Person.getNumberOfTotalNameChanges());

    }
}