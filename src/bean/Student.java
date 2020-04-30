package bean;

public class Student {
    int SId;
    String SName;
    String SDate;
    boolean Sex;

    public Student(int id, String name, String SDate, boolean Sex) {
        this.SId = id;
        this.SName = name;
        this.SDate = SDate;
        this.Sex = Sex;
    }

    public int getSId() {
        return SId;
    }

    public void setSId(int SId) {
        this.SId = SId;
    }

    public String getSName() {
        return SName;
    }

    public void setSName(String name) {
        SName = name;
    }

    public String getSDate() {
        return SDate;
    }

    public void setSDate(String SDate) {
        this.SDate = SDate;
    }

    public boolean isSex() {
        return Sex;
    }

    public void setSex(boolean Sex) {
        this.Sex = Sex;
    }
}

