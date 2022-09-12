// import java.util.Scanner;


class abException extends Exception{}

class task1{
    public static void main(String[] args) throws abException{
        

        String s = "NOPEAGB";
        boolean Capital = true;
        //Traverse through String
        for(int i = 0 ;i < s.length(); i++)
        {
            //Check A and B Exception
            if(s.charAt(i) == 'A' || s.charAt(i) == 'B')
                ABException(s.charAt(i));
            //Check if in lowerCase
            else if(s.charAt(i) <= 'A' || s.charAt(i) >= 'Z')
                Capital = false;
            
        }
        if(Capital)
            System.out.println("All Capital");
        else
            System.out.print("Letters Should be in Capital, Some Error Occured");
                
    } 

    private static void ABException(char ch) throws abException{
        if(ch == 'A'){
            try{
                throw new abException(); 
            }
            catch(abException e){
                System.out.println("Exception Of A");
            }
        }
        else
            throw new abException();
    }
}