import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        int[] array = {3,2,5,1,8,9,6};

        int even=0;
        int odd=0;
        int[] Even = reverseList(array);
        int[] Odd = reverseList(array);
        for ( int i=0; i<array.length; i++)
        {
            if (array[i] % 2 == 0)
            {
                Even[even] = array[i];
                even++;
            }
            else
            {
                Odd[odd] = array[i];
                odd++;
            }
        }

        Even=Arrays.copyOfRange(Even,0,even);
        Odd=Arrays.copyOfRange(Odd,0,odd);

        Arrays.sort(Even);
        Arrays.sort(Odd);
        int[] eventReverse = reverseList(Even);
        int[] oddReverse = reverseList(Odd);
        int[] result = new int[eventReverse.length + oddReverse.length];
        System.arraycopy(eventReverse, 0, result, 0, eventReverse.length);
        System.arraycopy(oddReverse, 0, result, eventReverse.length, oddReverse.length);
        System.out.println(Arrays.toString(result));
    }

    public static int[] reverseList(int[] data){
        int[] result = Arrays.copyOfRange(data,0,data.length);
        for( int i = 0; i < result.length/2; ++i ) {
            int temp = result[i];
            result[i] = result[result.length - i - 1];
            result[result.length - i - 1] = temp;
        }
        return result;
    }
}