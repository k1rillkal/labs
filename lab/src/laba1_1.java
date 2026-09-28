import java.util.ArrayDeque;

public class laba1_1 {


    public boolean cb(String str){
        boolean b = true;
        if (str.length()<1 || str.length() > 10000) {
            b=false;
        }
        else {
            ArrayDeque<Character> stack = new ArrayDeque<>();
            for(int i = 0;i < str.length(); i++){
                char c = str.charAt(i);
                if ( c!='(' && c!=')'&& c!='[' && c!=']'&& c!='{'&& c!='}' ) {
                    b=false;
                    break;
                }
                if (c == '(' || c == '[' || c == '{')
                    stack.push(c);
                else {
                    if (!stack.isEmpty() && c == ')' && stack.peek() == '(') stack.pop() ;
                    else if (!stack.isEmpty() && c == ']' && stack.peek() == '[') stack.pop() ;
                    else if (!stack.isEmpty() && c == '}' && stack.peek() == '{') stack.pop() ;
                    else b=false;
                }
            }
            if (!stack.isEmpty()) b=false;
        }
        return b;
    }

    void main() {
        String str = "";
        System.out.println(cb(str));
    }


}
