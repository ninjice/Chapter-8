package Lab2;

public class IntegerListB
{
    private int[] list;
    public IntegerListB(int[] l)
    {
        this.list = l;
        
    }

    private int binarySearchR (int target, int lo, int hi)
    {
        int index;
        if (hi < lo)    //fill in the "not found" condition
            index = -1;
        else
            {
                int mid = (lo + hi)/2;
                if (mid == target)  //found it!
                    index = mid;
                else if (target < list[mid])
                //fill in the recursive call to search the first half
                //of the list
                    index = binarySearchR(target, lo, mid - 1);
                else
                    //search the last half of the list
                    index = binarySearchR(target, mid + 1, hi);
            }
        return index;
    }
    }
