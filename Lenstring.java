import java.util.*;
class Lenstring 
{
    public static void main(String[] args) 
    {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a string:");
        String s =sc.nextLine();
        System.out.println(lengthOfLastWord(s));     
    }

    public static int lengthOfLastWord(String s) 
    {
        s = s.trim();
        String[] words = s.split(" ");
        return words[words.length - 1].length();
    }
}
