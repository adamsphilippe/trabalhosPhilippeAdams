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
				System.out.print("\nSócio encontrado..." + "\n" + socio);
				return socio;
			}
		}
		System.out.println("\nSócio não cadastrado...\n" + "\n");
		return null;
	}
	
	public Socio pesquisaSocio(String nome)
	{
		for(Socio socio : listaSocios)
		{
			if(socio.getCpf().equals(nome))
			{
				System.out.print("\nSócio encontrado..." + "\n" + socio);
				return socio;
			}
		}
		System.out.println("\nSócio não cadastrado...\n"  + "\n");
		return null;
	}
	
	
	public void cadastrarFilme(Filme f)
	{
		listaFilmes.add(f);
	}
	
	public Filme buscarFilme(String tituloFilme)
	{
		for(Filme filme : listaFilmes)
		{
			if(filme.getTituloFilme().equals(tituloFilme))
			{
				System.out.print("\nFilme encontrado..." + "\n" + filme);
				System.out.println("\nCópias disponíveis: " + filme.getQtdCopias() + "\n");
				return filme;
			}
		}
		System.out.println("\nFilme não consta na lista...\n" + "\n");
		return null;
	}
}
