import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Coding_Challenges {
    public static void main(String[] args) {
//        increment_decrement();

//        increment_decrement_order();

//        convert_to_celcius();

//        overriding();

//        dice_if_else();

//        if_else();

//        array_challenge();

//        data_types();

//        array_reverse_and_sort();

        string_challenge();
    }

    private static void increment_decrement() {
        // Increment and Decrement
        int value = 0;
        System.out.println("Initial Value:" + value);
        value = value + 1;
        System.out.println("First Increment: " + value);
        value += 1;
        System.out.println("Second Increment: " + value);
        value++;
        System.out.println("Third Increment: " + value);
        value = value - 1;
        System.out.println("First Decrement: " + value);
        value -= 1;
        System.out.println("Second Increment: " + value);
        value--;
        System.out.println("Third Increment:" + value);
    }

    private static void increment_decrement_order() {
        //Increment and Decrement Order
        int value = 1;
        value++;
        System.out.println("First:" + value);
        System.out.println("Second:" + value++);
        System.out.println("Third:" + value);
        System.out.println("First:" + (++value));

        int new_value = 1;
        ++new_value;
        new_value++;
        System.out.println("First:" + new_value);
    }

    private static void convert_to_celcius() {
        //Converting to Celcius
        int fahrenheit = 94;
        double temperature = ((fahrenheit - 32) * 5.0 / 9);
        System.out.println("The temperature is " + temperature + " degree Celsius");
        System.out.println("Temperature Rounded off is " + Math.round(temperature) + " degree Celsius");
    }

    private static void overriding() {
        //Overriding
        Random dice = new Random();
        int roll1 = dice.nextInt();
        int roll2 = dice.nextInt(101);
        int roll3 = dice.nextInt(50, 101);
        System.out.println("First roll: " + roll1);
        System.out.println("Second roll: " + roll2);
        System.out.println("Third roll: " + roll3);

    }

    private static void dice_if_else() {
        //Dice If Else

        Random dice = new Random();
        int roll1 = dice.nextInt(1, 8);
        int roll2 = dice.nextInt(1, 8);
        int roll3 = dice.nextInt(1, 8);
        int total = roll1 + roll2 + roll3;

        System.out.println("Dice roll: " + " " + roll1 + " " + roll2 + " " + roll3);

        if ((roll1 == roll2) && (roll2 == roll3)) {
            System.out.println("You rolled triples! +5 bonus to total!");
            total += 5;
        } else if (((roll1 == roll2) || (roll2 == roll3) || (roll1 == roll3))) {
            System.out.println("You rolled doubles! +3 bonus to total!");
            total += 3;
        }

        if (total >= 15) {
            System.out.println("You win!");
        } else {
            System.out.println("Sorry, you lose.");
        }
    }

    private static void if_else() {
        Random random = new Random();
        int daysUntilExpiration = random.nextInt(24);
        int discountPercentage = 0;

        if (daysUntilExpiration == 1) {
            discountPercentage = 20;
        }

        if (daysUntilExpiration <= 5) {
            discountPercentage = 10;
        }

        if (daysUntilExpiration < 1) {
            System.out.println("Your subscription has expired!");
        } else if (daysUntilExpiration == 1) {
            System.out.println("Your subscription expires within a day!");
            System.out.println("Renew now and save " + discountPercentage + "%!");
        } else if (daysUntilExpiration <= 5) {
            System.out.println("Your subscription expires in: " + daysUntilExpiration + " days.");
            System.out.println("Renew now and save " + discountPercentage + "%!");

        } else if (daysUntilExpiration <= 10) {
            System.out.println("Your subscription expires in: " + daysUntilExpiration + " days.");

            System.out.println("Your subscription will expire soon. Renew now!");
        } else {
            System.out.println("Your subscription will expire soon. Renew now!");
        }
    }

    private static void array_challenge() {
        String[] orderIds = {"B123", "C234", "A345", "C15", "B177", "G3003", "C235", "B179", "B912", "J234", "D12"};

        for (String item : orderIds) {
            if (item.startsWith("B")) {
                System.out.println(item);
            }
        }

        /*
          The following code creates five random OrderIDs
          to test the fraud detection process. OrderIDs
          consist of a letter from A to E,
          and a three-digit number. Ex. A123.
        */
        Random random = new Random();
        String[] orderIDs = new String[5];

        System.out.println("******************************");
        System.out.println("Testing Fraud Detection System");

        for (int i = 0; i < orderIDs.length; i++) {
            int prefixValue = random.nextInt(5) + 65;
            char prefix = (char) prefixValue;
            String suffix = String.format("%03d", random.nextInt(1000));

            orderIDs[i] = prefix + suffix;
        }

        for (String orderID : orderIDs) {
            System.out.println(orderID);
        }
    }

    private static void data_types() {
        System.out.println("Signed integral type:");
        System.out.println("byte : " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("short : " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("int : " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("long : " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
    }

    private static void array_reverse_and_sort() {
        String[] pallets = {"B14", "A11", "B12", "A13", "A18", "B78", "C90"};

        System.out.println("Sorted ....");
        Arrays.sort(pallets);
        for (String pallet : pallets) {
            System.out.println("--" + pallet);
        }

        System.out.println("Reverse ....");
        Arrays.sort(pallets, java.util.Collections.reverseOrder());
        for (String pallet : pallets) {
            System.out.println("--" + pallet);
        }

        System.out.println("Clearing ...");
        String[] clearedPallets = new String[pallets.length];
        Arrays.fill(clearedPallets, null);
        System.arraycopy(clearedPallets, 0, pallets, 0, clearedPallets.length);
        if (pallets[0] != null) {
            System.out.println("Before: " + pallets[0].toLowerCase());
        }

        Arrays.fill(pallets, 0, 2, null);
        if (pallets[0] != null) {
            System.out.println("After: " + pallets[0].toLowerCase());
        }
        System.out.println("Clearing count: " + pallets.length);
        if (pallets[0] != null) {
            for (String pallet : pallets) {
                System.out.println("-- " + pallet);
            }
        } else {
            System.out.println("Clearing complete");
        }
    }

    private static void string_challenge() {
        String s = "The quick brown fox jumps over the lazy dog";

        String[] subs = s.split(" ");
        for (String sub : subs) {
            char[] value = sub.toCharArray();
            for (int i = 0; i < value.length / 2; i++) {
                char temp = value[i];
                value[i] = value[value.length - 1 - i];
                value[value.length - 1 - i] = temp;
            }
            String result = new String(value);
            System.out.println(result);
        }
    }
}
