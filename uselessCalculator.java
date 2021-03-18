import java.util.Scanner;

class uselessCalculator {
    public static void main(String[] args){
        System.out.println("You are using the useless calculator!");
        System.out.println("To use the calculator again once you have input a math problem type /nextproblem, to quit using the calculator type /done.");
        uselessCalculator.restofcalculator();
    }
    public static void restofcalculator(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a math operator, make sure to capitalize!");
        String mathOperator = input.next();
        
        if (mathOperator.equals("Addition")){
            System.out.println("Please type the amount of numbers you would like to add.");
            String addNumbers = input.next();
            if (addNumbers.equals("2")){
                System.out.println(" + =");
                long addNumberOneOne = input.nextLong();
                System.out.println(addNumberOneOne + "+");
                long addNumberOneTwo = input.nextLong();
                long addNumberOneEquals = addNumberOneOne + addNumberOneTwo;
                System.out.println(addNumberOneOne + "+" + addNumberOneTwo + "=" + " " + addNumberOneEquals);
                String end = input.next();
                if (end.equals("/nextproblem")){
                    uselessCalculator.restofcalculator();
                }
                else if (end.equals("/done")){
                    System.out.println("Thank you for using the useless calculator!");
                }
            }
            else if (addNumbers.equals("3")){
                System.out.println(" + + =");
                long addNumberTwoOne = input.nextLong();
                System.out.println(addNumberTwoOne + "+ + =");
                long addNumberTwoTwo = input.nextLong();
                System.out.println(addNumberTwoOne + "+" + addNumberTwoTwo + "+ =");
                long addNumberTwoThree = input.nextLong();
                long addNumberTwoEquals = addNumberTwoOne + addNumberTwoTwo + addNumberTwoThree;
                System.out.println(addNumberTwoOne + "+" + addNumberTwoTwo + "+" + addNumberTwoThree + "= " + addNumberTwoEquals);
                String end = input.next();
                if (end.equals("/nextproblem")){
                    uselessCalculator.restofcalculator();
                }
                else if (end.equals("/done")){
                    System.out.println("Thank you for using the useless calculator!");
                }
            }
           else if (addNumbers.equals("4")){
               System.out.println(" + + + =");
               long addNumberThreeOne = input.nextLong();
               System.out.println(addNumberThreeOne + "+ + + =");
               long addNumberThreeTwo = input.nextLong();
               System.out.println(addNumberThreeOne + "+" + addNumberThreeTwo + "+ + =");
               long addNumberThreeThree = input.nextLong();
               System.out.println(addNumberThreeOne + "+" + addNumberThreeTwo + "+" + addNumberThreeThree + "+ =");
               long addNumberThreeFour = input.nextLong();
               long addNumberThreeEquals = addNumberThreeOne + addNumberThreeTwo + addNumberThreeThree + addNumberThreeFour;
               System.out.println(addNumberThreeOne + "+" + addNumberThreeTwo + "+" + addNumberThreeThree + "+" + addNumberThreeFour + "= " + addNumberThreeEquals);
               String end = input.next();
               if (end.equals("/nextproblem")){
                    uselessCalculator.restofcalculator();
                }
               else if (end.equals("/done")){
                    System.out.println("Thank you for using the useless calculator!");
                }
            }
          else{
          uselessCalculator.restofcalculator();
        }
     }
     else if (mathOperator.equals("Subtraction")){
         System.out.println("Please type the amount of numbers you would like to Subtract.");
            String minusNumbers = input.next();
            if (minusNumbers.equals("2")){
                System.out.println(" - =");
                long minusNumberOneOne = input.nextLong();
                System.out.println(minusNumberOneOne + "- =");
                long minusNumberOneTwo = input.nextLong();
                long minusNumberOneEquals = minusNumberOneOne - minusNumberOneTwo;
                System.out.println(minusNumberOneOne + "-" + minusNumberOneTwo + "= " + minusNumberOneEquals);
                String end = input.next();
                if (end.equals("/nextproblem")){
                   uselessCalculator.restofcalculator();
                }
                else if (end.equals("/done")){
                    System.out.println("Thank you for using the useless calculator!");
                }
            }
           else if (minusNumbers.equals("3")){
               System.out.println(" - - =");
               long minusNumberTwoOne = input.nextLong();
               System.out.println(minusNumberTwoOne + "- - =");
               long minusNumberTwoTwo = input.nextLong();
               System.out.println(minusNumberTwoOne + "-" + minusNumberTwoTwo + "- =");
               long minusNumberTwoThree = input.nextLong();
               long minusNumberTwoEquals = minusNumberTwoOne - minusNumberTwoTwo - minusNumberTwoThree;
               System.out.println(minusNumberTwoOne + "-" + minusNumberTwoTwo + "-" + minusNumberTwoThree + "= " + minusNumberTwoEquals);
               String end = input.next();
               if (end.equals("/nextproblem")){
                   uselessCalculator.restofcalculator();
                }
               else if (end.equals("/done")){
                   System.out.println("Thank you for using the useless calculator!");
                }
            }
           else if (minusNumbers.equals("4")){
               System.out.println(" - - - =");
               long minusNumberThreeOne = input.nextLong();
               System.out.println(minusNumberThreeOne + "- - - =");
               long minusNumberThreeTwo = input.nextLong();
               System.out.println(minusNumberThreeOne + "-" + minusNumberThreeTwo + "- - =");
               long minusNumberThreeThree = input.nextLong();
               System.out.println(minusNumberThreeOne + "-" + minusNumberThreeTwo + "-" + minusNumberThreeThree + "- =");
               long minusNumberThreeFour = input.nextLong();
               long minusNumberThreeEquals = minusNumberThreeOne - minusNumberThreeTwo - minusNumberThreeThree - minusNumberThreeFour;
               System.out.println(minusNumberThreeOne + "-" + minusNumberThreeTwo + "-" + minusNumberThreeThree + "-" + minusNumberThreeFour + "= " + minusNumberThreeEquals);
               String end = input.next();
               if (end.equals("/nextproblem")){
                   uselessCalculator.restofcalculator();
                }
               else if (end.equals("/done")){
                   System.out.println("Thank you for using the useless calculator!");
                }
            }
          else{
          uselessCalculator.restofcalculator();
        }
    }
       else if (mathOperator.equals("Multiplication")){
           System.out.println("Please enter the amount of numbers you would like to multiply.");
           String multiplyNumbers = input.next();
           if (multiplyNumbers.equals("2")){
               System.out.println(" * =");
               long multiplyNumberOneOne = input.nextLong();
               System.out.println(multiplyNumberOneOne + "* =");
               long multiplyNumberOneTwo = input.nextLong();
               long multiplyNumberOneEquals = multiplyNumberOneOne * multiplyNumberOneTwo;
               System.out.println(multiplyNumberOneOne + "*" + multiplyNumberOneTwo + "= " + multiplyNumberOneEquals);
               String end = input.next();
               if (end.equals("/nextproblem")){
                   uselessCalculator.restofcalculator();
                }
               else if (end.equals("/done")){
                   System.out.println("Thank you for using the useless calculator!");
                }
            }
           if (multiplyNumbers.equals("3")){
               System.out.println(" * * =");
               long multiplyNumberTwoOne = input.nextLong();
               System.out.println(multiplyNumberTwoOne + "* * =");
               long multiplyNumberTwoTwo = input.nextLong();
               System.out.println(multiplyNumberTwoOne + "*" + multiplyNumberTwoTwo + "* = ");
               long multiplyNumberTwoThree = input.nextLong();
               long multiplyNumberTwoEquals = multiplyNumberTwoOne * multiplyNumberTwoTwo * multiplyNumberTwoThree;
               System.out.println(multiplyNumberTwoOne + "*" + multiplyNumberTwoTwo + "*" + multiplyNumberTwoThree + "= " + multiplyNumberTwoEquals);
               String end = input.next();
               if (end.equals("/nextproblem")){
                  uselessCalculator.restofcalculator();
                }
               else if (end.equals("/done")){
                   System.out.println("Thank you for using the useless calculator!");
                }
            }
           if (multiplyNumbers.equals("4")){
               System.out.println(" * * * =");
               long multiplyNumberThreeOne = input.nextLong();
               System.out.println(multiplyNumberThreeOne +"* * * = ");
               long multiplyNumberThreeTwo = input.nextLong();
               System.out.println(multiplyNumberThreeOne + "*" + multiplyNumberThreeTwo + "* * =");
               long multiplyNumberThreeThree = input.nextLong();
               System.out.println(multiplyNumberThreeOne + "*" + multiplyNumberThreeTwo + "*" + multiplyNumberThreeThree + "* =");
               long multiplyNumberThreeFour = input.nextLong();
               long multiplyNumberThreeEquals = multiplyNumberThreeOne * multiplyNumberThreeTwo * multiplyNumberThreeThree * multiplyNumberThreeFour;
               System.out.println(multiplyNumberThreeOne + "*" + multiplyNumberThreeTwo + "*" + multiplyNumberThreeThree + "*" + multiplyNumberThreeFour + "= " + multiplyNumberThreeEquals);
               String end = input.next();
               if (end.equals("/nextproblem")){
                   uselessCalculator.restofcalculator();
                }
               else if (end.equals("/done")){
                   System.out.println("Thank you for using the useless calculator!");
                }
            }
            else{
          uselessCalculator.restofcalculator();
        }
     }
   else if (mathOperator.equals("Division")){
           System.out.println("Please enter the amount of numbers you would like to divide.");
           String divideNumbers = input.next();
           if (divideNumbers.equals("2")){
               System.out.println("/ =");
               long divideNumberOneOne = input.nextLong();
               System.out.println(divideNumberOneOne + "/ =");
               long divideNumberOneTwo = input.nextLong();
               long divideNumberOneEquals = divideNumberOneOne / divideNumberOneTwo;
               System.out.println(divideNumberOneTwo + "/" + divideNumberOneTwo + "= " + divideNumberOneEquals);
               String end = input.next();
               if (end.equals("/nextproblem")){
                   uselessCalculator.restofcalculator();
                }
               else if (end.equals("/done")){
                   System.out.println("Thank you for using the useless calculator!");
                }
            }
           if (divideNumbers.equals("3")){
              System.out.println("/ / =");
              long divideNumberTwoOne = input.nextLong();
              System.out.println(divideNumberTwoOne + "/ / =");
              long divideNumberTwoTwo = input.nextLong();
              System.out.println(divideNumberTwoOne + "/" + divideNumberTwoTwo + "/ =");
              long divideNumberTwoThree = input.nextLong();
              long divideNumberTwoEquals = divideNumberTwoOne / divideNumberTwoTwo / divideNumberTwoThree;
              System.out.println(divideNumberTwoOne + "/" + divideNumberTwoTwo + "/" + divideNumberTwoThree + "= " + divideNumberTwoEquals);
              String end = input.next();
               if (end.equals("/nextproblem")){
                  uselessCalculator.restofcalculator();
                }
               else if (end.equals("/done")){
                   System.out.println("Thank you for using the useless calculator!");
                }
            }
           if (divideNumbers.equals("4")){
               System.out.println("/ / / =");
               long divideNumberThreeOne = input.nextLong();
               System.out.println(divideNumberThreeOne + "/ / / =");
               long divideNumberThreeTwo = input.nextLong();
               System.out.println(divideNumberThreeOne + "/" + divideNumberThreeTwo + "/ / =");
               long divideNumberThreeThree = input.nextLong();
               System.out.println(divideNumberThreeOne + "/" + divideNumberThreeTwo + "/" + divideNumberThreeThree + "/ =");
               long divideNumberThreeFour = input.nextLong();
               long divideNumberThreeEquals = divideNumberThreeOne / divideNumberThreeTwo / divideNumberThreeThree / divideNumberThreeFour;
               System.out.println(divideNumberThreeOne + "/" + divideNumberThreeTwo + "/" + divideNumberThreeThree + "/" + divideNumberThreeFour + "= " + divideNumberThreeEquals);
               String end = input.next();
               if (end.equals("/nextproblem")){
                   uselessCalculator.restofcalculator();
                }
               else if (end.equals("/done")){
                   System.out.println("Thank you for using the useless calculator!");
                }
            }
            else{
          uselessCalculator.restofcalculator();
        }
     }
       else{
          uselessCalculator.restofcalculator();
        }
    } 
}