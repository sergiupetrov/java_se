import java.util.ArrayList;

public class MainPerson {
    public static void main(String[] args) {
        Person student = new Student("Petrov", "Ghibu", "Java", 1, 200);
        Person staff = new Staff("Petrov", "Studentilor", "Tekwill", 200.00);
        ArrayList<Person> arr = new ArrayList<Person>();
        arr.add(student);
        arr.add(staff);
        for (Person p : arr) {
            System.out.println(p);
        }
    }
}
