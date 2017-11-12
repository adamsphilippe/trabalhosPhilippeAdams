import java.util.ArrayList;

public class AlugarFilmes
{
	Socio socio;
	String sc;
	String filme;
	ArrayList<Filme> filmesAlugados = new ArrayList<>();
	
	int qtdCopiasAlugadas;
	
	public AlugarFilmes(Socio socio, Filme filme)
	{
		this.socio = socio;
		this.filmesAlugados.add(filme);
		qtdCopiasAlugadas ++;
	}
	
	public String getNome()
	{
		return this.socio.getNome();
	}
	
	public void setNome(String nome)
	{
		this.sc = nome;
	}
	
	public String getCpf()
	{
		return this.socio.getCpf();
	}
	
	public Socio getSocio()
	{
		return socio;
	}
	
	public void setSocio(Socio socio)
	{
		this.socio = socio;
	}
	
	public void setTituloFilme(String tituloFilme)
	{
		this.filme = tituloFilme;
	}
	
	public ArrayList<Filme> getFilme()
	{
		return this.filmesAlugados;
	}
	
	public void adicionaFilme(Filme filme)
	{
		if(qtdCopiasAlugadas != filme.qtdCopias)
		{
			this.filmesAlugados.add(filme);
		}
		else
		{
			System.out.println("\nFilme indisponível no momento!" + "\n" + "Tente alugar outro.\n"  + "\n");
		}
	}
	
	public void listaAlugados()
	{
		System.out.println("\n------ Filmes alugados ------");
		for(Filme filme : filmesAlugados)
		{
			if(filmesAlugados.equals(null))
			{
				System.out.print("\nNão consta nenhum filme alugado." + "\n");
			}
			else
			{
				System.out.print("\nTítulo: " + filme.getTituloFilme() + "\nAlugado por: " + socio.getNome() + "\n");
			}
		}
	}
}
