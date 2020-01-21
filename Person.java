// Object: internal data + operations
// Object: fields + public methods
// Object: internal variables + public methods


// Class definition: Person

public class Person {
    private String firstName;
    private String lastName;

    private int numberOfNameChanges = 0;

    public int getNumberOfNameChanges(){
        return numberOfNameChanges;
    }

    private static int numberOfTotalNameChanges = 0;

    public static int getNumberOfTotalNameChanges(){
        return numberOfTotalNameChanges;
    }

    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setFirstName(String name) {
        this.firstName = name;
        numberOfNameChanges = numberOfNameChanges + 1;
        numberOfTotalNameChanges++;
    }

    // class constructor

    Person(String firstname, String lastname) {
        // initialize fields
        this.firstName = firstname;
        this.lastName = lastname;
    }
}