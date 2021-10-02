
public class ChildApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildStack stack = new ChildStack(5);
		
		stack.push("Ian", "Mumo", 3);
		stack.push("Beti", "Mutinda", 8);
		stack.push("Sheillah", "Ndanu", 5);
		stack.push("Grace", "Ndanu", 7);
		stack.push("Loy", "Ndotu", 6);
		
		System.out.println(stack.isEmpty());
		
		stack.displayChildren();

	}

}
