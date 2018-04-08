import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.DelayQueue;

public class BFS {
	static void levelOrder(BFNode root){
	      //Write your code here
	      Queue q = new LinkedList();
	      q.add(root);
	      BFNode aNode = null;
	      while(!q.isEmpty()) {
	    	  	aNode = (BFNode)q.remove();
	    	  	System.out.print(aNode.data);
	    	  	if (aNode.left!=null) q.add(aNode.left);
	            if (aNode.right!=null) q.add(aNode.right);
	      }
	      
	   }

public static BFNode insert(BFNode root,int data){
    if(root==null){
        return new BFNode(data);
    }
    else{
        BFNode cur;
        if(data<=root.data){
            cur=insert(root.left,data);
            root.left=cur;
        }
        else{
            cur=insert(root.right,data);
            root.right=cur;
        }
        return root;
    }
}
public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        BFNode root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
        
        Map newMap  = new HashMap();
        newMap.forEach((k,v) -> {
        		System.out.println((k+"+"+v));
        });
        
    }	
}