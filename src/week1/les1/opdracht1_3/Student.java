package week1.les1.opdracht1_3;

public class Student {
    public String naam;
    public int studentNummer;

    public Student(String naam) {
        this.naam = naam;
    }

    public Student(String naam, int studentNummer) {
        this.naam = naam;
        this.studentNummer = studentNummer;
    }

    public String getNaam() {
        return naam;
    }
    public int getStudentNummer(){
        return studentNummer;
    }
    public void setStudentNummer(int stnr){
        studentNummer = stnr;
    }

    @Override
    public String toString() {
        return "Deze student heet " + naam;
    }
}
