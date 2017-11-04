
public class Socio
{
	protected String nome;
	protected String endereco;
	protected int telefone;
	protected long rg;
	protected String cpf;
	protected String dataAdesao;
	
	public Socio(String nome, String endereco, int telefone, long rg, String cpf, String dataAdesao)
	{
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.rg = rg;
		this.cpf = cpf;
		this.dataAdesao = dataAdesao;
	}

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getEndereco()
	{
		return endereco;
	}

	public void setEndereco(String endereco)
	{
		this.endereco = endereco;
	}

	public int getTelefone()
	{
		return telefone;
	}

	public void setTelefone(int telefone)
	{
		this.telefone = telefone;
	}

	public long getRg()
	{
		return rg;
	}

	public void setRg(long rg)
	{
		this.rg = rg;
	}

	public String getCpf()
	{
		return cpf;
	}

	public void setCpf(String cpf)
	{
		this.cpf = cpf;
	}

	public String getDataAdesao()
	{
		return dataAdesao;
	}

	public void setDataAdesao(String dataAdesao)
	{
		this.dataAdesao = dataAdesao;
	}
	
	
	
	
}
