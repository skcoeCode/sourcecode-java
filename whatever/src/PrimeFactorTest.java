import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeFactorTest {

    @Test
    public void casePrimeFactor2() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(2);
        System.out.println(result);
        assertEquals("2", result);
    }
    @Test
    public void casePrimeFactor3() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(3);
        System.out.println(result);
        assertEquals("3", result);
    }
    @Test
    public void casePrimeFactor4() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(4);
        System.out.println(result);
        assertEquals("22", result);
    }
    @Test
    public void casePrimeFactor6() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(6);
        System.out.println(result);
        assertEquals("23", result);
    }
    @Test
    public void casePrimeFactor8() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(8);
        System.out.println(result);
        assertEquals("222", result);
    }
    @Test
    public void casePrimeFactor10() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(10);
        System.out.println(result);
        assertEquals("25", result);
    }
    @Test
    public void casePrimeFactor12() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(12);
        System.out.println(result);
        assertEquals("223", result);
    }
    @Test
    public void casePrimeFactor7() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(7);
        System.out.println(result);
        assertEquals("7", result);
    }

}
