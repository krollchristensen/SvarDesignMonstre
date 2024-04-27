import java.util.ArrayList;
import java.util.List;

public class SimpleStudentRepository implements StudentRepository {
    private List<Student> students = new ArrayList<>();

    @Override
    public void add(Student student) {
        students.add(student);
    }

    /**
     * Henter en studerende baseret på deres ID.
     *
     * Denne metode anvender Java's Stream API til at søge gennem listen af studerende.
     * Stream API'et tillader en deklarativ måde at håndtere samlinger på, hvilket kan forbedre læsbarhed og vedligeholdelse af koden.
     *
     * @param id ID'et for den studerende, der skal hentes.
     * @return Returnerer en `Student`-instans, hvis en studerende med det angivne ID findes, ellers returneres `null`.
     *         `null` returneres, når `findFirst()` ikke finder noget match, og `orElse(null)` specificeres.
     */
    @Override
    public Student get(int id) {

        return students.stream().filter(s -> s.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<Student> getAll() {
        return new ArrayList<>(students);
    }

    @Override
    public void delete(Student student) {
        students.remove(student);
    }
}