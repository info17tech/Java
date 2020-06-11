import java.util.*;
class CustomizedTreeSetDemo
{
	public static void main(String[] args) {
		TreeSet t= new TreeSet(new MyComparator());
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		t.add(20);
		System.out.println(t);
	}
}

/* class MyComparator implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;
		if(i1<i2)
			return +1;
		else if (i1>i2)
			return -1;
		else
			return 0;
	}
}*/

class MyComparator implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;
		//return i1.compareTo(i2); //Default Natural Sorting Order(Ascending)
		//return -i1.compareTo(i2); //Customized Sorting Order(Descending)
		//return i2.compareTo(i1); //Descending order
		//return -i2.compareTo(i1); //Ascending order
		//return +1; //Insertion order
		//return -1; //Reverse of insertion order
		return 0; //only first element will be inserted and the remaining elements will be treated as duplicates
	}
}