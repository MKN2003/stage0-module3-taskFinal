package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        number = 457;
        int remainder, reverse = 0;
        while(number != 0) {
             remainder = number % 10;
             reverse = reverse * 10 + remainder;
             number = number / 10;
        }

        System.out.println(reverse);


    }
}
