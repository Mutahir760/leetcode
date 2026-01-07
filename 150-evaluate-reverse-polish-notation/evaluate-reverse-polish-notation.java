class Solution {
    public int evalRPN(String[] tokens) {

        Deque<Integer> stack = new ArrayDeque<>();

        for (String t : tokens) {

            switch (t) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;

                case "-":
                    int b = stack.pop();
                    int a = stack.pop();
                    stack.push(a - b);
                    break;

                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;

                case "/":
                    int d = stack.pop();
                    int c = stack.pop();
                    stack.push(c / d); // truncates toward zero
                    break;

                default:
                    stack.push(Integer.parseInt(t));
            }
        }

        return stack.pop();
    }
}