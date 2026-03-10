/**
 * This class demonstrates a simple Java application that displays the object
 * Oriented Programming System oops acronym to the console.
 * @author Rudra Singh
 * @version 1.7
 **/

public static HashMap<Character, String[]> createCharacterMap() {
    
    HashMap<Character, String[]> charMap = new HashMap<>();
    
    
    charMap.put('O', new String[] {
        "  ***  ",
        " ** ** ",
        "**   **",
        "**   **",
        "**   **",
        " ** ** ",
        "  ***  "
    });
    
    
    charMap.put('P', new String[] {
        "*****  ",
        "**   **",
        "**   **",
        "*****  ",
        "**     ",
        "**     ",
        "**     "
    });
    
    
    charMap.put('S', new String[] {
        " ***** ",
        "**     ",
        "**     ",
        " ****  ",
        "     **",
        "**   **",
        " ****  "
    });
    
    
    charMap.put(' ', new String[] {
        "       ",
        "       ",
        "       ",
        "       ",
        "       ",
        "       ",
        "       "
    });
    
    return charMap;
}


public static void displayBanner(String message, HashMap<Character, String[]> charMap) {
    
    message = message.toUpperCase();
    
    
    int patternHeight = charMap.get('O').length;
    
    
    for (int line = 0; line < patternHeight; line++) {
        StringBuilder sb = new StringBuilder();
        
        
        for (char ch : message.toCharArray()) {
            
            String[] pattern = charMap.get(ch);
            
            
            if (pattern == null) {
                pattern = charMap.get(' ');
            }
            
          
            sb.append(pattern[line]).append(" ");
        }
        
        System.out.println(sb.toString());
    }
}

public static void main(String[] args) {
    // Create character map using HashMap
    HashMap<Character, String[]> charMap = createCharacterMap();
    
    // Define the message to be displayed
    String message = "OOPS";
    
    // Display the banner message
    displayBanner(message, charMap);
}

