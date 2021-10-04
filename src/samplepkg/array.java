package samplepkg;

public class array {

	public static int[] arrayfun(int[] A,int K) {
		  int len = A.length;
	        int[] B = new int[len];
	        int pos;
	        if(len > 0 && K % len != 0 )
	        {
	            for ( int i = 0; i < len; i++)
	            {
	            	pos = (K + i) % len;
	                B[pos] = A[i];
	            }
	        }
	        else
	        {
	           return A;
	        }
	        return B;
	}
	
	public static void main(String[] args) {
		  int[] A = {3, 8, 9, 7, 6};
		  int K =3;
		  arrayfun(A,K) ;
	}

}
