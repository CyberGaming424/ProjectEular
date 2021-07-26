public class PSeven {

    int primeCounter = 6;
    int currentNum = 14;

    int numChecks[] = {2, 3, 4, 5};

    public PSeven(){

        while(primeCounter < 10002){
            if(checkPrime(currentNum))
                primeCounter++;
            else
                currentNum++;

            System.out.println(currentNum);
        }

        System.out.println(currentNum);

    }

    private boolean checkPrime(int num){

        // Corner case
        if (num <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < num; i++)
            if (num % i == 0)
                return false;

        return true;
    }

}
