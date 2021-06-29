package string.CrossPrinting;
public class CrossPrint {
    void start(String a){  // This method is called first from the Test class
        char[] A= a.toCharArray();
        for (int i=0,j=A.length-1;i<A.length;i++,j--){  // 'i' is used for iterating forward and 'j' is used for iterating backward.
            for (int k=0;k<A.length;k++){  // This for loop is for printing each element of a line
                if (k==i||k==j) System.out.print(A[k]); 
                else System.out.print(" ");
            }
            System.out.println();  // This is to go to the next line.
        }
    }
}
