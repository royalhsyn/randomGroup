import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> persons = new ArrayList<>();

        persons.add("Emil Alıyev");
        persons.add("Fuad Bayramov");
        persons.add("Şəkər Kərimova");
        persons.add("Səkinə Həmidova");
        persons.add("Səbinə Vəliyeva");
        persons.add("İsmət Ağamirzəyev");
        persons.add("Dünya Xocayeva");
        persons.add("Mirvari Əmiraslanova");
        persons.add("Röyal Hüseynov");
        persons.add("Toğrul İsmayılzadə");
        persons.add("Lamiyə Məmmədova");
        persons.add("Elmar Ağazadə");

        divideIntoGroups(persons, 4);
    }

    public static void divideIntoGroups(List<String> persons, int numberOfGroups) {
        if (persons.size() % numberOfGroups != 0) {
            throw new IllegalArgumentException("Cannot divide " + persons.size() + " persons into " + numberOfGroups + " groups evenly.");
        }
        Collections.shuffle(persons);
        int groupSize = persons.size() / numberOfGroups;
        for (int i = 0; i < numberOfGroups; i++) {
            List<String> group = persons.subList(i * groupSize, (i + 1) * groupSize);
            System.out.println("Group " + (i + 1) + ": " + group);
        }
    }
}