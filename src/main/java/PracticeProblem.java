public class PracticeProblem {

	public static void main(String args[]) {

	}
    //Q1
    public static boolean validIndex(int[] arr, int index) {
        try {
            int value = arr[index];
            return true;
        } catch (ArrayIndexOutOfBoundsException e) {
            return false;
        } catch (NullPointerException e) {
            return false;
        }
    }

   //Q2
    public static int divide(int num1, int num2) {
        try {
            return num1 / num2;
        } catch (ArithmeticException e) {
            return 0;
        }
    }

    //Q3
    public static int safeConvertStringtoInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return 0;
        } catch (NullPointerException e) {
            return 0;
        }
    }
	

}
