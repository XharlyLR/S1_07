package n1exercici2;

public class ObjecteNet extends ObjecteFill{

	@Override
	public void metodObj() {
		System.out.println("Objecte n�t");
	}
	
	@Override
	public void metodObjF() {
		System.out.println("M�tode n�t");
	}
	
	@Deprecated
	public void metodDeprecatNet() {
		System.out.println("M�tode deprecated n�t");
	}
}
