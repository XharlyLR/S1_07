package n1exercici2;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		ObjectePare objP = new ObjectePare();
		ObjecteFill objF = new ObjecteFill();
		ObjecteNet objN = new ObjecteNet();
		
		objP.metodObj();
		objF.metodObj();
		objN.metodObj();
		
		objF.metodObjF();
		objN.metodObjF();
		
		ObjectePare objPF = new ObjecteFill();
		ObjectePare objPN = new ObjecteNet();
		
		objPF.metodObj();
		objPN.metodObj();
		
//		objPF.metodObjF();
		
		objF.metodDeprecat();
		objN.metodDeprecat();
		objN.metodDeprecatNet();
	}

}
