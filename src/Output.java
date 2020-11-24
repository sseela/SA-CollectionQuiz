import java.util.*; 
  
public class Output 
{ 
    public static void main(String[] args) 
    { 
        TreeSet<String> treeSet = new TreeSet<>(); 
  
        treeSet.add("F"); 
        treeSet.add("f"); 
        treeSet.add("Ge"); 
        treeSet.add("G"); 
        int val = 'a';
        int v = 'A';
        System.out.println(val+ " "+v);
        for (String temp : treeSet) 
            System.out.printf(temp + " "); 
  
        System.out.println("\n"); 
    } 
}



class newEmployee {
	private String name;
	public newEmployee(String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return 1;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean bool = false;
		if(this.name.equals(((newEmployee)obj).name)) {
			bool = true;
		}
		return bool;
	}
}

class EmployeeClass {
	public static void main(String[] args) {
		HashMap<newEmployee, String> hashmap = new HashMap<>();
		hashmap.put(new newEmployee("a"), "emp1");
		/*hashmap.put(new newEmployee("b"), "emp2");
		hashmap.put(new newEmployee("a"), "emp1 overridden");*/
		
		//System.out.println(hashmap.size());
		System.out.println(hashmap.get(new newEmployee("a")));
	}
}