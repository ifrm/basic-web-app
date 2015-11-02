package tutorial;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

/**
 * Created by Ionatan on 11/2/2015.
 */
public class CalculatorTest {
    @Mock
    Calculator cal;
    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void testABs(){

        when(cal.abs(-20)).thenReturn(-20);
        assertEquals(20,cal.abs(-20));

    }
}
