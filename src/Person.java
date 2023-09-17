import java.time.Year;
import java.util.Calendar;
import java.util.Objects;
import java.util.Date;


public class Person {
    // a. ID (a String)
    // b. FirstName
    // c. LastName
    // d. Title (a string like Mr. Mrs., Ms., Dr., etc.)
    // e. YearOfBirth (an int)

    public String ID;
    public String fName;
    public String lName;
    public String title;

    public int Year;
    private int YOB;



    static private int IDseed = 1;

    public static int getIDseed() {
        return IDseed;
    }

    public static void setIDseed(int IDseed) {
        Person.IDseed = IDseed;
    }

    public Person(String ID,String fName, String lName,String title, Integer YOB) {
        this.ID = ID;
        this.fName = fName;
        this.lName = lName;
        this.title = title;
        this.YOB = YOB;
    }

    public Person(String fName, String lName, String title, int YOB) {

        this.fName = fName;
        this.lName = lName;
        this.title = title;
        this.YOB = YOB;
        this.Year = Year;

    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    private String genID() {
        String newID = "" + IDseed;
        while (newID.length() < 8) {

            newID = "0" + newID;
        }
        IDseed++;
        return newID;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYOB() {
        return YOB;
    }

    public void setYOB(int YOB) {
        this.YOB = YOB;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }


    @Override
    public String toString() {
        return "Person{" +
                "ID='" + ID + '\'' +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", title='" + title + '\'' +
                ", YOB=" + YOB +
                '}';
    }

    public String getFullName() {
        return fName + " " + lName;
    }

    public String getFormalName() {
        return title + " " + fName + " " + lName;
    }

    public String getAge() {
        return Integer.toString(Calendar.getInstance().get(Calendar.YEAR) - this.YOB);
    }

    public String getAge(int year) {
        return Integer.toString(year - this.YOB);

    }

    public String toCSVRecord() {
        return ID + ", " + fName + "," + lName + ", " + title + ", " + YOB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(fName, person.fName) && Objects.equals(lName, person.lName) && Objects.equals(ID, person.ID) && Objects.equals(title, person.title) && Objects.equals(YOB, person.YOB);
    }

    public String toXMLRecord() {
        String retString = "";

        retString = "<IDNum>" + this.ID + "</IDNum>";
        retString += "<FirstName>" + this.fName + "</firstName>";
        retString += "<LastName>" + this.lName + "</lastName>";
        retString += "<title>" + this.title + "</title>";
        retString += "<YOB>" + this.YOB + "</YOB>";

        return retString;
    }

    public String toJSONRecord() {
        String retString = "";
        char DQ = '\u0022';  // Assign the double quote char to a variable
        retString = "{" + DQ + "IDNum" + DQ + ":" + DQ + this.ID + DQ + ",";
        retString += DQ + "FirstName" + DQ + ":" + DQ + this.fName + DQ + ",";
        retString += " " + DQ + "LastName" + DQ + ":" + DQ + this.lName + DQ + ",";
        retString += " " + DQ + "title" + DQ + ":" + DQ + this.title + DQ + ";";
        retString += " " + DQ + "YOB" + DQ + ":" + this.YOB + "}";

        return retString;
    }
}
