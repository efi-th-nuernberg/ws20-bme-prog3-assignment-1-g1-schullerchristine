class Main {
  public static void main(String[] args) {
    int numberOne = 0;
    String filter = " ";
    String filter2 = " ";
    String filter3 = " ";
    for (int i=0; i<=200; i++) {
    System.out.println(numberOne = i);
    filter = divideByFive(numberOne);
    filter2 = numberEndsWithNine(numberOne);
    int numberTwo = i-1;
    filter3 = twoNumbersDivideByThree(numberOne, numberTwo);
    numberTwo++;
    System.out.println(filter + " " +  filter2+ " " + filter3);
    }
  }
  public static String divideByFive(int number) {
    String result = "";
    if(number%5==0){
      result = "Number is divisble by 5";
    }
    return(result);
  }

  public static String numberEndsWithNine(int number) {
    String result = "";
    if((number%10)==9){
      result="Number ends with 9";
    }
    return(result);
  }

  public static String twoNumbersDivideByThree(int numberOne, int numberTwo){
    String result = "";
    if(((numberOne + numberTwo)%3)==0){
      result ="Number and predecessor add up to a result and result is divisble by 3";
    }
    return(result);
}
}