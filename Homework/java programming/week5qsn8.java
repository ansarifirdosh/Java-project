public class week5qsn8 {
public static void main(String[] args) 
{
    int Sum[][]=new int[2][3];
 int a[][]={{2,5,6},{5,7,9}};
 int b[][]={{5,3,4},{6,9,7}};
            
for(int i=0;i<2;i++){
for(int j=0;j<3;j++){
    Sum[i][j]=a[i][j] + b[i][j];
System.out.print(Sum[i][j]+" ");
}
System.out.println();
}
}
}