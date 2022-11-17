import java.math.BigInteger;

class P20 {
  public P20() {
    BigInteger product = new BigInteger("100");
    for (int i = 99; i > 0; i--) {
      product = product.multiply(new BigInteger(String.valueOf(i)));
    }

    BigInteger sum = BigInteger.ZERO;
    String[] prodStr = product.toString().split("");
    for (String e : prodStr) {
      sum = sum.add(new BigInteger(e));
    }

    System.out.println(sum);

  }
}