
package p3;


public class Password  {
    private String passwordStr;
    int digit = 0;
    int letter = 0; 
          
    public Password(String passwordStr) throws InvalidPasswordException{
         
           
            
        if(passwordStr==null || 
           passwordStr.isEmpty() || 
           passwordStr.equals(""))
        {
            throw new InvalidPasswordException();
        }else{
          
            for (int i = 0; i < this.passwordStr.length(); i++) {
               char ch = passwordStr.charAt(i);
               if(Character.isDigit(ch)){
                   digit++;
               }else if(Character.isLetter(ch)){
                   letter++;
               }
  
            }//for
            
            int alphNum = digit + letter;
                String errorMsg="";
                
                if(digit ==0)
                    errorMsg += "atleast 1 digit";
                if(letter == 0)
                    errorMsg += "atleast 1 letter";
                if(alphNum < 7)
                    errorMsg += "atleast 7 digit";
                if(!errorMsg.equals(""))
                    throw new InvalidPasswordException(errorMsg);
            
        }//else
    }
}

