import java.math.BigInteger;

class P16 {
  public P16() {
    BigInteger num = new BigInteger((new BigInteger("2")).pow(1000).toString());
    BigInteger sum = new BigInteger("0");
    String[] numArray = num.toString().split("");
    for (String e : numArray) {
      sum = sum.add(new BigInteger(e));
    }
    System.out.println(sum);
  }
}