// Question-02 Implementation of Stack using array(push,pop,print,isEmpty,isFull)
package labexam;

public class q2 {
	public static class stack{
		private int[] arr=new int[10];
		private int top=0;
		private int size=0;
		void push(int data) {
			if(top==arr.length) {
				System.out.println("stack is full (stack overflow) ");
				return;
			}
			arr[top]=data;
			top++;
			size++;
		}
		int pop() {
			if(top==0) {
				System.out.println("stack is empty");
				return -1;
			}
			int data=arr[top-1];
			arr[top-1]=0;
			top--;
			size--;
			return data;
		}
		void print() {
			if(top==0) {
				System.out.println("Stack is empty");
				return;
			}
			System.out.print("Stack : ");
			for(int i=0;i<top;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
		boolean isEmpty() {
			if(top==0) {
				return true;
			}
			return false;
		}
		boolean isFull() {
			if(top==arr.length) {
				return true;
			}
			return false;
		}
	}
	public static void main(String[] args) {
		stack st=new stack();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.print();
		st.pop();
		st.print();
		System.out.println("Stack is empty : "+st.isEmpty());
		System.out.println("Stack is full : "+st.isFull());
	}
}