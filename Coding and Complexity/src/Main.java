public class Main {
    public static void main(String[] args) {


        //get user input for 2 strings?
        String input1 = "apple";
        String input2 = "appetizer";


        new CommonSubsequence();
        CommonSubsequence.findSubsequence(input1, input2);

        new NotFibonacci();
        NotFibonacci.calculateFib(8);

        new WhereInSequence();
        int result = WhereInSequence.findClosestFib(10);
        System.out.println(result);

        new RemoveElement();
        RemoveElement.findVal();


        new CommonSubstring();
        String answer = CommonSubstring.findLongestPrefixSuffix(input1, input2);
        System.out.println(answer);
    }
}