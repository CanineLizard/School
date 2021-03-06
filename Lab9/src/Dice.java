import java.util.*;
/**
 * Information and methods for a game die (dice).
 * 
 * @author Lorrie Lehmann 
 * @version v1
 */

public class Dice {
	
    private int numberOfSides;
    private int face;
	
    private Random numberGenerator;//declare a reference 
                                    //variable for a Random 
                                    //object	
	public Dice( )
	{
	    numberOfSides = 6;
	    numberGenerator = new Random( );
	    roll( );
	} 
	
	public Dice( int inNumberOfSides)
	{
	    numberOfSides = inNumberOfSides;
	    numberGenerator = new Random( );
	    roll( );
	}  
	
	public void roll( )
	{
	    face = numberGenerator.nextInt(numberOfSides) + 1;
    }
   
   public String toString( )
   {
       String result;
       switch(face)
       {
           case 1:  result =    "1";
                    break;
           case 2:  result =  	"2";
                    break;
           case 3:  result = 	"3";
                    break;
           case 4:  result = 	"4";
                    break;
           case 5:  result = 	"5";
                    break;
           case 6:  result = 	"6";
                    break;
           default: result = "face is " + face;
        }
        return result;
    }
    
    public int getFace( )
    {
        return face;
    }    
   
    
    public boolean equals(Dice inDie)
    {
       return (face == inDie.face) && (numberOfSides == inDie.numberOfSides);
    }
    
    public int compareTo(Dice inDie)
    {
        int answer;
        
        if(face > inDie.face)
        {
           answer = 1;
        }
        else
        {
            if(face < inDie.face)
            {
                answer = -1;
            }
            else
            {
                answer = 0;
            }
        }   
        return answer;
    }
    
     
 }
	    
	    
	    
	    
	    
	    
	    
	    
	    