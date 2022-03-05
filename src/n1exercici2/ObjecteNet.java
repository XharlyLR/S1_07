package n1exercici2;

public class ObjecteNet extends ObjecteFill{

	@Override
	public void metodObj() {
		System.out.println("Objecte nét");
	}
	
	@Override
	public void metodObjF() {
		System.out.println("Mètode nét");
	}
	
	@Deprecated
	public void metodDeprecatNet() {
		System.out.println("Mètode deprecated nét");
	}
}
