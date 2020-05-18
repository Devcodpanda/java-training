public class StringTraining {

    /**
     * @param firstname, ie : "Brandon"
     * @return a string that concatenates "Hello " and firstname, ie : "Hello Brandon"
     */ 
    String firstname = "Brandon";
    
    public static String helloFirstname(String firstname) {
       
        return "Hello " + firstname ;
    }

    /**
     * @param first  word, ie : "test"
     * @param second word, ie : "value"
     * @return a string with both word, ie : "testvalue"
     */
    
    public static String concatArgs(String first, String second) {

        return first + second;
    }

    /**
     * @param origin  string, eg: "test"
     * @param compare string, eg: "sample"
     * @return if origin string is equal to compare string
     */
    
    public static boolean equals(String origin, String compare) {

        return origin.equals(compare) ? true : false;
    }

    /**
     * @param value character, eg: 't'
     * @return conversion of the character into String, eg: "t"
     */
        
    public static String charToString(char value) {

        return Character.toString(value);
    }

    /**
     * @param value integer, eg: 3
     * @return convertion of the integer into String, eg: "3"
     */
    
    public static String intToString(int value1) {

        return String.valueOf(value1);
    }

    /**
     * @param string, eg: "test"
     * @return string length, eg: 4
     */
    
    public static int length(String string) {

        return string.length();
    }

    /**
     * @param string, ie "test"
     * @return string in upper case, eg: "TEST"
     */
    
    public static String upper(String string1) {

        return string1.toUpperCase();
    }

    /**
     * @param string, eg: "TEST"
     * @return string in lower case, eg: "test"
     */
        
    public static String lower(String string2) {

        return string2.toLowerCase();
    }

    /**
     * @param string, eg: "test"
     * @return first character of the string, eg: 't'
     */
    
    public static char firstChar(String string3) {

        return string3.charAt(0);
    }

    /**
     * @param string, eg: "value"
     * @return last character of the string, eg: 'e'
     */
    
    public static char lastChar(String string4) {

        return string4.charAt(string4.length()-1);
    }

    /**
     * @param string, eg: "test"
     * @param begin   position (inclusive) of the substring, eg: 1
    * @param end     position (exclusive) of the substring, eg: 3
     * @return the substring from begin position to end position, eg: "es"
     */
    
    public static String subString(String string5, int begin, int end) {

        // https://howtodoinjava.com/java/string/java-string-substring-example/

        return string5.substring(begin,end);
    }

    /**
     * @param string, eg: "test"
     * @return the string with the first character in upper case, eg: "Test" 
     */

    public static String capitalize(String string6) {
        
        return string6.substring(0, 1).toUpperCase() + string6.substring(1);
    }

    /**
     * @param string, eg: "test"
     * @param search  character, eg: 't'
     * @return the number of character occurrences in string, eg: 2
     */
    
    public static int occurrences(String string7, char search) {
        int nb = 0;
        for (int i=0; i < string7.length(); i++)
        {
            if (string7.charAt(i) == search)
                nb++;
        }
        return nb;

        // return (string7.split(String.valueOf(search), -1).length ) - 1;


    }


    /**
     * @param string,  eg: "test"
     * @param search,  eg: 't'
     * @param replace, eg: 'w'
     * @return the string where searched characters are replaced, eg: "wesw"
     */
    
    public static String replaceChar(String string8, char search8, char replace) {

        // return string8.replace(search8, replace);

        return string8.replaceAll(String.valueOf(search8), String.valueOf(replace));
    }

    /**
     * @param string,  eg: "test"
     * @param search,  eg: "e"
     * @param replace, eg: "oa"
     * @return the string where searched substring are replaced, eg: "toast"
     */

    public static String replaceString(String string, String search, String replace) {

        return string.replace(search, replace);
    }

    /**
     * @param string,    eg: "test|value"
     * @param delimiter, eg: "|"
     * @return string array that contains values splited on the delimiter, eg: {"test", "value"}
     */
    
    public static String[] split(String string10, String delimiter) { // https://howtodoinjava.com/java/string/java-string-split-example/

        return string10.split(delimiter);
    }

    /**
     * @param strings    array, eg: {"test", "value"}
     * @param delimiter, eg: ";"
     * @return string of array values joined with the delimiter, ex: "test;value"
     */
    String[] string11 = {"test","value"};
    String delimiter11 = ";";
    
    public static String join(String[] strings11, String delimiter) {  // https://howtodoinjava.com/java8/java-8-join-string-array-example/

        return String.join(delimiter, strings11);
    }
}
