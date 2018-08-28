/**
 * 
 */
package kortspel;


 
public class Kort  {

	private int färg;
	private int valör;	

	
	private final String f[] = { "hjärter", "klöver","spader","ruter"};
	
	private final String v[]={"ess","två","tre","fyra","fem","sex","sju","åtta","nio","tio","kneckt","dam","kung","ess"};
	
	public Kort(int f,int v){
		
		färg =f;
		valör=v;
		
		
	}
	
	@Override
	public String toString(){
		
		
		return f[färg]+""+v[valör];
		
			}
	
	

	
	
	
}



