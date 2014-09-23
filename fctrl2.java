
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class fctrl2{
public static void main(String args[]) throws Exception{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
while(t-->0)
{
int n=Integer.parseInt(br.readLine());
int a[]=new int[1000];
a[0]=1;
int m=1;
int temp=0;
for(int i=1;i<=n;i++)
{
  
 for(int j=0;j<m;j++)
 {
   a[j]=a[j]*i+temp;
   temp=a[j]/10;
   a[j]%=10;
 
 }
 while(temp>0)
 {
   a[m++]=temp%10;
   temp/=10;
 }
}
 
 for(int j=m-1;j>=0;j--)
  System.out.print(a[j]);
  System.out.println();



}
}
}
