package prof;

public class Profession {
    String Fullname;
    String typeProf;
    int exp;
    public Profession(String fullname, String typeProf, int exp) {
        this.Fullname = fullname;
        this.typeProf = typeProf;
        this.exp = exp;
    }

    public String getTypeProf() {
        return typeProf;
    }

    public String getFullname() {
        return Fullname;
    }

    public int getExp() {
        return exp;
    }
}
