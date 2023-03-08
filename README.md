# VersionComparator
Java utility which compares two version numbers

Operates by splitting each version into an array of strings using "." as the delimiter. The arrays are then compared index-wise until two strings are not equal or 
until the end of both arrays has been reached. 

If version1 > version2 returns 1

If version1 < version2 returns -1

otherwise returns 0

Assumes that the version strings are non-empty and contain only digits and the 'dot' character. The 'dot' character does not represent a
decimal point and is used to separate number sequences.

Complete with testing suite for utility logic.
