import java.util.List;

public interface StudentRepository {
    void add(Student student);
    Student get(int id);
    List<Student> getAll();
    void delete(Student student);
}
