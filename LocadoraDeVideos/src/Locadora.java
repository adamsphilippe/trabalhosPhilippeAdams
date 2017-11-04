import java.util.ArrayList;

public class Locadora
{
	
	ArrayList<Socio> listaSocios = new ArrayList<>();
	ArrayList<Filme> listaFilmes = new ArrayList<>();
	
	public void cadastrarSocio(Socio s)
	{
		listaSocios.add(s);
	}
	
	public Socio buscarSocio(String cpf)
	{
		for(Socio socio : listaSocios)
		{
			if(socio.getCpf().equals(cpf))
			{
				System.out.println("Sócio " + socio + " encontrado!");
				return socio;
			}
		}
		System.out.println("Sócio não cadastrado...");
		return null;
	}
	
	/*public void atualizarNomeSocio(Socio s, String nome)
	{
		s.setNome(nome);
	}
	
	public void atualizarEnderecoSocio(Socio s, String endereco)
	{
		s.setEndereco(endereco);
	}
	
	
	public void cadastrarFilme(Filme f)
	{
		listaFilmes.add(f);
	}*/
	
	public Filme buscarFilme(String tituloFilme)
	{
		for(Filme filme : listaFilmes)
		{
			if(filme.getTituloFilme().equals(tituloFilme))
			{
				System.out.println("Filme " + filme + " encontrado!");
				System.out.println("Cópias disponíveis: " + filme.getQtdCopias());
				return filme;
			}
		}
		System.out.println("Filme não consta na lista...");
		return null;
	}
}
