package ex;

import java.util.Scanner;

public class University {

    private final int maxStudents = 100;
    int currentNumbersStudents;

    private Student[] students = new Student[maxStudents];
    private Scanner sc = new Scanner(System.in);

    public Student InputAndCreateStudentData() {
        System.out.println("Wprowadź imię studenta");
        String firstName = sc.nextLine();

        System.out.println("Wprowadź nazwisko studenta");
        String lastName = sc.nextLine();

        System.out.println("Wprowadź indeks studenta");
        int numbers = getInt();

        return new Student(firstName, lastName, numbers);
    }

    public void close() {
        sc.close();
    }

    public int getInt() {
        int number = sc.nextInt();
        sc.nextLine();
        return number;
    }


    public void addStudent(Student student) {
        if (currentNumbersStudents < maxStudents) {
            students[currentNumbersStudents] = student;
            currentNumbersStudents++;
        }
    }

    public void printStudents() {
        if (currentNumbersStudents == 0) {
            System.out.println("Brak studentów na studiach");
        }
        for (int i = 0; i < currentNumbersStudents; i++) {
            students[i].printInfo();
        }
    }

}
