import by.tms.lesson17.onl30.record_and_sealed.record.Student;
import by.tms.lesson17.onl30.record_and_sealed.record.StudyGroup;

import java.util.ArrayList;
import java.util.Arrays;

public class ExecutorRecord {
    public static void main(String[] args) {
        Student student12 = new Student(12, "Surname_11", "Name_12", 23);
        Student student14 = new Student(14, "Surname_14", "Name_15", 21);
        Student student18 = new Student(18, "Surname_18", "Name_19", 20);
        Student student28 = new Student(28, "Surname_28", "Name_19", 24);

        StudyGroup studyGroup05 = new StudyGroup(644, "Group-644", new ArrayList<>());
        studyGroup05.students().add(student12);
        studyGroup05.students().add(student14);
        studyGroup05.students().add(student18);
        studyGroup05.students().add(student28);

        System.out.println(student14.name());
        System.out.println(student12.age());
        if (student12.getClass().isRecord()) {
            System.out.println("student12 - это Record");
        }
        System.out.println(Arrays.toString(student14.getClass().getRecordComponents()));
        System.out.println(Arrays.toString(studyGroup05.getClass().getRecordComponents()));
    }
}