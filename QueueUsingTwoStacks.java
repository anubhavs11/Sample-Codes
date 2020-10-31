import java.util.*;
public class Queueusingtwostacks {

	    public static void main(String[] args) {

	        Scanner sc= new Scanner(System.in);
	        Stack<Integer> front= new Stack<>();
	        Stack<Integer> rear= new Stack<>();

	        int n=sc.nextInt();

	        while(n-- > 0){
	            
	            int t=sc.nextInt();
	            
	            if(t==1){

	                int x=sc.nextInt();
	                rear.push(x);    
	            }
	            else{

	                if(front.isEmpty()){

	                    while(!rear.isEmpty()){
	                        front.push(rear.peek());
	                        rear.pop();
	                    }
	                }

	                if(!front.isEmpty()){
				
			    if(t == 3)
	                    System.out.println(front.peek());

	                    if(t == 2)
	                    front.pop();

	                    
	                }
	            }
	        }
	    }

}
