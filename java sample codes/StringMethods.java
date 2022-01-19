class StringMethods
{
 public static void main(String[] args)
{
String a="Aarthi";
String b="lavanya";
String c="Seshadri";
String d="Java is a popular programming language.Java is used to develop mobile apps, web apps, desktop apps, games and much more.Java is an object oriented language";
String e="java training candid";
String f="  java   ";

//charAt()
System.out.println("a=Aarthi - displaying the 2nd character using charAt():");
System.out.println(a.charAt(2));
System.out.println("");

//concat()
System.out.println("a=Aarthi and c=Seshadri combining a&c using concat():"); 
System.out.println(a.concat(c));
System.out.println("");


//startsWith()
System.out.println("a=Aarthi checking whether a startswith aar using startsWith():");
System.out.println(a.startsWith("aar"));
System.out.println("");


//endsWith()
System.out.println("a=Aarthi checking whether a endswith thi using endsWith():");
System.out.println(a.endsWith("thi"));
System.out.println("");


//equals()  
System.out.println("a=Aarthi and b=lavanya checking whether a and b are equal using equals():");
System.out.println(a.equals(b));
System.out.println("");


//indexOf()
System.out.println("displaying the index of java in d:");
System.out.println(d.indexOf("Java"));
System.out.println("");

System.out.println("displaying the index of java which occurs after 12th position in d:");
System.out.println(d.indexOf("Java",12));
System.out.println("");


//lastIndexOf()
System.out.println("displaying the index of java which occurs lastly in the sentence(d):");
System.out.println(d.lastIndexOf("Java"));
System.out.println("");


//length()
System.out.println("a=Aarthi displaying the length of a using length():");
System.out.println(a.length());
System.out.println("");


//replaceAll()
System.out.println("replacing all the j letter with p using replaceAll():");
System.out.println(d.replaceAll("J","p"));
System.out.println("");


//replace()
System.out.println("replacing the java word with python using replace():");
System.out.println(d.replace("Java","python"));
System.out.println("");


//replaceFirst()
System.out.println("replacing the 1st occuring java word with python using replaceFirst():");
System.out.println(d.replaceFirst("Java","python"));
System.out.println("");


//substring()
System.out.println("b=lavanya displaying the 0 to 4th character in b:");
System.out.println(b.substring(0,4));
System.out.println("");


//split()
System.out.println("e=java training candid, spliting e using split()");
String[] y=e.split(" ");
for(String x : y) 
{
System.out.println(x);
}
System.out.println("");


//toUpperCase()
System.out.println("a=Aarthi changing the name to uppercase:");
System.out.println(a.toUpperCase());
System.out.println("");


//toLowerCase()
System.out.println("a=Aarthi changing the name to lowercase:");
System.out.println(a.toLowerCase());
System.out.println("");


//trim()
System.out.println("triming the f using trim():");
System.out.println(f);
System.out.println(f.trim());
}
}
