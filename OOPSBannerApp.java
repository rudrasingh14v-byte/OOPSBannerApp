/**
 * This class demonstrates a simple Java application that displays the object
 * Oriented Programming System oops acronym to the console.
 * @author Rudra Singh
 * @version 1.6
 **/

public class OOPSBannerApp {

    static class CharacterPatternMap {
        Character character;

        String[] pattern;
        

        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public Character getCharacter() {
            return character;
        }
        
        public String[] getPattern() {
            return pattern;
        }
    }

    public static CharacterPatternMap[] createCharacterPatternMaps() {

        String[] spacePattern = {
            "       ",
            "       ",
            "       ",
            "       ",
            "       ",
            "       ",
            "       "
        };
        
        CharacterPatternMap[] characterPatternMap = new CharacterPatternMap[4];
        characterPatternMap[0] = new CharacterPatternMap('O', getO());
        characterPatternMap[1] = new CharacterPatternMap('P', getP());
        characterPatternMap[2] = new CharacterPatternMap('S', getS());
        characterPatternMap[3] = new CharacterPatternMap(' ', spacePattern);
        
        return characterPatternMap;
    }

    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter().equals(ch)) {
                return map.getPattern();
            }
        }

        return charMaps[3].getPattern();
    }

    public static void printMessage(String message, CharacterPatternMap[] charMaps) {

        message = message.toUpperCase();
        

        for (int i = 0; i < 7; i++) {
            StringBuilder lineBuilder = new StringBuilder();
            

            for (int j = 0; j < message.length(); j++) {
                char currentChar = message.charAt(j);
                String[] pattern = getCharacterPattern(currentChar, charMaps);
                lineBuilder.append(pattern[i]).append(" ");
            }
            
            System.out.println(lineBuilder.toString());
        }
    }
    

    public static String[] getO() {
        String a[] = {
            "  ***  ",
            " ** ** ",
            "**   **",
            "**   **",
            "**   **",
            " ** ** ",
            "  ***  "
        };
        return a;
    }
    
    public static String[] getP() {
        String b[] = {
            "*****  ",
            "**   **",
            "**   **",
            "*****  ",
            "**     ",
            "**     ",
            "**     "
        };
        return b;
    }
    
    public static String[] getS() {
        String c[] = {
            " ***** ",
            "**     ",
            "**     ",
            " ****  ",
            "     **",
            "**   **",
            " ****  "
        };
        return c;
    }

    public static void main(String[] args) {

        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        

        String message = "OOPS";
        
        printMessage(message, charMaps);
    }
}
