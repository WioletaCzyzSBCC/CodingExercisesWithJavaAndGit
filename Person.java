// Object: internal data + operations
// Object: fields + public methods
// Object: internal variables + public methods


// Class definition: Person

public class Person {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setFirstName(String name) {
        this.firstName = name;
    }

    // class constructor

    Person() {
    }

    Person(String f, String l) {
        // initialize fields
        this.firstName = f;
        this.lastName = l;
    }
}