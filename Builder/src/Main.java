public class Main {
    public static void main(String[] args) {
        Person person1 = new Person.Builder("John")
                .age(30)
                .address("123 Main St")
                .phoneNumber("555-1234")
                .build();

        Person person2 = new Person.Builder("Alice")
                .age(25)
                .phoneNumber("555-5678")
                .build();

        // Accessing the person's attributes
        System.out.println("Person 1: " + person1.getName() + ", " + person1.getAge() + ", " + person1.getAddress() + ", " + person1.getPhoneNumber());
        System.out.println("Person 2: " + person2.getName() + ", " + person2.getAge() + ", " + person2.getAddress() + ", " + person2.getPhoneNumber());
    }
}
