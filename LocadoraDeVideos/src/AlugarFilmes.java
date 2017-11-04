import java.util.ArrayList;

public class AlugarFilmes
{
	Socio socio;
	ArrayList<Filme> filmesAlugados = new ArrayList<>();
	
	public AlugarFilmes(Socio socio, Filme tituloFilme)
	{
		this.socio = socio;
		this.filmesAlugados.add(tituloFilme);
	}
	
	public String getNome()
	{
		return this.socio.getNome();
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
	
	public ArrayList<Filme> getFilme()
	{
		return this.filmesAlugados;
	}
	
	public void adicionaFilme(Filme filme)
	{
		this.filmesAlugados.add(filme);
	}
	
	public void listaFilmes()
	{
		for(Filme filme : filmesAlugados)
		{
			System.out.println(filme);
		}
	}
}
