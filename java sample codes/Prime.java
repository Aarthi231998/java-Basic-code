class Prime{
public static void main(String[] args)
{
  int i,m,flag=0;
  int n=7;
  m=n/2;
  if(n==0||n==1)
   {
     System.out.print("It is not a Prime number");
   }
   else
    {
      for(i=2;i<=m;i++)
       {
         if(n%i==0)
           {
             System.out.print("it is not a prime number");
             flag=1;
             break; 
           }
       }
    
       if(flag==0)
        {
          System.out.print("it is a prime number");
        }
        }
}
}
