/**
 * Created by YSingh on 29/04/17.
 */
public class EditDistance {
    public static void main(String[] args) {
        String str1 = "CAT";
        String str2 = "CAR";
        
        System.out.println(getDistance(str1, str2));
    }

    private static int getDistance(String str1, String str2) {
        int [][] M = new int[str1.length() + 1][str2.length() + 1];
        for (int i = 1; i < str1.length(); i++) {
            for (int j = 1; j < str2.length(); j++) {
                if(str1.charAt(i) == str2.charAt(j)) {
                    M[i][j] = 0;
                }
            }
        }

        return M[str1.length()][str2.length()];
    }
}
