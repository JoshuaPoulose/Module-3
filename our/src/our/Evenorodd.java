package our;


	public class Evenorodd {
		int a[]= {1,2,3,4,5,6,7,8,9,10};
//		int b[]=new int[10];
//		int c[] = new int[10];
		int j=0;
		int k=0;
		int count=0;
		int count1=0;
		public  void evenorodd() {
			for(int i=0;i<a.length;i++)
			{
				if(a[i]%2==0)
				{
				
//					b[j]=a[i];
//					j++;
				count++;
					
					
				}
				else
				{
					
//					c[k]=a[i];
//					k++;
					count1++;
				}
			}
			int b[]=new int[count];
			int c[]=new int[count1]; 
			
			for(int i=0;i<a.length;i++)
			{
				
				if(a[i]%2==0)
				{
					b[j]=a[i];
					j++;
				}
				else
				{
					c[k]=a[i];
					k++;
					}
				}
				
			System.out.println("even elements:");
			for(int j=0;j<b.length;j++)
			{
				System.out.print(b[j]);
			}
			System.out.println();
			System.out.println("odd elements:");
			for(int k=0;k<c.length;k++)
			{
				System.out.print(c[k]);
			}
			System.out.println("");
			
			int d[]=new int[count+count1];
			for(int e=0;e<count;e++) {
				d[e]=b[e];
			}
			for(int e=0;e<count1;e++) {
				d[count+e]=c[e];
			}
			System.out.println("All elements:");
			for(int e=0;e<count+count1;e++) {
				System.out.print(d[e]+" ");
			}
			
			
			}
		
		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Evenorodd obj = new Evenorodd();
			obj.evenorodd();
			

		}

	}



