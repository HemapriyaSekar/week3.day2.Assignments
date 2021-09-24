package week3.day2.Assignments;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArr = {3,2,11,4,6,7};
		int[] intArr1 = {1,2,8,4,9,7};
		
		List<Integer> intList = new ArrayList<Integer>();
		List<Integer> intList1 = new ArrayList<Integer>();
		for (int i=0;i<intArr.length;i++)
		{
			intList.add(intArr[i]);
		}
		for (int i=0;i<intArr1.length;i++)
		{
			intList1.add(intArr1[i]);
		}
		
		
		System.out.println("Print original list....");
		System.out.println(intList);
		System.out.println(intList1);
		
		intList.retainAll(intList1);
		System.out.println("Print list after intersection....");
		System.out.println(intList);

	}

}
