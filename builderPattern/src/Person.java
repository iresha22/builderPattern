public class Person {
    private String firstName;
    private String lastName;
    private Integer age;
    private String address;
    private PersonBuilder builder;

    public Person(PersonBuilder builder) {
        this.builder = builder;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public PersonBuilder getBuilder() {
        return builder;
    }

    public void setBuilder(PersonBuilder builder) {
        this.builder = builder;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", builder=" + builder +
                '}';
    }
}
