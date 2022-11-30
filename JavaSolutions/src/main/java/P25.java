import java.math.BigInteger;

class P25 {

  public P25() {
    BigInteger prevNum = BigInteger.ONE;
    BigInteger currNum = BigInteger.ONE;
    BigInteger temp = BigInteger.ZERO;
    int index = 2;

    while (currNum.toString().length() < 1000) {
      temp = prevNum;
      prevNum = currNum;
      currNum = prevNum.add(temp);
      index++;
    }
    System.out.println(index);
  }

}