public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println(isPalindromeSecond(-1221));
        System.out.println(isPalindromeSecond(707));
        System.out.println(isPalindromeSecond(11212));
        System.out.println("perfectnumber-----------");
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
        System.out.println("numberToWords-------------");
        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(-12));


    }

    public static boolean isPalindrome(int number){
        number=Math.abs(number);
        char[] digits = String.valueOf(number).toCharArray();
        String reversed="";

        for (int j=digits.length-1; j >= 0;  j--){
            reversed+=digits[j];
        }

        return  Integer.parseInt(reversed)==number;
        //return reversed.equals(String.valueOf( number));

       // for (int i = 0; i <digits.length-1 ; i++) {
         //   for (int j=0; j < digits.length-1;  j--) {
        //        if(digits[i]==digits[j]){
          //          return true;

        //       }else {
         //           return false;
         //       }
        //    }
       // }
       // return false;

    }
    public static boolean isPalindromeSecond(int number){
        number=Math.abs(number);
        int originNumber=number;
        int reversed=0;

        while (number>0){
            int digit = number%10;
            reversed=  reversed*10+digit;
            number=number/10;
        }
        return originNumber==reversed;
    }
    public static boolean isPerfectNumber(int number){
        int total=0;
        if(number<=0) return false;
        for (int i = 1; i <= number/2; i++) {
            if (number%i == 0) {
                total+=i;
            }
        }
        return  total==number;

        }



    public static String numberToWords (int number){
        if(number<0) return "Invalid Value";
        String namesOfNumbers="";
        char[] numberArray=String.valueOf(number).toCharArray();
        for (char digits :numberArray) {
            switch (digits){
                case '0':
                    namesOfNumbers+="Zero ";
                    break;
                case '1':
                    namesOfNumbers+="One ";
                    break;
                case '2':
                    namesOfNumbers+="Two ";
                    break;
                case '3':
                    namesOfNumbers+="Three ";
                    break;
            }

        }
        return namesOfNumbers.trim();


    }
}