package Singlell;

public class SLL {

			private static final int location = 0;
			public Node head;
			public Node tail;
			public int size;
			
			public Node createSll(int nodevalue){
				head = new Node();
				Node node=new Node();
				node.value=nodevalue;
				node.next=null;
				head=node;
				tail=node;
				size=1;
				return head;
			}

			public void insertionSll(int insertion,int value){
				Node node=new Node();
				node.value=value;
				if(head==null){
					createSll(value);
				}
				else if(location==0){
					node.next=head;
					head=node;	
				}
				else if(location>=size){
					node.next=null;
					tail.next=node;
					tail=node;
				}
				else{
					Node tempNode=head;
					int index=0;
					while(index<location-1){
						tempNode=tempNode.next;
						index++;
					}
					Node nextNode=tempNode.next;
					tempNode.next=node;
					node.next=nextNode;
				}
				size++;
			}
			public void traversalSll(){
				if(head==null){
					System.out.println("list does not exist");
				}
				else{
					Node tempNode=head;
					for(int i=0;i<size;i++){
						System.out.println(tempNode.value+" ");
						tempNode=tempNode.next;
					}
				}
			}
		    boolean searchingSll(int searchvalue){
		    	if(head!=null){
		    		Node tempNode=head;
					for(int i=0;i<size;i++){
		       if(searchvalue==tempNode.value){
		    	   System.out.println("the value is present"+i);
		    	   return true;
		       }
		       tempNode=tempNode.next;
		    	}
		    }
		    	System.out.println("value is not present");
		    	return false;
		    }
		    public void deleteSll() {
		    	head=null;
		    	tail=null;
		    	System.out.println("the list is deleted");
		    }
}

