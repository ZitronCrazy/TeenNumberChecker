public class TeenNumberChecker {
    public static boolean hasTeen(int Teen1, int Teen2, int Teen3) {
        return isTeen(Teen1) || isTeen(Teen2) || isTeen(Teen3);
    }
    public static boolean isTeen(int Teen) {

        if (Teen < 0) {
            return false;
        } else if (Teen < 13 && Teen > 19) {
            return false;
        } else if (Teen >= 13 && Teen <= 19) {
            System.out.println("Teen is " + Teen + " years old.");
            return true;
        }
        return false;
    }
}