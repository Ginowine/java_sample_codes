import java.util.Scanner;

public class Stack {
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input=sc.next();
            java.util.Stack<Character> stacky = new java.util.Stack<Character>();
            for (int i = 0; i < input.length(); i++) {
                if (!stacky.isEmpty()) {
                    switch(input.charAt(i)) {
                        case '}' : if (stacky.peek() == '{') {
                            stacky.pop();
                        } break;
                        case ']' : if (stacky.peek() == '[') {
                            stacky.pop();
                        } break;
                        case ')' : if (stacky.peek() == '(') {
                            stacky.pop();
                        } break;
                        default: stacky.push(input.charAt(i));
                    }
                } else {
                    stacky.push(input.charAt(i));
                }
            }
            System.out.println(stacky.isEmpty());
        }

//        YOU CAN ALSO IMPLEMENT THE ABOVE USING THE BELOW BLOCK OF CODE
//        while (sc.hasNext()) {
//            String input=sc.next();
//            //Complete the code
//            while(input.length() != (input = input.replaceAll("\\(\\)|\\[\\]|\\{\\}", "")).length());
//            System.out.println(input.isEmpty());
//        }

    }
}
