import org.junit.Test;

import static org.junit.Assert.fail;

public class FailingTest {

    @Test
    public void testInfiniteLoopBug() {
        App.infiniteLoop(Double.POSITIVE_INFINITY);      
        fail("Expected RuntimeException, but the method did not throw an exception");
    }

    
}
