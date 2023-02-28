import java.util.List;

public interface StudentGradeDao {
    public List<StudentGrade> getAllStudentGrades();
    public StudentGrade getStudentGrade(int rollID);
    public int getHighestGrade();

}
