public class Java_Gen {

    public static void print(int[] arr){
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
    public static void print(double[] arr){
        for(double x : arr){
            System.out.print(x+" ");
        }
    }
    public static void print(char[] arr){
        for(char x : arr){
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) {

        System.out.println("Hello world!");
        int[] inte = {1,2,3,4,5};
        double[] doub = {1.1,7.8,9.0,7,8};
        char[] chara = {'S','R','I'};
        print(inte);
        print(doub);
        print(chara);


    }
}