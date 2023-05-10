package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        number = 457;
        int remainder = number%10;
        int reverse = 0;
        reverse = reverse * 10 + remainder;
        number = number/10;

        System.out.println(reverse);


    }
}
