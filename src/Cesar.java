public class Cesar {
    StringBuilder cipher(String message, int offset) {
        StringBuilder result = new StringBuilder();
        for (
                char character : message.toCharArray()){
           if(character!= ' '){
               int StartPosition = character - 'a';
               int NewPosition = (StartPosition + offset) % 26;
               char NewCharacter = (char)('a'+ NewPosition);
               result.append(NewCharacter);
                          }
           else {result.append(character);}
        }
return result;
    }
}
