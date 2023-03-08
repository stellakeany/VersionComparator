import java.util.Arrays;

public final class VersionCompare {

    /**
     * <h1>Version Compare<h1/>
     * <h2>Utility method which compares two versions<h2/>
     * <p>Operates by splitting each version into an array of strings using "." as the delimiter. The arrays are then
     * compared index-wise until two strings are not equal or until the end of both arrays has been reached.<p/>
     * @param version1 First version in String form
     * @param version2 Second version in String form
     * @return If version1 > version2 returns 1, <br>
     * If version1 < version2 returns -1, <br>
     * If version1 = version2 returns, 0
     */
    public static int compareVersion(String version1, String version2){

        // i.e. 0.0.1.3 becomes ["0","0","1","3"]
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        int longestString = Math.max(v1.length, v2.length);

        for (int i = 0; i < longestString; i++) {
            int num1 = i < v1.length ? Integer.parseInt(v1[i]) : 0; // if end of shorter string reached return 0 since 1.0 == 1.0.0 etc
            int num2 = i < v2.length ? Integer.parseInt(v2[i]) : 0;

            if (num1 > num2){return 1;}
            if (num2 > num1){return -1;}
        }

        return 0;
    }
    private VersionCompare(){}
}
