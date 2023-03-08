import java.util.Arrays;

public final class VersionCompare {

    /**
     * Utility method which compares two versions
     * @param version1 First version in String form
     * @param version2 Second version in String form
     * @return If version1 > version2 returns 1, <br>
     * If version1 < version2 returns -1, <br>
     * If version1 = version2 returns, 0
     */
    public static int compareVersion(String version1, String version2){

        // Split each version string into string array using "." as delimiter
        // i.e. 0.0.1.3 becomes ["0","0","1","3"]
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        System.out.println(Arrays.toString(v1));
        System.out.println(Arrays.toString(v2));

        return 1;
    }
    private VersionCompare(){}
}
