import java.util.ArrayList;

public class PFour {

    private ArrayList<Integer> nums = new ArrayList<>();
    private ArrayList<Integer> multNums = new ArrayList<>();
    private ArrayList<Integer> palindrome = new ArrayList<>();

    private int currentNum = 100;

    private int multiplier = 0;

    private int largestPalindrome = 0;

    public PFour(){

        while(currentNum < 1000){
            nums.add(currentNum);
            currentNum++;
        }

        for(int i = 0; i < nums.size(); i++){
            for(int j = 0; j < nums.size(); j++){
                multNums.add(nums.get(i)*nums.get(j));
            }
        }

        for(int i = 0; i < multNums.size(); i++){
            String forward = multNums.get(i).toString();
            // getBytes() method to convert string
            // into bytes[].
            byte[] strAsByteArray = forward.getBytes();

            byte[] result = new byte[strAsByteArray.length];

            // Store result in reverse order into the
            // result byte[]
            for (int j = 0; j < strAsByteArray.length; j++)
                result[j] = strAsByteArray[strAsByteArray.length -j - 1];
            if((new String(result)).equals(forward))
                palindrome.add(Integer.valueOf(new String(result)));
        }

        for(int i = 0; i < palindrome.size(); i++){
            if(palindrome.get(i) > largestPalindrome)
                largestPalindrome = palindrome.get(i);
        }

        System.out.println(largestPalindrome);


    }

}
