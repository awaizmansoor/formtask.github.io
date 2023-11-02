import java.util.Scanner;

public class Roman2Intergers {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a Roman numeral: ");
            String romanNumeral = scanner.nextLine().toUpperCase(); 
            scanner.close();
    
            int result = romanToInteger(romanNumeral);
            System.out.println("The Roman numeral " + romanNumeral + " is equivalent to " + result);
        }
    
        public static int romanToInteger(String romanNumeral) {
            int result = 0;
            int prevValue = 0;
    
            for (int i = romanNumeral.length() - 1; i >= 0; i--) {
                char currentChar = romanNumeral.charAt(i);
    
                int currentValue = 0;
                switch (currentChar) {
                    case 'I':
                        currentValue = 1;
                        break;
                    case 'V':
                        currentValue = 5;
                        break;
                    case 'X':
                        currentValue = 10;
                        break;
                    case 'L':
                        currentValue = 50;
                        break;
                    case 'C':
                        currentValue = 100;
                        break;
                    case 'D':
                        currentValue = 500;
                        break;
                    case 'M':
                        currentValue = 1000;
                        break;
                    default:
                        System.out.println("Invalid Roman numeral");
                        return 0; 
                }
    
                if (currentValue < prevValue) {
                    result -= currentValue;
                } else {
                    result += currentValue;
                }
    
                prevValue = currentValue;
            }
    
            return result;
        }
    }
    
    
