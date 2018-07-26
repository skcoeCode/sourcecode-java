import static org.junit.Assert.*;

import org.junit.Test;

public class SortTest {

    @Test
    public void caseSortNumber1() {
        Sort sort= new Sort();
        int[] input= {1};
        int[] sorted=sort.of(input);
        assertArrayEquals(new int[] {1}, sorted);
    }
    
    @Test
    public void caseSortNumber12() {
        Sort sort= new Sort();
        int[] input= {1,2};
        int[] sorted=sort.of(input);
        assertArrayEquals(new int[] {1,2}, sorted);
    }
    
    @Test
    public void caseSortNumber21_12() {
        Sort sort= new Sort();
        int[] input= {2,1};
        int[] sorted=sort.of(input);
        assertArrayEquals(new int[] {1,2}, sorted);
    }
    
    @Test
    public void caseSortNumber123() {
        Sort sort= new Sort();
        int[] input= {1,2,3};
        int[] sorted=sort.of(input);
        assertArrayEquals(new int[] {1,2,3}, sorted);
    }

}
