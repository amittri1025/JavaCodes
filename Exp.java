class ArrayList{

	int size; 
	int pos;
	int [] arr;
	
	ArrayList(int size){
		this.size = size;
		pos=0;
		arr = new int[size];
	}

	void add(int value){
		arr[pos] = value;
		pos++;
	}
	
	void display(){
		for(int i=0; i<pos; i++){
				System.out.println(arr[i]);
			}
	}

}

class Stack{
	
	void reverse(ArrayList l){
			int size = l.pos;
			int i=0, j=size-1;
			while(i<=j){	
				int temp = l.arr[j];
				l.arr[j] = l.arr[i];
				l.arr[i] = temp;
				i++;
				j--;
			}
	}
}

public class Exp{

	public static void main(String[] args){
	
		ArrayList list  = new ArrayList(10);
		
		list.add(1);
		list.add(2);
		list.add(3);
	
		
		Stack st = new Stack();
		st.reverse(list);
		
		list.display();
	
		
	}
	
}
