import java.util.Arrays;

public class mul{


    public static void main(String[] args) {
		int a[][]= {{1,2,3},{1,2,3}};
		int b[][]= {{1,2},{1,2},{1,2}};
		multiplication(a, b);

	}
	static void multiplication(int a[][],int b[][]) {
		int r1=a.length;
		int r2=b.length;
		int c1=a[0].length;
		int c2=b[0].length;
		if(c1!=r2) {
			System.out.println("multiplication is not possible");
			return;
		}
		int ans[][]=new int[r1][c2];
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c2;j++) {
				for(int k=0;k<=r1;k++) {
					ans[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c2;j++) {
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
			}
        }
}