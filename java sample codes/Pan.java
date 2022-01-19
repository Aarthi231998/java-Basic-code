class Pan{
public static void main(String[] args){
int i=1221,n,temp;
int rev=0;
temp=i;
while(temp>0)
  {
   n=temp%10;
   rev=(rev*10)+n;
   temp=temp/10;
  }
 if(i==rev)
{
System.out.print(i+ "\t" +"it is a palindrome");
 }
else{
System.out.print(i+"its not a palindrome");
}
}
}