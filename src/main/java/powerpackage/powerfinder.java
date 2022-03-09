package powerpackage;

public class powerfinder {
    public static int OF(int value, int pow) {
        int result = 1;
        for (int i = 0; i<pow; i++) {
            result*=value;
        }
        return result;
    }
}
