import java.util.Scanner;

public class BST {
	public static int getHeight(BNode root){
	       if(root == null) {
	           return -1;
	       }
	       return Math.max(1 + getHeight(root.left), 1 + getHeight(root.right));
	}
	
    public static BNode insert(BNode root,int data){
        if(root==null){
            return new BNode(data);
        }
        else{
            BNode cur;
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
        BNode root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
}
