import static org.junit.Assert.*;
import org.junit.Test;
public class MiMaTest {
//assertArrayEquals is not working
    @Test
    public void TC1(){
        MiMa n1 = new MiMa();
        int []array1 = {0,2,8,8,5,6};
        int []expected = {0,8};
        assertArrayEquals(expected, n1.maxmin(array1));
    }
    @Test
    public void TC2(){
        MiMa n1 = new MiMa();
        int []array1 = {1,22,3,-4,-5,6};
        int []expected = {-5,22};
        assertArrayEquals(expected, n1.maxmin(array1));
    }
    @Test
    public void TC3(){
        MiMa n1 = new MiMa();
        int []array1 = {8,5852,553,4666,56,6};
        int []expected = {6,5852};
        assertArrayEquals(expected, n1.maxmin(array1));
    }

    @Test
    public void TC4(){
        MiMa n1 = new MiMa();
        int []array1 = {-3331,-4455,-443,-433,-38,-328};
        int []expected = {-4455,-38};
        assertArrayEquals(expected, n1.maxmin(array1));
    }
    @Test
    public void TC5(){
        MiMa n1 = new MiMa();
        int []array1 = {5};
        int []expected = {5,5};
        assertArrayEquals(expected, n1.maxmin(array1));
    }
}