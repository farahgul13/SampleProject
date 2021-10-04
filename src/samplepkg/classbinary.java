package samplepkg;

public class classbinary {

	public static void main(String[] args) {
		int N=9;
		String nStr = Integer.toBinaryString(N);

        boolean isCounting = false;
        int j=0;
        int[] seqs = new int[32];
        for (int i=0; i<nStr.length(); i++)
        {
            if ( nStr.charAt(i) == '1')
            {
                if (!isCounting)
                {
                    isCounting = true;
                    seqs[j] = 0;
                }
                else // isCounting, turn it off
                {
                    isCounting = false;
                    j++;
                }

            }
            else // nStr.charAt(i) == '0'
            {
                if (!isCounting)
                    isCounting = true;
                seqs[j]++;
            }

        }
        if (isCounting == true)
            seqs[j] = 0;

        int maxGap = 0;
        for (int k=0; k<seqs.length; k++)
            if (seqs[k] > maxGap)
                maxGap = seqs[k];
        //return maxGap;
        System.out.println(maxGap);
	}

}


