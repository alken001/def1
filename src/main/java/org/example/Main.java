// given sequence of the numbers you have to found accurance of specific number
public class RecursiveOccurence {
    public static void main(String[] args) {


        int[] sequence = {1, 2, 3, 4, 5, 2, 6, 8};
        int target = 2;
        int occurrences=findOccurrences(sequence,target,index:0 );
        System.out.println("The number " + target + " occurs " + occurrences + " times in the given sequence.");
    }
}

public static int findOccurrences(int[] sequence, int target,int index ) {
    int[] array={1,2,3,5,1,23,4}

    if (int index=sequence.length)
    {

    }
}
















































public class RecursiveOccurrence {
    public static void main(String[] args) {
        int[] sequence = {1, 2, 3, 4, 2, 5, 2, 6, 7};
        int target = 2;
        int occurrences = findOccurrences(sequence, target, 0);
        System.out.println("The number " + target + " occurs " + occurrences + " times in the given sequence.");
    }

    public static int findOccurrences(int[] sequence, int target, int index) {
        if (index == sequence.length) {
            return 0;
        }

        if (sequence[index] == target) {
            return 1 + findOccurrences(sequence, target, index + 1);
        } else {
            return findOccurrences(sequence, target, index + 1);
        }
    }
}

public void main() {
}