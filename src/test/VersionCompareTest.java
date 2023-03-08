import org.junit.Test;

import static org.junit.Assert.*;

public class VersionCompareTest {

    // 0.1 < 1.1 < 1.2 < 1.2.9.9.9.9 < 1.3 < 1.3.4 < 1.10

    @Test
    public void testVersion1BetterThanVersion2() {
        assertEquals(1, VersionCompare.compareVersion("1.34","1.10"));
        assertEquals(1, VersionCompare.compareVersion("1.10","1.3"));
        assertEquals(1, VersionCompare.compareVersion("1.3","1.2.9.9.9.9"));
        assertEquals(1, VersionCompare.compareVersion("1.2.9.9.9.9","1.2"));
        assertEquals(1, VersionCompare.compareVersion("1.2","1.1"));
        assertEquals(1, VersionCompare.compareVersion("1.1","0.1"));
    }

    @Test
    public void testVersion2BetterThanVersion1(){
        assertEquals(-1, VersionCompare.compareVersion("1.10","1.34"));
        assertEquals(-1, VersionCompare.compareVersion("1.3","1.10"));
        assertEquals(-1, VersionCompare.compareVersion("1.2.9.9.9.9","1.3"));
        assertEquals(-1, VersionCompare.compareVersion("1.2","1.2.9.9.9.9"));
        assertEquals(-1, VersionCompare.compareVersion("1.1","1.2"));
        assertEquals(-1, VersionCompare.compareVersion("0.1","1.1"));
    }

    @Test
    public void testVersion1EqualsVersion2(){
        assertEquals(0, VersionCompare.compareVersion("1.2","1.2"));
        assertEquals(0, VersionCompare.compareVersion("1.10","1.10.0"));
        assertEquals(0, VersionCompare.compareVersion("1.3.0","1.3"));
        assertNotEquals(0, VersionCompare.compareVersion("1.1", "1.0.1"));
        assertNotEquals(0, VersionCompare.compareVersion("1.2.9", "1.29"));

    }
}
