package alec;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void add_shouldReturn6() {
        int i = new alec.Test().add(5);
        Assert.assertEquals("should be equals", 10, i);
    }


}