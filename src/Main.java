public class Main {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, 1, 1));
        System.out.println(hasEqualSum(1, 1, 2));
        System.out.println(hasEqualSum(1, -1, 0));
    }

    private static boolean hasEqualSum(int num1, int num2, int num3) {
        int variable = num1 + num2;
        //find sum of num1 and num2 store it as variable
        if (variable == num3){
            return true;
        }
        //return whether that sume is equal to num3;
        return false;
    }

}