package samplepkg;

public class sort {

	public static void main(String[] args) {
		// you can also use imports, for example:
		// import java.util.*;

		// you can write to stdout for debugging purposes, e.g.
		// System.out.println("this is a debug message");

		class Solution {
		    public int solution(int[] arr) {
		     if (arr.length == 1) return arr[0];
		    int temp;
		   for (int i = 1; i < arr.length; i++) {
		    for (int j = i; j > 0; j--) {
		     if (arr[j] < arr [j - 1]) {
		      temp = arr[j];
		      arr[j] = arr[j - 1];
		      arr[j - 1] = temp;
		     }
		    }
		   }

		    int odd = -1;

		    for (int i = 0; i < arr.length; i++) {

		        if (i == arr.length-1) {
		            odd = arr[i];
		            break;
		        }
		        if (arr[i] == arr[i + 1]) {

		            i++;
		            continue;
		        }

		        odd = arr[i];
		    }

		   return odd; 
		    }
		}

	}

}
