
public class Filme
{
	protected int numero;
	protected String tituloFilme;
	protected int qtdCopias;
	
	public Filme(int numero, String tituloFilme, int qtdCopias)
	{
		this.numero = numero;
		this.tituloFilme = tituloFilme;
		this.qtdCopias = qtdCopias;
	}

	public int getNumero()
	{
		return numero;
	}

	public void setNumero(int numero)
	{
		this.numero = numero;
	}

	public String getTituloFilme()
	{
		return tituloFilme;
	}

	public void setTituloFilme(String tituloFilme)
	{
		this.tituloFilme = tituloFilme;
	}

	public int getQtdCopias()
	{
		return qtdCopias;
	}

	public void setQtdCopias(int qtdCopias)
	{
		this.qtdCopias = qtdCopias;
	}
	
	
	
}
