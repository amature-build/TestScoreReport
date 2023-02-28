public class StudentGrade {
    private String firstName, lastName;
    private int score, rollID;
    public StudentGrade(){}
    public StudentGrade(int rollID){
        this.rollID = rollID;
    }
    public StudentGrade(String firstName, String lastName, int score){
        this.firstName = firstName;
        this.lastName = lastName;
        this.score = score;
    }

    public int getRollID() {
        return rollID;
    }

    public void setRollID(int rollID) {
        this.rollID = rollID;
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

    public String getFullName(){
        return this.lastName + ", " + this.firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if (score < 0 || score > 100){
            System.out.println("Incorrect input of score.");
        }
        this.score = score;
    }

    public String getGrade(){
        if (this.score >= 90){
            return "A";
        } else if (this.score >= 80) {
            return "B";
        } else if (this.score >= 70) {
            return "C";
        } else if (this.score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
