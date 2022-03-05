package n1exercici2;

public class ObjecteFill extends ObjectePare{
	
	@Override
	public void metodObj() {
		System.out.println("Objecte fill");
	}
	
	public void metodObjF() {
		System.out.println("Mètode fill");
	}
	
	@Deprecated
	public void metodDeprecat() {
		System.out.println("Mètode deprecated");
	}
}
