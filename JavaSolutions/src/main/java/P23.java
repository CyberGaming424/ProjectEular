class P23 {

  private final int LIMIT = 28123;

  private boolean[] isAbundantArr = new boolean[LIMIT + 1];

  public P23() {
    for (int i = 0; i < isAbundantArr.length; i++) {
      isAbundantArr[i] = isAbundant(i);
    }

    int sum = 0;

    for (int i = 0; i < LIMIT; i++) {
      if (!isSum2Abun(i))
        sum += i;
    }

    System.out.println(sum);

  }

  private boolean isSum2Abun(int n) {
    for (int i = 0; i <= n; i++) {
      if (isAbundantArr[i] && isAbundantArr[n - i])
        return true;
    }
    return false;
  }

  private boolean isAbundant(int n) {
    int sum = 0;
    for (int i = 1; i < n; i++) {
      if (n % i == 0)
        sum += i;
    }
    return sum > n;
  }

}