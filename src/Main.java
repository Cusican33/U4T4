public class Main
{
    static void main()
    {
        //average method testing
        int[] nums = {6, 4, 0, 3, 9};
        double avg = ArrayAlgorithms.average(nums);
        System.out.println(avg);
        int[] nums2 = {4, 6, 7, 10, -2, 17, 5};
        double avg2 = ArrayAlgorithms.average(nums2);
        System.out.println(avg2);
        int[] nums3 = {7, 3};
        double avg3 = ArrayAlgorithms.average(nums3);
        System.out.println(avg3);

        System.out.println("\n --------------------------- \n");

        //minimum method testing
        int[] nums4 = {6, 4, 3, 9, 2, 5};
        int min = ArrayAlgorithms.minimum(nums4);
        System.out.println(min);
        int[] nums5 = {-4, 5, -7, 3};
        int min2 = ArrayAlgorithms.minimum(nums5);
        System.out.println(min2);
        int[] nums6 = {0, -5, -4, -6};
        int min3 = ArrayAlgorithms.minimum(nums6);
        System.out.println(min3);
        int[] nums7 = {10, 40, 20, 30, 50};
        int min4 = ArrayAlgorithms.minimum(nums7);
        System.out.println(min4);

        System.out.println("\n --------------------------- \n");

        //howManyContain method testing
        String[] words = {"apple", "banana", "cabana", "diva", "elephant"};
        int count = ArrayAlgorithms.howManyContain(words, "a");
        System.out.println(count);
        int count2 = ArrayAlgorithms.howManyContain(words, "an");
        System.out.println(count2);
        int count3 = ArrayAlgorithms.howManyContain(words, "ban");
        System.out.println(count3);
        int count4 = ArrayAlgorithms.howManyContain(words, "h");
        System.out.println(count4);
        int count5 = ArrayAlgorithms.howManyContain(words, "k");
        System.out.println(count5);
        System.out.println("---------");
        String[] words2 = {"i", "am", "sam"};
        int count6 = ArrayAlgorithms.howManyContain(words2, "i");
        System.out.println(count6);
        int count7 = ArrayAlgorithms.howManyContain(words2, "am");
        System.out.println(count7);
        int count8 = ArrayAlgorithms.howManyContain(words2, "sam");
        System.out.println(count8);
        int count9 = ArrayAlgorithms.howManyContain(words2, "sam i am");
        System.out.println(count9);

        System.out.println("\n --------------------------- \n");

        //stringToArray method testing
        String word = "Computer Science!";
        String[] letters = ArrayAlgorithms.stringToArray(word);
        for (int i = 0; i < letters.length; i++) {
            System.out.print(letters[i]);
        }
        System.out.println();
        String word2 = "* ** *** **** ***** ******";
        String[] letters2 = ArrayAlgorithms.stringToArray(word2);
        for (int i = 0; i < letters2.length; i++) {
            System.out.print(letters2[i]);
        }

        System.out.println("\n --------------------------- \n");

        //you get the point, every section a different method is tested
        String[] words3 = {"apple", "banana", "cabana", "diva", "elephant"};
        ArrayAlgorithms.reversePrint(words3);
        System.out.println();
        String[] words4 = {"123", "456", "789",};
        ArrayAlgorithms.reversePrint(words4);

        System.out.println("\n --------------------------- \n");

        int[] nums8 = {1, 2, 3, 4, 5, 6};
        int[] nums9 = {10, 11, 12, 13, 14, 15, 16, 17};
        int[] combined = ArrayAlgorithms.combine(nums8, nums9);
        for (int i = 0; i < combined.length; i++) {
            System.out.print(combined[i] + " ");
        }
        System.out.println();
        System.out.println("combined list has " + combined.length + " elements");

        int[] nums10 = {5, 8, 6, 2};
        int[] nums11 = {1, 7, 10, 0, 9};
        int[] combined2 = ArrayAlgorithms.combine(nums10, nums11);
        for (int i = 0; i < combined2.length; i++) {
            System.out.print(combined2[i] + " ");
        }
        System.out.println();
        System.out.println("combined list has " + combined2.length + " elements");

        System.out.println("\n --------------------------- \n");

        int[] grades1 = {34, 78, 91, 34, 76, 45};
        ArrayAlgorithms.bookEnd(grades1, 20);
        for (int i = 0; i < grades1.length; i++) {
            System.out.print(grades1[i]+ " ");
        }
        System.out.println();
        int[] grades2 = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        ArrayAlgorithms.bookEnd(grades2, 0);
        for (int i = 0; i < grades2.length; i++) {
            System.out.print(grades2[i]+ " ");
        }
        System.out.println();
        int[] grades3 = {50};
        ArrayAlgorithms.bookEnd(grades3, 100);
        for (int i = 0; i < grades3.length; i++) {
            System.out.print(grades3[i]+ " ");
        }

        System.out.println("\n --------------------------- \n");

        int[] nums12 = {5, 10, 15, 12, 2, 4};
        ArrayAlgorithms.multiplyBy(nums12, 6);
// original nums25 array IS modified
        for (int i = 0; i < nums12.length; i++) {
            System.out.print(nums12[i] + " ");
        }
        System.out.println();
        int[] nums13 = {-5, -7, 14, 0, 5, 20, -30};
        ArrayAlgorithms.multiplyBy(nums13, -12);
// original nums26 array IS modified
        for (int i = 0; i < nums13.length; i++) {
            System.out.print(nums13[i] + " ");
        }

        System.out.println("\n\n --------------------------- \n");

        int[] nums14 = {5, 10, 15, 12, 2, 4};
        int[] result = ArrayAlgorithms.multiplyByNoModify(nums14, 6);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
        // original array is NOT modified
        for (int i = 0; i < nums14.length; i++) {
            System.out.print(nums14[i] + " ");
        }

        System.out.println("\n --------------------------- \n");

        int[] nums15 = {5, 1, 3, 4, 7, 6};
        ArrayAlgorithms.shiftLeft(nums15);
// original nums25 array IS modified; all elements shifted left 1
        for (int i = 0; i < nums15.length; i++) {
            System.out.print(nums15[i] + " ");
        }
        System.out.println();
        int[] nums16 = {1, 2, 3, 4, 5, 6, 7, 8};
        ArrayAlgorithms.shiftLeft(nums16);
// original nums26 array IS modified; all elements shifted left 1
        for (int i = 0; i < nums16.length; i++) {
            System.out.print(nums16[i] + " ");
        }
        System.out.println();
// shift nums26 AGAIN:
        ArrayAlgorithms.shiftLeft(nums16);
        for (int i = 0; i < nums16.length; i++) {
            System.out.print(nums16[i] + " ");
        }
        System.out.println();
// shift nums26 A THIRD TIME:
        ArrayAlgorithms.shiftLeft(nums16);
        for (int i = 0; i < nums16.length; i++) {
            System.out.print(nums16[i] + " ");
        }

        System.out.println("\n --------------------------- \n");

        int[] nums17 = {6, 1, 3, 4, 7, 5};
        ArrayAlgorithms.shiftRight(nums17);
// original nums27 array IS modified; all elements shifted right 1
        for (int i = 0; i < nums17.length; i++) {
            System.out.print(nums17[i] + " ");
        }
        System.out.println();
        int[] nums18 = {1, 2, 3, 4, 5, 6, 7, 8};
        ArrayAlgorithms.shiftRight(nums18);
// original nums18 array IS modified; all elements shifted right 1
        for (int i = 0; i < nums18.length; i++) {
            System.out.print(nums18[i] + " ");
        }
        System.out.println();
// shift nums18 AGAIN:
        ArrayAlgorithms.shiftRight(nums18);
        for (int i = 0; i < nums18.length; i++) {
            System.out.print(nums18[i] + " ");
        }
        System.out.println();
// shift nums18 A THIRD TIME:
        ArrayAlgorithms.shiftRight(nums18);
        for (int i = 0; i < nums18.length; i++) {
            System.out.print(nums18[i] + " ");
        }

        System.out.println("\n --------------------------- \n");

        int[] even = {1, 2, 3, 4, 5, 6};
        ArrayAlgorithms.reverseStrat1(even);
        for (int i = 0; i < even.length; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println();
        int[] odd = {1, 2, 3, 4, 5, 6, 7};
        ArrayAlgorithms.reverseStrat1(odd);
        for (int i = 0; i < odd.length; i++) {
            System.out.print(odd[i] + " ");
        }
        System.out.println();
        int[] even2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        ArrayAlgorithms.reverseStrat1(even2);
        for (int i = 0; i < even2.length; i++) {
            System.out.print(even2[i] + " ");
        }
        System.out.println();
        int[] odd2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        ArrayAlgorithms.reverseStrat1(odd2);
        for (int i = 0; i < odd2.length; i++) {
            System.out.print(odd2[i] + " ");
        }

        System.out.println("\n --------------------------- \n");

        int[] even3 = {1, 2, 3, 4, 5, 6};
        ArrayAlgorithms.reverseStrat2(even3);
        for (int i = 0; i < even3.length; i++) {
            System.out.print(even3[i] + " ");
        }
        System.out.println();
        int[] odd3 = {1, 2, 3, 4, 5, 6, 7};
        ArrayAlgorithms.reverseStrat2(odd3);
        for (int i = 0; i < odd3.length; i++) {
            System.out.print(odd3[i] + " ");
        }
        System.out.println();
        int[] even4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        ArrayAlgorithms.reverseStrat2(even4);
        for (int i = 0; i < even4.length; i++) {
            System.out.print(even4[i] + " ");
        }
        System.out.println();
        int[] odd4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        ArrayAlgorithms.reverseStrat2(odd4);
        for (int i = 0; i < odd4.length; i++) {
            System.out.print(odd4[i] + " ");
        }

        System.out.println("\n --------------------------- \n");

        //warm up for traversing arrays 3
        String[] names = {"Mateo", "Sofia", "David", "Ziggy", "Charlie"};
        for (String name :  names)
        {
            System.out.println(name);
        }
        System.out.println();
        int[] nums19 = {8, 4, 10, 5, 7, 11, 3, 9, 23, 6};
        int sum = 0;
        for (int num : nums19)
        {
            sum += num;
        }
        System.out.println(sum);

        System.out.println("\n --------------------------- \n");

        Person p1 = new Person("Adam", 12);
        Person p2 = new Person("Barb", 15);
        Person p3 = new Person("Cathy", 14);
        Person p4 = new Person("Fred", 16);
        Person[] people = {p1, p2, p3, p4};
        for (Person p : people)
        {
            p.setName(p.getName().toUpperCase());
            p.introduce();
        }

        System.out.println("\n --------------------------- \n");

        String[] strings5 = {"HELLO", "Halo", "Adam", "what", "booyAH", "WHY?"};
        String[] lower = ArrayAlgorithms.makeLowercase(strings5);
        for (String str : lower) {
            System.out.print(str + " ");
        }
        System.out.println("\n\noriginal array not modified:");
        for (String str : strings5) {
            System.out.print(str + " ");
        }
        System.out.println();

        System.out.println("\n --------------------------- \n");

        String[] strings9 = {"HELlo", "Halo", "WHAT!", "Adam", "what", "booyAH", "WHY?", "for"};
        ArrayAlgorithms.makeUppercase(strings9);
        for (String str : strings9) {
            System.out.print(str + " ");
        }

        System.out.println("\n --------------------------- \n");

        int[] arr1 = {2, 5, 6, 1, 0, -6, 10};
        int[] arr2 = {1, 7, 6, -2, 8, -8, 8};
        int[] maximums = ArrayAlgorithms.arrayMaximums(arr1, arr2);

        for (int num : maximums) {
            System.out.print(num + " ");
        }
        System.out.println("\n\noriginal arrays not modified:");
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (int num : arr2) {
            System.out.print(num + " ");
        }

        System.out.println("\n --------------------------- \n");

        int[] nums20 = {4, 7, 7, 3, 2, 2, 4, 4, 4, 6, 4, 6, 6};
        int numDoubles = ArrayAlgorithms.countConsecutiveDoubles(nums20);
        System.out.println(numDoubles);
        int[] nums21 = {1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2};
        int numDoubles2 = ArrayAlgorithms.countConsecutiveDoubles(nums21);
        System.out.println(numDoubles2);
        int[] nums22 = {1, 2, 1, 3, 1, 2, 1, 3, 1, 2, 1, 3};
        int numDoubles3 = ArrayAlgorithms.countConsecutiveDoubles(nums22);
        System.out.println(numDoubles3);

        System.out.println("\n --------------------------- \n");

        int[] nums23 = {10, 20, 10, 30, 10, 20, 10, 30, 10, 20, 10, 30};
        int streak1 = ArrayAlgorithms.longestStreak(nums23);
        System.out.println(streak1);
        int[] nums24 = {10, 10, 20, 20, 20, 30, 30, 30, 30, 40, 40, 50};
        int streak2 = ArrayAlgorithms.longestStreak(nums24);
        System.out.println(streak2);
        int[] nums25 = {10, 10, 10, 10, 10, 10, 20, 20, 30, 30, 30, 30};
        int streak3 = ArrayAlgorithms.longestStreak(nums25);
        System.out.println(streak3);
        int[] nums26 = {20, 20, 30, 30, 30, 30, 10, 10, 10, 10, 10, 10};
        int streak4 = ArrayAlgorithms.longestStreak(nums26);
        System.out.println(streak4);
        int[] nums27 = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        int streak5 = ArrayAlgorithms.longestStreak(nums27);
        System.out.println(streak5);

    }
}
