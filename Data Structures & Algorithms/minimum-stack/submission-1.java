class MinStack {

    ArrayList<Integer> stack = new ArrayList<>();
    ArrayList<Integer> minStack = new ArrayList<>();

    public MinStack() {
    }
    
    public void push(int val) {
        if(minStack.isEmpty() || minStack.get(minStack.size() - 1) > val) minStack.add(val);
        else minStack.add(minStack.get(minStack.size() - 1));
        stack.add(val);
    }
    
    public void pop() {
        minStack.remove(minStack.size() - 1);
        stack.remove(stack.size() - 1);
    }
    
    public int top() {
        return stack.get(stack.size() - 1);
    }
    
    public int getMin() {
        return minStack.get(minStack.size() - 1);
    }
}
