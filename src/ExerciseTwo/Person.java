package ExerciseTwo;

public class Person {
    private String rg;
    private String name;
    private String lastName;
    private int age;
    private String cell;
    private String emergency;
    private String bloodType;
    private int inscriptionId;
//    auto increment

    public Person(String rg, String name, String lastName, int age, String cell, String emergency, String bloodType){
        this.rg = rg;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.cell = cell;
        this.emergency = emergency;
        this.bloodType = bloodType;
        this.inscriptionId = 0;
    }

    public void enroll (Category category) {
        category.addParticipant(new Person(rg, name, lastName, age, cell, emergency, bloodType));
    }
}
