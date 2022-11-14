
class P14 {

  public P14() {
    long len = 0;
    long n = 0;
    for (long i = 13; i < 1000000; i++) {
      long temp = seqLen(i);
      if (temp > len) {
        len = temp;
        n = i;
      }
    }

    System.out.println(n);
  }

  private long seqLen(long num) {
    long len = 1;
    boolean notOne = true;
    long n = num;
    while (n != 1) {
      if (n % 2 == 0)
        n = n / 2;
      else
        n = (3 * n) + 1;
      len++;
    }

    return len;
  }

}