import java.util.ArrayList;

public class Filme extends Cadastro
{
	protected int numero;
	protected String tituloFilme;
	protected String duracao;
	protected int anoLancamento;
	protected String formato;
	protected int qtdCopias;
	
	ArrayList<String> atoresPrincipais = new ArrayList<>();

	public Filme(int numero, String tituloFilme, String duracao, int anoLancamento, String formato, int qtdCopias)
	{
		this.numero = numero;
		this.tituloFilme = tituloFilme;
		this.duracao = duracao;
		this.anoLancamento = anoLancamento;
		this.formato = formato;
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

	public String getDuracao()
	{
		return duracao;
	}

	public void setDuracao(String duracao)
	{
		this.duracao = duracao;
	}

	public int getAnoLancamento()
	{
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento)
	{
		this.anoLancamento = anoLancamento;
	}

	public String getFormato()
	{
		return formato;
	}

	public void setFormato(String formato)
	{
		this.formato = formato;
	}

	public int getQtdCopias()
	{
		return qtdCopias;
	}

	public void setQtdCopias(int qtdCopias)
	{
		this.qtdCopias = qtdCopias;
	}

	public void addAtores(String ator)
	{
		this.atoresPrincipais.add(ator);
	}
	
	
	
	public void mostrarAtores()
	{

		System.out.println(atoresPrincipais.toString());

	}
	
	public String toString()
	{
		return "\nNúmero: " + numero +
				"\nTítulo: " + tituloFilme +
				"\nDuração: " + duracao +
				"\nAno de lançamento: " + anoLancamento +
				"\nFormato: " + formato +
				"\nCópias: " + qtdCopias +
				"\nAtores principais:";
	}
}