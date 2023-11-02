class count
{  
//variable to keep track of objects  
private static int c;  
//constructor of the class  
public count()   
{  
// increase the count variable by 1  
c++;  
}  
public static void main(String args[])   
{  
//creating objects  
count ob1 = new count();  
count ob2 = new count();  
count ob3 = new count();  
count ob4 = new count();  
count ob5 = new count();  
//prints number of objects  
System.out.print("Total Number of Objects: " + count.c);  
}  
}  