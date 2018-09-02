package learn.avinash.datastruct;

public class BigOArrayNoatition {

    public static void main(String[] args) {
	     int[] intArray = new int[7];
        intArray[0] = 20;

        intArray[1] = 35;

        intArray[2] = -5;

        intArray[3] = 7;

        intArray[5] = 1;

        intArray[5] = -21;

        int index =-1;

        for(int i=-0 ; i < intArray.length;i++){
            if(intArray[i] == 7){
                index = i;
                break;
            }
        }

        System.out.print("Index = " + index);

    }
}
