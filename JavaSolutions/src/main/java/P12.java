class P12 {
  public P12() {
    int maxDiv = 0;
    int n = 7;
    int tri = 0;
    while (maxDiv <= 500) {
      tri = tri(n);
      int divs = findDivisors(tri);
      maxDiv = Math.max(divs, maxDiv);

      if (maxDiv < 500)
        n++;
    }

    System.out.println(tri);

  }

  private int tri(int n) {
    int tri = 0;
    for (int i = 1; i < n + 1; i++) {
      tri += i;
    }
    return tri;
  }

  private int findDivisors(int n) {
    int count = 0;
    for (int i = 1; i < Math.floor(Math.sqrt(n)) + 1; i++) {
      if (n % i == 0) {
        if ((i * i) != n) {
          count += 2;
        } else
          count++;
      }
    }
    return count;

  }

}