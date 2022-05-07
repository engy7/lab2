import static org.junit.Assert.*;
import org.junit.Test;

public class typeTest {

    //Question 1 Test Cases

    @Test


    public void is_even1() {
        type num = new type();
        assertEquals("This is an Even Number", num.is_even(2));
    }

    @Test

    public void is_even2() {
        type num = new type();
        assertEquals("This is an Odd Number", num.is_even(3));
    }

    @Test

    public void is_even3() {
        type num = new type();
        assertEquals("This is an Even Number", num.is_even(-100));
    }

    @Test
    public void is_even4() {
        type num = new type();
        assertEquals("This is an Even Number", num.is_even(0));
    }


}