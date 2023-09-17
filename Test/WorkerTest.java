import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {

    Worker p1, p2, p3;

    @BeforeEach
    void setUp()
    {
        p1= new Worker ("00000A", "Marley", "Tester1", "Mrs.", 1961, 19);
        p2= new Worker ("00000B", "Kandice", "Tester2", "Ms.", 1972, 20);
        p3= new Worker ("00000C", "Bob", "Tester3", "Mr.", 1968, 20);

    }

    @Test
    void getFirstName() {
        assertEquals("Marley", p1.getfName());
    }

    @Test
    void getLastName() {
        assertEquals("Tester1", p1.getlName());
    }

    @Test
    void getTitle() {
        assertEquals("Mrs.", p1.getTitle());
    }

    @Test
    void getYOB() {
        assertEquals(1961, p1.getYOB());
    }

    @Test
    void getHourlyPayRate() {
        assertEquals(19, p1.getHourlyPayRate());}

    @Test
    void setID() {
        p1.setID("00000A");
        assertEquals("00000A", p1.getID());
    }

    @Test
    void setFirstName() {
        p1.setfName("Kandice");
        assertEquals("Kandice", p1.getfName());
    }

    @Test
    void setLastName() {
        p1.setlName("Tester2");
        assertEquals("Tester2", p1.getlName());
    }

    @Test
    void setTitle(){
        p1.setTitle("Ms.");
        assertEquals("Ms.", p1.getTitle());
    }

    @Test
    void setYOB() {
        p1.setYOB(1972);
        assertEquals(1972, p1.getYOB());
    }
    @Test
    void setHourlyPayRate() {
        p1.setHourlyPayRate(19);
        assertEquals(20, p1.getHourlyPayRate());
    }
    @Test
    void equals() {
        p1.setID("00000A");
        p1.setfName("Marley");
        p1.setlName("Tester1");
        p1.setTitle("Mrs.");
        p1.setYOB(1961);
        p1.setHourlyPayRate(19);
        assertEquals(true, p1.equals(p1));
    }

}
