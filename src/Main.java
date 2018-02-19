import java.util.Scanner;
public class Main {

    public static void main(String[] args) { // edit comment for git hub
        Scanner myscanner = new Scanner(System.in);
        System.out.println("Enter a hexadecimal number:");
        String input = myscanner.next();
        String upper = input.toUpperCase();
        String hexNum = upper.substring(2);
        int figure0Value = (int) upper.charAt(0);
        long value = 0;
        if (figure0Value == 48) {

            for (int i = 0; i < hexNum.length(); i++) {
                if (i == 0 && hexNum.length() == 0){
                    continue;

                }



                char figure1 = hexNum.charAt(i);
                int charVal = (int) figure1;


                if (charVal < 57) {
                    charVal = charVal - 48;
                } else if (charVal == 57) {
                    charVal = charVal - 48;
                } else {
                    charVal = charVal - 55;
                }
                value += charVal * Math.pow(16, (hexNum.length() - i - 1));
            }


        } else {
            for (int i = 0; i < upper.length(); i++) {
                char figure1 = upper.charAt(i);
                int charVal = (int) figure1;

                if (charVal < 57) {
                    charVal = charVal - 48;
                } else if (charVal == 57) {
                    charVal = charVal - 48;
                } else {
                    charVal = charVal - 55;
                }
                value += charVal * Math.pow(16, (upper.length() - i - 1));
            }


        }

        System.out.println("Your number is " + value + " in decimal");


    }

}