import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        List<Person> clients = generateClients();
        Queue <Person> attraction = new LinkedList<>(clients);

        while (!attraction.isEmpty()) {
            Person person = attraction.poll();
            int quantityTickets = person.getQuantityTickets();
            quantityTickets = quantityTickets - 1;
            person.setQuantityTickets(quantityTickets);
            System.out.printf("\n %s %s прокатился(ась) на аттракционе, осталось %d билетов",
                    person.getName(), person.getSurname(), quantityTickets
            );
            if (quantityTickets > 0) {
                attraction.offer(person);

            }
        }
    }
    protected static List<Person> generateClients() {
        return List.of(
                new Person("Sonya", "Smirnova",5),
                new Person("Alisa","Petrova", 3),
                new Person("Andrey","Kozlov", 1),
                new Person("Tamara","Ershova", 4),
                new Person("Dmitry", "Simonov", 2));
    }
}