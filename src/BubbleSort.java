public class BubbleSort {

    public static void main (String[] args){

        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = (int)(Math.random() * 100);
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        bubbleSort(arr);

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

    }

    public static void bubbleSort(int[] arr)
    {
        int flag = 0;

        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr.length - i - 1; j++)
            {
                if(arr[j] < arr[j + 1])
                {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    flag = 1;
                }
            }
            if(flag == 1)
            {
                flag = 0;
            }
            else
            {
                break;
            }
        }
    }
}
