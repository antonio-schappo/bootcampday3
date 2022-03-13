package ExerciseTwo;

//import java.math.BigDecimal;
//import java.util.ArrayList;

abstract class Category {
//    ArrayList<Person> peopleList;
//    BigDecimal totalTickets;
    public abstract void addParticipant(Person person);
    public abstract void deleteParticipant(Person person);
    public abstract void showParticipantsList();
}
