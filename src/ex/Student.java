package ex;

public class Student {

    private String firstName;
    private String lastName;
    private int indexNumber;

    private static int studentsNumber = 0;

    public Student(String firstName, String lastName, int indexNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.indexNumber = indexNumber;

        studentsNumber++;
    }

    public static int getStudentsNumber() {
        return studentsNumber;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(int indexNumber) {
        this.indexNumber = indexNumber;
    }

    public void printInfo() {
        String info = firstName + "; " + lastName + "; " + indexNumber;
        System.out.println(info);
    }

//    Student[] students = new Student[10];
//    public void printStudents() {
//        if (studentsNumber == 0) {
//            System.out.println("Brak studentów na studiach");
//        }
//        for (int i = 0; i < studentsNumber; i++) {
//            students[studentsNumber].printInfo();
//        }
//    }

}
