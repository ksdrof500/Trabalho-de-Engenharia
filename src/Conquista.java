

public abstract class Conquista {

	protected String nome;
	
	public void verificaTipoConquista(Conquista conquista) {
		if(conquista.getClass().isInstance(Pontos.class)) {
			new Pontos().increment();
		} else {
			new Insignia();
		}
	}

}
