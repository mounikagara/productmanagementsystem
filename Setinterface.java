package Collections;

import java.util.*;
public class Setinterface {
public static void main (String[] args) {
	Set<String> s =new HashSet();
	s.add("Mouni");
	s.add("vijay");
	s.add("Mouni");
	s.add("rani");
	System.out.println(s);
	Set <String> s1 = new LinkedHashSet();
	s1.add(null);
	s1.add("Mouni");
	s1.add("vijay");
	s1.add("Mouni");
	s1.add("rani");
	System.out.println(s1);
	
	
}
}
