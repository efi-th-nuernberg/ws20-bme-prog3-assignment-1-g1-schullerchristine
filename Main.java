class Main {
  public static void main(String[] args) {
    int number = 0;
    String filter = " ";
    String filter2 = " ";
    for (int i=0; i<=200; i++) {
    System.out.println(number = i);
    filter = divideByFive(number);
    filter2 = numberEndsWithNine(number);
    System.out.println(filter + " " +  filter2);
    }
  }
  public static String divideByFive(int number) {
    String result = "";
    if(number%5==0){
      result = "Zahl ist durch 5 teilbar";
    }
    return(result);
  }

  public static String numberEndsWithNine(int number) {
    String result = "";
    if((number%10)==9){
      result="Zahl endet auf 9";
    }
    return(result);
  }

  public String twoNumbersDivideByThree(int numberOne, int numberTwo){
    String result = "Error";
    if(((numberOne + numberTwo)/3)==0){
      result ="Zahl und Vorgänger addiert ergeben Ergbenis und Ergbnis ist durch 9 teilbar";
    }
    return(result);
}
}