public class Main {

    public static void main(String[] args) {

        scenario1();
        scenario2();
        scenario3();
        scenario4();
        scenario5();

    }

    public static void scenario1(){
        // Condition: Probability of rolling an odd number, on a single 6-sided die:
        // Probability: 3/6 or 50%

        int numTrue = 0;
        int numFalse = 0;
        int count = 100000;

        System.out.println("Scenario 1: Expected result 50%");

        for (int i = 0; i < count; i++){
            int result = (int)Math.floor(Math.random()*6)+1;

            if (result == 1 || result == 3 || result == 5){
                numTrue++;
            } else {
                numFalse++;
            }
        }

        System.out.println("Count of True: " + numTrue);
        System.out.println("Count of False: " + numFalse);
        System.out.println("Condition reached " + ((float)numTrue/(float)count)*100 + "%");
        System.out.println("===================================================================");

    }

    public static void scenario2(){
        // Condition: Probability of rolling an even number or a number greater than 5, on a single 10-sided die:
        // Probability: 7/10 = 70%

        int numTrue = 0;
        int numFalse = 0;
        int count = 100000;

        System.out.println("Scenario 2: Expected result 70%");

        for (int i = 0; i < count; i++){
            int result = (int)Math.floor(Math.random()*10)+1;

            if (result == 2 || result == 4 || result > 5){
                numTrue++;
            } else {
                numFalse++;
            }
        }

        System.out.println("Count of True: " + numTrue);
        System.out.println("Count of False: " + numFalse);
        System.out.println("Condition reached " + ((float)numTrue/(float)count)*100 + "%");
        System.out.println("===================================================================");

    }

    public static void scenario3(){
        // Condition: Probability of rolling an even number on the first roll and an odd number on the second roll, on a single 6-sided die:
        // Probability: 9/36 = 25%

        int numTrue = 0;
        int numFalse = 0;
        int count = 100000;

        System.out.println("Scenario 3: Expected result 25%");

        for (int i = 0; i < count; i++){
            int result1 = (int)Math.floor(Math.random()*6)+1;
            int result2 = (int)Math.floor(Math.random()*6)+1;

            if ((result1 == 2 || result1 == 4 || result1 == 6) && (result2 == 1 || result2 == 3 || result2 == 5)){
                numTrue++;
            } else {
                numFalse++;
            }
        }

        System.out.println("Count of True: " + numTrue);
        System.out.println("Count of False: " + numFalse);
        System.out.println("Condition reached " + ((float)numTrue/(float)count)*100 + "%");
        System.out.println("===================================================================");

    }

    public static void scenario4(){
        // Condition: Probability of rolling a 1 or 2 on the first roll, 3 or 4 on the second roll, and 5 or 6 on the last roll, on a single 6-sided die:
        // Probability: 8/216 = 3.70%

        int numTrue = 0;
        int numFalse = 0;
        int count = 100000;

        System.out.println("Scenario 4: Expected result 3.70%");

        for (int i = 0; i < count; i++){
            int result1 = (int)Math.floor(Math.random()*6)+1;
            int result2 = (int)Math.floor(Math.random()*6)+1;
            int result3 = (int)Math.floor(Math.random()*6)+1;

            if ((result1 == 1 || result1 == 2) && (result2 == 3 || result2 == 4) && (result3 == 5 || result3 == 6)){
                numTrue++;
            } else {
                numFalse++;
            }
        }

        System.out.println("Count of True: " + numTrue);
        System.out.println("Count of False: " + numFalse);
        System.out.println("Condition reached " + ((float)numTrue/(float)count)*100 + "%");
        System.out.println("===================================================================");

    }

    public static void scenario5(){
        // Condition: Probability of rolling a unique number four times (no repeats), on a single 6-sided die:
        // Probability: 360/1296 = 27.8%

        int numTrue = 0;
        int numFalse = 0;
        int count = 100000;

        System.out.println("Scenario 5: Expected result 27.8%");

        for (int i = 0; i < count; i++){
            int result1 = (int)Math.floor(Math.random()*6)+1;
            int result2 = (int)Math.floor(Math.random()*6)+1;
            int result3 = (int)Math.floor(Math.random()*6)+1;
            int result4 = (int)Math.floor(Math.random()*6)+1;

            if ((result1 != result2) && (result1 != result3) && (result1 != result4) && (result2 != result3) && (result2 != result4) && (result3 != result4)){
                numTrue++;
            } else {
                numFalse++;
            }
        }

        System.out.println("Count of True: " + numTrue);
        System.out.println("Count of False: " + numFalse);
        System.out.println("Condition reached " + ((float)numTrue/(float)count)*100 + "%");
        System.out.println("===================================================================");

    }
    
}
