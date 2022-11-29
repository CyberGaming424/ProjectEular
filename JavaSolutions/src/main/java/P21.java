import java.util.ArrayList;

class P21 {
  public P21() {

    int sum = 0;
    for (int i = 1; i < 10000; i++) {
      if (isAmicable(i))
        sum += i;
    }

    System.out.println(String.valueOf(sum));

  }

  private boolean isAmicable(int n) {
    int pair = divisorSum(n);
    return (!(n == pair) && (divisorSum(pair) == n)) ? true : false;
  }

  private int divisorSum(int dividend) {
    int sum = 0;

    for (int i = 1; i < dividend; i++) {
      if (dividend % i == 0)
        sum += i;
    }
    return sum;
  }
}