import java.util.*;
import java.util.HashMap;
import java.util.ArrayList;

public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static void swap(ArrayList<String> list, int index1, int index2){
		String temp = list.get(index1);
		list.set(index1, list.get(index2));
		list.set(index2, temp);

	}
	public static ArrayList<Double> createArrayList(double[] arr){
		ArrayList<Double> arrayList = new ArrayList<>();
		for (int i = 0; i < arr.length; i++){
			arrayList.add(arr[i]);
		}
		return arrayList;
	}
	public static HashMap<String, Integer> combineParallelArrays(String[] names, int[] ages){
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < names.length; i++){
			map.put(names[i],ages[i]);
		}
		return map;
	}
	public static void increaseAge(HashMap<String, Integer> map, String name){
		if (map.containsKey(name)){
			int currentAge = map.get(name);
			map.put(name, currentAge + 1);
		}
		else {
			System.out.println("Name not found in the map!");
		}
	}

}
