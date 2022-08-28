package ex;

public class UniversityLogic {

    private final int exit = 0;
    private final int addStudent = 1;
    private final int printStudents = 2;

    private University university = new University();

    public void startApp(){
        int option;

        do {
            printOptions();
            option = university.getInt();

            switch (option) {
                case addStudent:
                    Student student = university.InputAndCreateStudentData();
                    university.addStudent(student);
                    break;
                case printStudents:
                    university.printStudents();
                    break;
                case exit:
                    System.out.println("Do zobaczenia");
                    university.close();
                    break;
                default:
                    System.out.println("Brak takiej opcji");

            }
        } while(option != exit);

    }


    private void printOptions() {
        System.out.println("Wybierz opcję: ");
        System.out.println(exit + " - wyjście z programu");
        System.out.println(addStudent + " - dodanie nowego studenta");
        System.out.println(printStudents + " - wyświetl studentów");
    }

}
