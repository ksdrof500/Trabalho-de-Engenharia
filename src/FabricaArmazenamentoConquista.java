import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FabricaArmazenamentoConquista implements ArmazenamentoConquista {

	private static HashMap<String, List<Conquista>> armazenameConquistaUsuario = new HashMap<>();
	private static FabricaArmazenamentoConquista uniqueInstance = new FabricaArmazenamentoConquista();

	public static ArmazenamentoConquista getArmazenamentoConquista() {
		return uniqueInstance;
	}

	@Override
	public void addConquista(String usuario, Conquista conquista) {
		conquista.verificaTipoConquista(getConquista(usuario, conquista.nome));
	}

	@Override
	public List<Conquista> getConquistas(String usuario) {
		if (checkExist(usuario)) {
			return armazenameConquistaUsuario.get(usuario);
		}
		return new ArrayList<>();
	}

	@Override
	public Conquista getConquista(String usuario, String nomeConquista) {
		List<Conquista> conquistas = getConquistas(usuario);
			return conquistas.stream().filter(x -> x.nome.equals(nomeConquista)).findFirst().get();
	}

	private boolean checkExist(String usuario) {
		return armazenameConquistaUsuario.containsKey(usuario);
	}

}
