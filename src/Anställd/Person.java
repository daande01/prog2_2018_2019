/**
 * 
 */
package Anst�lld;


public class Person {

	
	private int �lder ;
	private String namn ;
	private String adress;
	
	
	 public Person(int �, String n, String a){
		
		 this.�lder=�;
		 this.namn=n;
		 this.adress=a;
		
	//	 System.out.println(�lder+" "+namn+" "+adress);
		 
	}
	
	 public Person ( int �, String a){
		 
		 this(�,"null",a);
		 
	 }
	 
public Person (){
		 
		 this(0,"null");
		 
	 }
	 


	public String getName(){
		
		
		return namn;
		
	}
	
	public void bytNamn(String n){
		
		this.namn=n;
		
	}
	 
	
	
	 
	 public static void main(String[] args) {
	
	
		 Person p1=new Person();
		 Person p2=new Person(0,"berg");
		 Person p3=new Person(12,"daniel","berg");
		 Person p4=new Person(13,"fdgganiel","dfdfberg");
	
	 
		 	p3.bytNamn("evert");
		 
		     System.out.print(p3.getName());
	 }
	 
	 
}
