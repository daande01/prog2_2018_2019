/**
 * 
 */
package kortspel;


 
public class Kort  {

	private int f�rg;
	private int val�r;	

	
	private final String f[] = { "hj�rter", "kl�ver","spader","ruter"};
	
	private final String v[]={"ess","tv�","tre","fyra","fem","sex","sju","�tta","nio","tio","kneckt","dam","kung","ess"};
	
	public Kort(int f,int v){
		
		f�rg =f;
		val�r=v;
		
		
	}
	
	@Override
	public String toString(){
		
		
		return f[f�rg]+""+v[val�r];
		
			}
	
	

	
	
	
}



