public class ArrayAlgorithms
{
    public static double average(int[] numsList)
    {
        double sum = 0;
        for (int i = 0; i < numsList.length; i++)
        {
            sum += numsList[i];
        }
        return sum / numsList.length;
    }

    public static int minimum(int[] numsList)
    {
        int min = numsList[0];
        for (int i = 1; i < numsList.length; i++)
        {
            if (min > numsList[i]) min = numsList[i];
        }
        return min;
    }

    public static int howManyContain(String[] strList, String target)
    {
        int count = 0;
        for (int i = 0; i < strList.length; i++)
        {
            if (strList[i].contains(target)) count++;
        }
        return count;
    }

    public static String[] stringToArray(String myStr)
    {
        String[] result = new String[myStr.length()];
        for (int i = 0; i < myStr.length(); i++)
        {
            result[i] = myStr.substring(i, i + 1);
        }
        return result;
    }

    public static void reversePrint(String[] wordList)
    {
        String word = "";
        for (int i = wordList.length - 1; i >= 0; i--)
        {
            for (int j = wordList[i].length(); j > 0 ; j--)
            {
                word += wordList[i].substring(j - 1, j);
            }
            System.out.println(word);
            word = "";
        }
    }

    public static int[] combine(int[] arr1, int[] arr2)
    {
        int[] result = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++)
        {
          result[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++)
        {
         result[i + arr1.length] = arr2[i];
        }
        return result;
    }

    public static void bookEnd(int[] nums, int num)
    {
        nums[0] = num;
        nums[nums.length - 1] = num;
    }

    public static void multiplyBy(int[] numList, int multiplier)
    {
        for (int i = 0; i < numList.length; i++)
        {
            numList[i] *= multiplier;
        }
    }

    public static int[] multiplyByNoModify(int[] numList, int multiplier)
    {
        int[] result = new int[numList.length];
        for (int i = 0; i < numList.length; i++)
        {
            result[i] = multiplier * numList[i];
        }
        return result;
    }

    public static void shiftLeft(int[] numList)
    {
        int temp = numList[0];
        for (int i = 0; i < numList.length - 1; i++)
        {
            numList[i] = numList[i + 1];
        }
        numList[numList.length - 1] = temp;
    }

    public static void shiftRight(int[] numList)
    {
        int temp = numList[numList.length - 1];
        for (int i = numList.length - 1; i > 0; i--)
        {
            numList[i] = numList[i - 1];
        }
        numList[0] = temp;
    }

    public static void reverseStrat1(int[] numList)
    {
        int[] rev = new int[numList.length];
        for (int i = 0; i < numList.length; i++)
        {
            rev[i] = numList[i];
        }
        for (int i = numList.length - 1; i >= 0; i--)
        {
            numList[numList.length - i - 1] = rev[i];
        }
    }

    public static void reverseStrat2(int[] numList)
    {
        int temp = 0;
        for (int i = 0; i < numList.length / 2; i++)
        {
            temp = numList[i];
            numList[i] = numList[numList.length - 1 - i];
            numList[numList.length - 1 - i] = temp;
        }
    }

    public static String[] makeLowercase(String[] wordList)
    {
        String[] lowercase = new String[wordList.length];
        for (int i = 0; i < wordList.length; i++)
        {
            lowercase[i] = wordList[i].toLowerCase();
        }
        return lowercase;
    }

    public static void makeUppercase(String[] wordList)
    {
        for (int i = 0; i < wordList.length; i++)
        {
            wordList[i] = wordList[i].toUpperCase();
        }
    }

    public static int[] arrayMaximums(int[] intArr1, int[] intArr2)
    {
        int[] max = new int[intArr1.length];
        for (int i = 0; i < intArr1.length; i++)
        {
            if(intArr1[i] > intArr2[i]) max[i] = intArr1[i];
            else max[i] = intArr2[i];
        }
        return max;
    }

    public static int countConsecutiveDoubles(int[] numList)
    {
        int count = 0;
        int prevNum = 0;
        for (int num : numList)
        {
            if (num == prevNum) count++;
            prevNum = num;
        }
        return count;
    }

    public static int longestStreak(int[] nums)
    {
        int streak = 1;
        int maxStreak = 1;
        int prevNum = 0;
        for (int num : nums)
        {
            if (num == prevNum) streak++;
            else streak = 1;
            prevNum = num;
            if (streak > maxStreak) maxStreak++;
        }
        return maxStreak;
    }
}
