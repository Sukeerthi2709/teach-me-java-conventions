package powerpackage;

public class PowerFinder {
    public static int of(int value, int pow) {
        int result = 1;
        for (int i = 0; i<pow; i++) {
            result*=value;
        }
        return result;
    }
}
