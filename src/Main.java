

public class Main {
    public static void main(String[] args) {

xAndy();
secondQ();
thirdQ();
fourthQ();git

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







    }
