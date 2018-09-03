public class DisplayHelloWorld {

    public static void display(String str ){
        int count =0;

        for(int i = 0; i < str.length(); i++){
            count++;
            System.out.println("Print " + str.charAt(i) + " count : " + count);
        }

        displayCount(count(str));
    }


    public static void displayCount(int count){
        System.out.println( " count : " + count);

    }

    public static int count(String  str){
        return str.length();

    }

    public static void main(String[] args){
        String helloWorld = "Hello World";
        display(helloWorld);
    }
}
