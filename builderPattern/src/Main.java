public class Main {
    public static void main(String[] args) {
        PersonBuilder person1 = new PersonBuilder();
        person1.setFirstName("Iresha");
        person1.setLastName("Warnakulasuriya");
        person1.setAge(22);
        person1.setAddress("via cercariolo 89/A");

        Person firstPerson = person1.build();

        PersonBuilder person2 = new PersonBuilder();
        person2.setFirstName("Enoka");
        person2.setLastName("Warnakulasuriya");
        person2.setAge(49);
        person2.setAddress("via san mandato 90");

        Person secondPerson = person2.build();

        System.out.println(firstPerson);
        System.out.println(secondPerson);
    }
}
