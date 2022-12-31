package databases;

import org.junit.Test;
import static org.junit.Assert.*;

public class UnitTestConnectDB {
    @Test
    public void testConnectToSqlDB() {
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();


        boolean success = connectToSqlDB.connect();
        assertEquals(true, success);


        success = connectToSqlDB.connect();
        assertTrue(success);
    }
}