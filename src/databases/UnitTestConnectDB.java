package databases;

import org.junit.Test;
import static org.junit.Assert.*;

public class UnitTestConnectDB {
    @Test
    public void testConnectToSqlDB() {
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

        // Test connecting to the database
        boolean success = connectToSqlDB.connect();
        assertEquals(true, success);

        // Test disconnecting from the database
        success = connectToSqlDB.connect();
        assertTrue(success);
    }
}