class P10 {
  public P10(int n) {
    boolean[] prime = new boolean[n + 1];
    for (int i = 0; i < prime.length; i++)
      prime[i] = (i > 1) ? true : false;

    for (int p = 2; p * p <= n; p++) {

      if (prime[p]) {
        for (int i = p * p; i <= n; i += p) {
          prime[i] = false;
        }
      }
    }
    long sum = 0;
    for (int i = 2; i <= n; i++) {
      if (prime[i])
        sum+=i;
    }

    System.out.println(sum);
  }

}