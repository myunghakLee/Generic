package homework;

public class StackGeneric {
	public static void main(String arg[]){
		Stack<Integer> stackInteger = new Stack<Integer>();	
		stackInteger.push(1);
		stackInteger.push(2);
		System.out.println(stackInteger.pop());
		System.out.println(stackInteger.pop());
		
		Stack<String> stackString = new Stack<String>();	
		stackString.push("Kookmin University");
		stackString.push("Korea Seoul");
		System.out.println(stackString.pop());
		System.out.println(stackString.pop());
	}
}

class Stack<T> {
	Node<T> top;
	
	public T pop() {
		T a = top.getData();
		top = top.getNext();
		return a;
	}
	
	public void push(T a) {
			if(top ==null)
			{
				top = new Node<T>(a);
			}
			else
			{
				Node<T> next_node= new Node<T>(a);
				next_node.setNext(top);
				top = next_node;
			}
	}
}

class Node<T1> {
	Node<T1> next;
	T1 data;
	public Node(T1 a) {    	
		data = a;
    }
	public T1 getData() {
		return data;
	}
	public Node<T1> getNext() {
		return next;
	}
	public void setNext(Node<T1> next_node) {
		next = next_node;
	}
}
