package methodDemo;

import java.util.Scanner;

public class functionsPart1
{
    public static void main( String[] args )
    {
        Scanner console = new Scanner( System.in );
        System.out.println( "Enter your name:  " );
        String name = console.next();
        System.out.println( "Enter your last name:  " );
        String apellido = console.next();
        printNameCharacters( name );
        printNameLength( name );
        console.close();
    }

    private static void printNameLength( String name )
    {
    	for (int a = 0; a<name.length(); a++) {
    		System.out.println(name.charAt(a));
    		}//for
    	
    }

    private static void printNameCharacters( String name )
    {
        	System.out.println( "El numero de caractares es: " + name.length() );
    }
    
    private static void printFull( String name apellido)
    {
        	System.out.println( "El nombre completo es: " + name + " " + apellido );
    }
    
}