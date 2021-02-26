import java.util.*;

class No_of_counts
{
    public static void findElementCount()
    {
        int num, ele, no = 0, i = 0;
        Scanner inp = new Scanner(System.in);
        num = inp.nextInt();
        if(num<0)
            {
                System.out.println("Invalid input");
                System.exit(0);
            }
        int arr[] = new int[num];
        for(i = 0; i < num; i++)
        {
            arr[i] = inp.nextInt();
            if(arr[i]<0)
            {
                System.out.println("Invalid input");
                System.exit(0);
            }
        }
        ele = inp.nextInt();
        for(i = 0; i < num; i++)
        {
            if(arr[i] == ele)
            {
                no++;
            }
        }
        System.out.println(no);
    }
    public static void main(String[] args)
    {
        findElementCount();
    }
}
