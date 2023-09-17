import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {

    SalaryWorker p1, p2, p3;

    @BeforeEach
    void setUp() {
        p1 = new SalaryWorker("00000A", "Bob", "Tester1", "Mr.", 1955, 65000);
        p2= new SalaryWorker("00000B", "Sally", "Tester2", "Ms.", 1975, 45000);
        p3= new SalaryWorker("00000B", "Sally", "Tester2", "Ms.", 1975, 55000);
    }

    @Test
    void getFirstName() {
        assertEquals("Bob", p1.getfName());
    }

    @Test
    void getLastName() {
        assertEquals("Tester1", p1.getlName());
    }

    @Test
    void getTitle() {
        assertEquals("Mr.", p1.getTitle());
    }

    @Test
    void getYOB() {
        assertEquals(1955, p1.getYOB());
    }

    @Test
    void getYearlySalary() {
        assertEquals(65000, p1.getYearlySalary());}

    @Test
    void setID() {
        p1.setID("00000B");
        assertEquals("00000B", p1.getID());
    }

    @Test
    void setFirstName() {
        p1.setfName("Sally");
        assertEquals("Sally", p1.getfName());
    }

    @Test
    void setLastName() {
        p1.setlName("Tester2");
        assertEquals("Tester2", p1.getlName());
    }

    @Test
    void setTitle(){
        p1.setTitle("Dr.");
        assertEquals("Dr.", p1.getTitle());
    }

    @Test
    void setYOB() {
        p1.setYOB(1975);
        assertEquals(1975, p1.getYOB());
    }
    @Test
    void setAnnualSalary()
    {
        p1.setYearlySalary(95000);
        assertEquals(95000, p1.getYearlySalary());
    }
    @Test
    void equals() {
        p1.setID("00000B");
        p1.setfName("Sally");
        p1.setlName("Tester2");
        p1.setTitle("Ms.");
        p1.setYOB(1975);
        p1.setYearlySalary(45000);
        assertEquals(true, p1.equals(p2));
    }
}