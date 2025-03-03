import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ro.mpp2025.model.ComputerRepairRequest;

import static org.junit.jupiter.api.Assertions.*;

public class ComputerRepairRequestTest {

    @Test
    @DisplayName("TEST 1")
    public void testDefaultConstructor() {
        ComputerRepairRequest request = new ComputerRepairRequest();
        assertEquals(0, request.getID());
        assertEquals("", request.getOwnerName());
        assertEquals("", request.getOwnerAddress());
        assertEquals("", request.getPhoneNumber());
        assertEquals("", request.getModel());
        assertEquals("", request.getDate());
        assertEquals("", request.getProblemDescription());
    }

    @Test
    @DisplayName("TEST 2")
    public void testParameterizedConstructor() {
        ComputerRepairRequest request = new ComputerRepairRequest(1, "John Doe", "123 Main St", "555-1234", "Dell", "2023-10-01", "Broken screen");
        assertEquals(1, request.getID());
        assertEquals("John Doe", request.getOwnerName());
        assertEquals("123 Main St", request.getOwnerAddress());
        assertEquals("555-1234", request.getPhoneNumber());
        assertEquals("Dell", request.getModel());
        assertEquals("2023-10-01", request.getDate());
        assertEquals("Broken screen", request.getProblemDescription());
    }

    @Test
    @DisplayName("TEST 3")
    public void testSettersAndGetters() {
        ComputerRepairRequest request = new ComputerRepairRequest();
        request.setID(2);
        request.setOwnerName("Jane Doe");
        request.setOwnerAddress("456 Elm St");
        request.setPhoneNumber("555-5678");
        request.setModel("HP");
        request.setDate("2023-11-01");
        request.setProblemDescription("Battery issue");

        assertEquals(2, request.getID());
        assertEquals("Jane Doe", request.getOwnerName());
        assertEquals("456 Elm St", request.getOwnerAddress());
        assertEquals("555-5678", request.getPhoneNumber());
        assertEquals("HP", request.getModel());
        assertEquals("2023-11-01", request.getDate());
        assertEquals("Battery issue", request.getProblemDescription());
    }

    @Test
    @DisplayName("TEST 4")
    public void testToString() {
        ComputerRepairRequest request = new ComputerRepairRequest(3, "Alice", "789 Oak St", "555-7890", "Lenovo", "2023-12-01", "Software issue");
        String expected = "ID=3, ownerName='Alice', model='Lenovo', date='2023-12-01', problemDescription='Software issue'";
        assertEquals(expected, request.toString());
    }
}