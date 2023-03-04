public class Main {
    public static void main(String[] args) {
        int[] array = {6,4,1,3,6,7,8} ;
        int index = min(array);
        System.out.println("so nho nhat trong mang la :" + (array[index]));
    }

    static int min(int[] array) {
        int index1 = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] < array[index1]){
                index1 = i ;
            }
        }
        return index1;
    }
}
