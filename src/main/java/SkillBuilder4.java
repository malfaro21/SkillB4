
/**
 * SkillBuilder5 is a class for completing the Skill
 * Builder 5 assignment in Java.
 *
 * @author <You>
 * @version 1.0
 */

public class SkillBuilder4
{
    private static final String letterToFindT = "T";
    private static final String letterToFindt = "t";
    private static final String letterToFindY = "Y";
    private static final String letterToFindy = "y";

    public static String findTYPattern(String s)
    {
        StringBuilder returnPhrase = new StringBuilder();
        int counter = 0;
        for (int index = 0; index < s.length(); index++) {
            char ch = s.charAt(index);
            char wordtoFindT = letterToFindT.charAt(0);
            char wordtoFindt = letterToFindt.charAt(0);
            char wordtoFindY = letterToFindY.charAt(0);
            char wordtoFindy = letterToFindy.charAt(0);
            if (ch == wordtoFindT || ch == wordtoFindt) {
                returnPhrase.append(ch);
                for (int index2 = index + 1; index2 < s.length(); index2++) {
                    char ch2 = s.charAt(index2);
                    if (ch2 == wordtoFindy || ch2 == wordtoFindY) {
                        returnPhrase.append(ch2);
                        counter +=1;
                        index = index2 + 1;
                        break;
                    }
                    else {
                        returnPhrase.append(ch2);
                    }
                }

            }
            if(counter == 0 ){
                returnPhrase.delete(0,s.length());
            }
        }
        return returnPhrase.toString();
    }
}
