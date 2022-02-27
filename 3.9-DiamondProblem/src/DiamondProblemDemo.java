interface First 
{  
    default void show() 
    { 
        System.out.println("Hii Default One"); 
    } 
} 
interface Second 
{  
    default void show() 
    { 
        System.out.println(" Hii Default Two"); 
    } 
}  
public class DiamondProblemDemo implements First, Second 
{  
    public void show() 
    {  
        First.super.show(); 
        Second.super.show(); 
    } 
    public static void main(String args[]) 
    { 
    	DiamondProblemDemo ob = new DiamondProblemDemo(); 
        ob.show(); 
    } 
}

