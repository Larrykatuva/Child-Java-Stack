
public class ChildStack {
	private int maxSize;
	private Child[] children;
	private int top;
	
	
	/**
	 * Class constructor
	 * @param size
	 */
	public ChildStack(int size) {
		this.maxSize = size;
		this.children = new Child[this.maxSize];
		this.top = -1;
	}
	
	
	/**
	 * Pushing new child into the stack
	 * @param firstname
	 * @param lastName
	 * @param age
	 */
	public void push(String firstname, String lastName, int age) {
		this.children[++this.top] = new Child(firstname, lastName, age);
	}
	
	
	/**
	 * Popping child from the stack
	 * @return Child
	 */
	public Child pop() {
		return this.children[this.top--];
	}
	
	/**
	 * Checking the stack top child
	 * @return Child
	 */
	public Child peek() {
		return this.children[this.top];
	}
	
	
	/**
	 * Checking if the stack is empty
	 * @return boolean
	 */
	public boolean isEmpty() {
		return this.top == -1;
	}
	
	
	/**
	 * Displaying all the stack children
	 */
	public void displayChildren() {
		while(!this.isEmpty()) {
			Child current = this.pop();
			System.out.println("Full names: "+current.getFullName()+" Age: "+current.getAge());
		}
	}
	
	
	
}
