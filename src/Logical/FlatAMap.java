package Logical;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlatAMap {

	public static void main(String[]args) 
	{
//	    List<String> str=List.of("Manu","Tanu","anu");
//	    List<String> str1=List.of("Janu","bittu","tiku");
//	 	
//	     List<String> ref=new ArrayList();
//	     ref.addAll(str);
//	     ref.addAll(str1);
//	     
//	     System.out.println(ref);
	     
		
		List<Integer> l=List.of(1,2,3,4);
		List<Integer> l1=List.of(5,6,7,8);
		
		List<List<Integer>> ref= List.of(l,l1);
		System.out.println("Before");
		List<Integer> collect = ref.stream().flatMap(map ->map.stream()).collect(Collectors.toList());
		
		System.out.println("After "+collect);
		
		
	}
	
	
}
