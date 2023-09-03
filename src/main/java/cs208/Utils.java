package cs208;

/**
 * Utility class containing static methods that are used in multiple places
 */
public class Utils
{
    /**
     * Repeats the given character the specified number of times and returns the resulting string
     *
     * @param character such as '-', '*', '=', etc.
     * @param numberOfRepeats the number of times to repeat the character
     * @return a string containing the character repeated the specified number of times
     *         (e.g., returns "----" if character is '-' and numberOfRepeats is 4)
     */
    public static String characterRepeat(Character character, int numberOfRepeats)
    {
        String buffer = "";
        for (int i = 0; i < numberOfRepeats; i++)
        {
            buffer += character;
        }
        return buffer;
    }
}
