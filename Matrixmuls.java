class Matrixmuls
{
	public static void main(String arg[])
	{
		int i,j,k;
		int a[][]={{1,2},{2,3}};
		int b[][]={{1,2},{2,3}};
		int c[][]=new int[2][2];
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				c[i][j]=0;
				for(k=0;k<2;k++)
				{
					c[i][j]+=a[i][k]*b[k][j];
				       
				}
				System.out.print(c[i][j]+" ");
			
                        }
			System.out.println();
		}
	}
}