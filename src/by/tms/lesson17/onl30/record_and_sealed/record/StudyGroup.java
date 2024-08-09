package by.tms.lesson17.onl30.record_and_sealed.record;

import java.util.List;

public record StudyGroup(
        int id,
        String nameGroup,
        List<Student> students) {}
