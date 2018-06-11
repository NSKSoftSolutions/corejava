package com.main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Client3 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Object> m = new HashMap<String, Object>();
		m.put("firstname", "Sajjad");
		m.put("middlename", "Alikhan");
		m.put("lastname", "Navab");

		HashMap<String, Object> m2 = new HashMap<String, Object>();
		m2.put("fname", "Sajjad");
		m2.put("mname", "Alikhan");
		m2.put("lname", "Navab");

		HashMap<String, HashMap<String, Object>> hmap = new HashMap<String, HashMap<String, Object>>();
		hmap.put("m", m);
		hmap.put("m2", m2);
		Set s1 = hmap.entrySet();
		Iterator itr = s1.iterator();
		while (itr.hasNext()) {
			Object obj = itr.next();
			Map.Entry<String, HashMap<String, Object>> me = (Map.Entry<String, HashMap<String, Object>>) obj;
			Object kobj = me.getKey();
			HashMap<String, Object> hm = hmap.get(kobj);
			Set s2 = hm.entrySet();
			Iterator itr1 = s2.iterator();
			while (itr1.hasNext()) {
				Object obj1 = itr1.next();
				Map.Entry<String, Object> m1 = (Map.Entry<String, Object>) obj1;
				Object kvobj = m1.getKey();
				Object vobj = m1.getValue();
				System.out.println(kvobj + " " + vobj);
			}

		}

	}

}
