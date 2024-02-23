package Controller;

import java.util.Scanner;

public class Validation {
    private final static Scanner in = new Scanner(System.in);
    private final static String idReg = ".\\d";
    public String checkInputString() {
        //loop until user input correct
        while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }

    public String checkInputID(){
        while(true){
            String result = checkInputString();
            if(result.matches(idReg)){
                return result;
            }else{
                System.out.println("Wrong format(cd): ");
                System.out.println("Please enter again");
            }
        }
    }

    public int checkInt() {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                if (result < 0) {
                    throw new NumberFormatException();

                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input a valid price tag");
                System.out.print("Enter again: ");
            }
        }
    }

    public int checkInt(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();

                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input item no. in range [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }
    
    public int checkQuantity(int quantity2) {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                if (result > quantity2) {
                    throw new NumberFormatException();

                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input quantity smaller than " + quantity2);
                System.out.print("Enter again: ");
            }
        }
    }

    public boolean checkInputYN() {
        //loop until user input correct
        while (true) {
            String result = checkInputString();
            //check user input y/Y or n/N
            if (result.equalsIgnoreCase("Y")) {
                return true;
            } else if (result.equalsIgnoreCase("N")) {
                return false;
            }
            System.err.println("Please input y/Y or n/N.");
            System.out.print("Enter again: ");
        }
    }
}
