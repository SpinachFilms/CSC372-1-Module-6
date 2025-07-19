import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(10, "Ana", "California"));
        students.add(new Student(5, "Zoe", "Nevada"));
        students.add(new Student(7, "John", "Texas"));
        students.add(new Student(3, "Mike", "Arizona"));
        students.add(new Student(1, "Linda", "Florida"));
        students.add(new Student(8, "George", "Ohio"));
        students.add(new Student(9, "Nina", "Georgia"));
        students.add(new Student(6, "Peter", "Michigan"));
        students.add(new Student(2, "Diana", "Illinois"));
        students.add(new Student(4, "Carlos", "New York"));

        System.out.println("Original list:");
        for (Student s : students)
            System.out.println(s);

        System.out.println("\nSorted by Name:");
        SelectionSort.selectionSort(students, new SortByName());
        for (Student s : students)
            System.out.println(s);

        System.out.println("\nSorted by Roll No:");
        SelectionSort.selectionSort(students, new SortByRollNo());
        for (Student s : students)
            System.out.println(s);
    }
}
