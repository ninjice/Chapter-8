package Lab2;

// ****************************************************************
//    IntegerListSTest.java
//
//    Provide a menu-driven tester for the IntegerList class.
//    (Version S - for use in the linear search lab exercise).
//          
// ****************************************************************

public class IntegerListBTest
{
    public static void Main(String[] Args)
    {
        int[] intList = {1, 3, 27, 41, 53, 69, 73, 84, 96, 100};
        IntegerListB b = new IntegerListB(intList);
        
        b.binarySearchR(intList[0], intList[intList.length() - 1])
    }
}