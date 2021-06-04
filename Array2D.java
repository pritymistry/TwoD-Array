class Array2D{
	public static void main(String args[]){
		int i=Integer.parseInt(args[0]),j=Integer.parseInt(args[1]),arg=2,sum=0;
		int a[][]=new int[i][j];
		for(int c1=0;c1<i;c1++){
			for(int c2=0;c2<j;c2++){
				a[c1][c2]=Integer.parseInt(args[arg++]);
			}
		}
		for(int c1=0;c1<i;c1++){
			for(int c2=0;c2<j;c2++){
				System.out.print(a[c1][c2]+" ");
			}
			System.out.println();
		}	
		for(int c1=0;c1<i;c1++){
			for(int c2=0;c2<j;c2++){
				sum=sum+a[c1][c2];
			}
		}
		System.out.println("sum of all elements = "+ sum);
	}
}
