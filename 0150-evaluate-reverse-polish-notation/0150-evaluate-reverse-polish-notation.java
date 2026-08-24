class Solution {
    public int evalRPN(String[] tokens) {
        int result;
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].matches("-?\\d+")){
                stack.push(Integer.parseInt(tokens[i]));
            }else if(tokens[i].equals("+")){
                int b=stack.pop();
                int a=stack.pop();
                result=(a+b);
                stack.push(result);
            }else if(tokens[i].equals("-")){
                int b=stack.pop();
                int a=stack.pop();
                result=(a-b);
                stack.push(result);
            }else if(tokens[i].equals("*")){
                int b=stack.pop();
                int a=stack.pop();
                result=(a*b);
                stack.push(result);
            }else if(tokens[i].equals("/")){
                int b=stack.pop();
                int a=stack.pop();
                result=(a/b);
                stack.push(result);
            }
        }
        result = stack.pop();
        return result;
    }
}