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
      "eighteen",
      "nineteen"
  };

  String hAnd = "hundredand";

  public P17() {
    int len = 0;
    for (String e : singDig) {
      len += e.length();
    }

    for (int i = 10; i <= 1000; i++) {
      String[] num = String.valueOf(i).split("");
      if (i < 20) {
        len += dubDig[i - 10].length();
      } else if(i >= 20 && i < 100){
        len+=dubDig(num[0]);
        if(!num[1].equalsIgnoreCase("0")){
          len+=singDig[Integer.parseInt(num[1])].length();
        }
      }else {
        if(num[1].equalsIgnoreCase("0")){
          len+=singDig[Integer.parseInt(num[0])].length() + hAnd.length() + singDig[Integer.parseInt(num[2])].length();
        }else{
          len+=singDig[Integer.parseInt(num[0])].length() + hAnd.length() + dubDig(num[1]) +singDig[Integer.parseInt(num[2])].length();
        }
      }
    }
    System.out.println(len+"onethousand".length());

  }

  private int dubDig(String dig){
    int len = 0;
    switch (dig){
      case "2":
        len+="twenty".length();
        break;
      case "3":
        len+="thirty".length();
        break;
      case "4":
        len+="forty".length();
        break;
      case "5":
        len+="fifty".length();
        break;
      case "6":
        len+="sixty".length();
        break;
      case "7":
        len+="seventy".length();
        break;
      case "8":
        len+="eighty".length();
        break;
      case "9":
        len+="ninety".length();
        break;
    }
    return len;
  }

}