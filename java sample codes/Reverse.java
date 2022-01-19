class Reverse{
public static void main(String[] args){
int i=1234,n;
int rem=0;
while(i>0)
  {
   n=i%10;
   rem=(rem*10)+n;
   i=i/10;
  }
   System.out.print(rem);
 }
}