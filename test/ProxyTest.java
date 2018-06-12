

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ProxyTest {
	ServicoForumGamificacaoProxy servicoForumGamificacaoProxy;
	

	@Before
	public void setUp() {
		servicoForumGamificacaoProxy = new ServicoForumGamificacaoProxy();
	}
	
	@Test
//	Chamar o método adicionarTopico() e ver se as conquistas foram adicionadas da forma correta
	public void adicionarTopicoTest() {
		servicoForumGamificacaoProxy.getServicoForumImpProxy().adicionarTopico(usuario, topico);
	}
	
	@Test
//	Chamar o método adicionarComentario() e ver se as conquistas foram adicionadas da forma correta
	public void adicionarComentarioTest() {
		servicoForumGamificacaoProxy.getServicoForumImpProxy().adicionarComentario(usuario, topico, comentario);;
	}
	
	@Test
//	Chamar o método darLikeTopico() e ver se as conquistas foram adicionadas da forma correta
	public void darLikeTopicoTest() {
		servicoForumGamificacaoProxy.getServicoForumImpProxy().darLikeTopico(usuario, topico, topicoUsuario);;
	}
	
	@Test
//	Chamar o método darLikeComentario() e ver se as conquistas foram adicionadas da forma correta
	public void darLikeComentarioTest() {
		servicoForumGamificacaoProxy.getServicoForumImpProxy().darLikeComentario(usuario, topico, comentario, comentarioUsuario);;
	}
	
	


//	Fazer um teste invocando vários métodos e verificar se o resultado é o esperado.
//	Fazer o mock lançar uma exceção para algum método e verificar se as Conquistas não foram adicionadas.
//	Atingir 100 pontos de "CRIAÇÃO" e verificar se o usuário recebe a insígnia "INVENTOR"
//	Atingir 100 pontos de "PARTICIPAÇÃO" e verificar se o usuário recebe a insígnia "MEMBRO DA COMUNIDADE"
}
