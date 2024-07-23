package Java_Array;

public class Problems_Array {
    public static void main(String[] args) {

        int number[] = {23,12,6,7,16,4,1,56};


        /*int sum = 0;
        for (int i = 0; i < number.length ; i++) {
            sum = sum + number[i];
        }
        System.out.println("Total Sum: " + sum);*/

        int min = Integer.MAX_VALUE;
        for(int num : number){
            if (num < min) {
                min = number;
            }
        }

        System.out.println(min);

    }
}
