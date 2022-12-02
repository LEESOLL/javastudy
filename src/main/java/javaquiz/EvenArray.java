package javaquiz;

public class EvenArray {
    public static int[] getEvenNumArray(int n) {
        int[] evenNumArray = new int[n/2];

        for(int i = 0; i < evenNumArray.length; i++) {
            evenNumArray[i] = 2*i + 2;
        }

        return evenNumArray;
    }

    public static void main(String[] args) {
       for(int x : getEvenNumArray(100)) {
           System.out.print(x + " ");
       }
    }
}
