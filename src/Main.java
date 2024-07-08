import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

xAndy();
secondQ();
thirdQ();
fourthQ();
fifthQ();
sixthQ();
seventhQ();

    }
    static void xAndy (){
        int x = 7;

        if (x < 10){
            System.out.println("Less than 10");

        }
    }

    static void secondQ () {
        int x = 15;

        if (x < 10) {
            System.out.println("Less than 10");

            if (x > 10) {
                System.out.println("Greater than 10");
            }
        }

    }


    static void thirdQ (){
        int x = 15;

        if (x < 10){
            System.out.println("Less than 10");
        }
        else if (x > 10 && x < 20) {
            System.out.println("Between 10 and 20");
        }
        if (x >= 20) {
            System.out.println("Greater than or equal to 20");
        }
    }
        static void fourthQ (){
            int x = 15;

            if (x < 10 || x > 20){
                System.out.println("Out of Range");
            } else if (x>=10 && x<=20) {
                System.out.println("In Range");

            }

        }

        static void fifthQ () {
            Scanner scan = new Scanner(System.in);
            int grade = scan.nextInt();

            if (grade >= 90 && grade <= 100) {
                System.out.println("A");
            } else if (grade >= 80 && grade <= 89) {
                System.out.println("B");
            } else if (grade >= 70 && grade <= 79) {
                System.out.println("C");
            } else if (grade >= 60 && grade <= 69) {
                System.out.println("D");
            } else if (grade <= 60 && grade > -1) {
                System.out.println("F");
            } else {
                System.out.println("Score out of Range");
            }
        }

            static void sixthQ () {
                Scanner days = new Scanner(System.in);
                int num = days.nextInt();
                switch (num) {
                    case 1:
                        System.out.println("Monday");
                        break;
                    case 2:
                        System.out.println("Tuesday");
                        break;
                    case 3:
                        System.out.println("Wednesday");
                        break;
                    case 4:
                        System.out.println("Thursday");
                        break;
                    case 5:
                        System.out.println("Friday");
                        break;
                    case 6:
                        System.out.println("Saturday");
                        break;
                    case 7:
                        System.out.println("Sunday");
                        break;
                    default:
                        System.out.println("Out of Range");
                }
            }
            //I HONESTLY DID NOT UNDERSTAND THIS ONE.

            static void seventhQ (){

                Scanner input = new Scanner(System.in);
                System.out.print("(0-single filer, 1-married jointly or " +
                        "qualifying widow(er), 2-married separately, 3-head of " +
                        "household) Enter the filing status: ");

                int status = input.nextInt();

                // Prompt the user to enter taxable income
                System.out.print("Enter the taxable income: ");
                double income = input.nextDouble();

                // Compute tax
                double tax = 0;

                if (status == 0) { // Compute tax for single filers
                    if (income <= 8350)
                        tax = income * 0.10;
                    else if (income <= 33950)
                        tax = 8350 * 0.10 + (income - 8350) * 0.15;
                    else if (income <= 82250)
                        tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                                (income - 33950) * 0.25;
                    else if (income <= 171550)
                        tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                                (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
                    else if (income <= 372950)
                        tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                                (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
                                (income - 171550) * 0.33;
                    else
                        tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                                (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
                                (372950 - 171550) * 0.33 + (income - 372950) * 0.35;
                }
                else if (status == 1) { // Compute tax for married file jointly
                    // Left as exercise in Programming Exercise 3.13
                }
                else if (status == 2) { // Compute tax for married separately
                    // Left as exercise in Programming Exercise 3.13
                }
                else if (status == 3) { // Compute tax for head of household
                    // Left as exercise in Programming Exercise 3.13
                }
                else {
                    System.out.println("Error: invalid status");
                    System.exit(1);
                }

                // Display the result
                System.out.println("Tax is " + (int)(tax * 100) / 100.0);
            }
}








