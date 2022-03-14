package arrys;

public class addarry {
	public static void main(String[]args){
		int a[] ={7,4,2,1};
		int b[]={3,9,6,5};
		int c[]= new int[4];
		for (int i=0; i<c.length;i++){
			c[i]=a[i]+b[i];
			System.out.println("sum of arry is" + c[i]);
		}
	}
}