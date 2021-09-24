package week3.day2.Assignments;
import java.util.List;
import java.util.ArrayList;

public class RemoveDuplicateWordsinList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "We learn java basics as part of java sessions in java week1";
		String[] strArr = str.split(" ");
		List<String> strList = new ArrayList<String>();
		for (int i=0;i<strArr.length;i++)
		{
			strList.add(strArr[i]);
		}
		
		System.out.println("Print original list....");
		System.out.println(strList);
		
		List<String> removedupList = new ArrayList<String>();
		strList.removeAll(removedupList);
		System.out.println("Print list after removing duplicated....");
		System.out.println(removedupList);
		

	}

}
