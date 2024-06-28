package collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;



public class linkedlist {
	public void iterate() {
		LinkedList<String>link=new LinkedList<String>();
		link.add("ani");
		link.add("abi");
		link.add("sunitha");
		
		
		//advanced for loop
		for(String str2:link) {
			System.out.println(link);
			}
		//normal for loop
		for(int i=0;i<link.size();i++) {
			System.out.println(link);
			
		}}
		
		
		
		public void iterate1() {
			LinkedList <Integer> iterateretrv=new LinkedList<Integer>();
			iterateretrv.add(9);
			iterateretrv.add(10);
		Iterator<Integer> iterator1=iterateretrv.iterator();//SYNTAX: Iterator<String> variable=object.variable();
			while(iterator1.hasNext()) {
				System.out.println(iterator1.next());
		}
		}

	public void linked(){
		LinkedList<Integer>linklst=new LinkedList<Integer>();
		linklst.add(1);
		linklst.add(1);
		linklst.add(2);
		linklst.add(3);
		System.out.println(linklst);
		linklst.removeFirstOccurrence(1);
		linklst.removeLastOccurrence(6);
		System.out.println(linklst);
		System.out.println("add linklst:"+linklst);
		//linklst.removeFirstOccurrence(1);
		
		//methods in linked list
		
		linklst.addFirst(0);
		linklst.addLast(4);
		System.out.println("add first,last:"+linklst);
		System.out.println("get list:"+linklst.get(0));
		System.out.println("getfirst:"+linklst.getFirst());
		System.out.println("getlast:"+linklst.getLast());
		System.out.println("remove1rst:"+linklst.removeFirst());
		System.out.println("remove last:"+linklst.removeLast());
		System.out.println("poll:"+linklst.poll());
	}
		

		
		
		
		
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linkedlist example=new linkedlist();
		example.linked();
		example.iterate();
	 example.iterate1();

	}

}
