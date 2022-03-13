package ExerciseTwo;

import java.math.BigDecimal;
import java.util.ArrayList;

public class SmallCircuit extends Category{
    private ArrayList<Person> peopleList;
    private BigDecimal totalTickets;


    public void addParticipant(Person person) {
        peopleList.add(person);
    }

    public void deleteParticipant(Person person) {
        peopleList.remove(person);
    }

    public void showParticipantsList() {
        peopleList.forEach(person -> System.out.println(person));
    }
}
