class P17 {

  String[] singDig = {
      "zero",
      "one",
      "two",
      "three",
      "four",
      "five",
      "six",
      "seven",
      "eight",
      "nine"
  };

  String[] dubDig = {
      "ten",
      "eleven",
      "twelve",
      "thirteen",
      "fourteen",
      "fifteen",
      "sixteen",
      "seventeen",
      "eightteen",
      "nineteen",
      "twenty",
      "thirty",
      "fourty",
      "fifty",
      "sixty",
      "seventy",
      "eighty",
      "ninety"
  };

  String hAnd = "hundredand";

  public P17() {
    int len = 0;
    for (String e : singDig) {
      len += e.length();
    }

    for (int i = 10; i <= 1000; i++) {
      if (i < 20) {
        len += dubDig[i - 10].length();
      } else {
        String[] num = String.valueOf(i).split("");
      }
    }

  }
}