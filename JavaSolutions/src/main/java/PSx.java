import java.util.ArrayList;

class PSix {

    int sumOfSquares = 0;

    int numsAdded = 0;

    public PSix(){

        for(int i = 1; i < 101; i++){
            sumOfSquares += (Math.pow(i, 2));
        }

        for(int i = 1; i < 101; i++){
            numsAdded += i;
        }

        int squareOfSum = (int) Math.pow(numsAdded, 2);

        if(sumOfSquares > squareOfSum)
            System.out.println(sumOfSquares - squareOfSum);
        else
            System.out.println(squareOfSum - sumOfSquares);

    }

}
