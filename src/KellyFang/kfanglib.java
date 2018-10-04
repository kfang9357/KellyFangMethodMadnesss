package KellyFang;

public class kfanglib {

    public static boolean isFibonacci(int num)
    {
        int first = 1;
        int second  = 1;

        while ((first<num)&&(second<num))
        {
            second = first + second;
            first = first + second;
        }

        if ((first == num)||(second == num))
        {
            return true;
        }

        else
        {
            return false;
        }
    }

    public static boolean isPalindrome(String str) {
        String backwards = "";
        for (int i=str.length(); i>0; i--)
        {
            backwards = backwards + str.substring(i-1, i);
        }
        if (str.equals(backwards))
        {
            return true;
        }
        else
        {
            return false;
        }
    }


    public static int sumUpTo(int num)
    {
        int i = 0;
        int sum = 0;

        while (i < num+1)
        {
            sum = sum + i;
            i++;
        }
        return sum;
    }

}