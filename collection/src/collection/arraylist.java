package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;

public class arraylist {


	public void liste(){
	List<String> arraylst=new ArrayList<String>();
//add the element in array list
arraylst.add("apple");
arraylst.add("bannna");
arraylst.add("orange");
arraylst.add("orange");//it suits insertion and duplicate
System.out.println(arraylst);
//to insert 
System.out.println("index print:"+arraylst.indexOf("apple"));
//to remove
System.out.println(arraylst.remove(0));//removes the oth index
System.out.println(arraylst.add(null));//add null
System.out.println(arraylst.isEmpty());//checks the list is empty
System.out.println(arraylst.set(0,"gova"));//insert value in o index

List<String>another=new ArrayList<String>();//to copy the above arraylist values into another arraylist
another.addAll(arraylst);
System.out.println(another);

//iterate the string
//for each 
for(String stg:arraylst) {//for(datatype variable:arraylst that is method name)
	System.out.println("using for each loop:"+stg);
	
}
//for loop
for(int i=0;i<arraylst.size();i++) {
	System.out.println("for loop:"+arraylst.get(i));
}
//Listiterator
ListIterator<String>iterator = arraylst.listIterator();
while(iterator.hasNext()) {
	System.out.println(iterator.next());
}
System.out.println("--------------------------------------------------");
while(iterator.hasPrevious()) {
	System.out.println(iterator.previous());
}
System.out.println("--------------------------------------------------");
Iterator<String> iterator1=arraylst.iterator();
while(iterator.hasNext()) {
System.out.println(iterator.next());
}
	}



	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arraylist arrays=new arraylist();
		arrays.liste();
	}
}



