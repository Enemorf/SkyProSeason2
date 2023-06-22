package SkyProHomeworks.part6;

import java.util.*;

public class main
{
    public static void main(String[] args)
    {
       // List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
       // printOddNumbers(nums);

       // List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
       // printNotOddNumbers(nums);

        // List<String> strings = new ArrayList<>(List.of("один","один","два","три","три"));
        // printUnicWord(strings);

        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        printRepeatWords(strings);

    }

    private static void printOddNumbers (List<Integer> numbers)
    {
        List<Integer> oddNum = new ArrayList<>();

        for(var num : numbers)
        {
            if(num%2 != 0)
                oddNum.add(num);
        }

        System.out.println(Arrays.toString(oddNum.toArray()));
    }

    private static void printNotOddNumbers(List<Integer> numbers)
    {
        HashSet<Integer> notOddNum = new HashSet<>();

        for(var num : numbers)
        {
            if(num%2 == 0)
                notOddNum.add(num);
        }

        System.out.println(Arrays.toString(notOddNum.toArray()));

    }

    private static void printUnicWord(List<String> words)
    {
        HashSet<String> unicWords = new HashSet<>(words);

        System.out.println(Arrays.toString(unicWords.toArray()));
    }

    private static void printRepeatWords (List<String> words)
    {
        HashMap<String,Integer> count = new HashMap<>();

            for(var word : words)
            {
                count.merge(word,1,Integer :: sum);
            }
        System.out.println(count.values());
    }

}
