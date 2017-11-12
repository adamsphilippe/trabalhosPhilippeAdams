
public class Socio extends Cadastro
{
	protected String nome;
	protected String endereco;
	protected int telefone;
	protected int rg;
	protected String cpf;
	protected String dataAdesao;
	
	public Socio(String nome, String endereco, int telefone, int rg, String cpf, String dataAdesao)
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

	public int getRg()
	{
		return rg;
	}

	public void setRg(int rg)
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
	
	public String toString()
	{
		return "\nNome: " + nome +
				"\nEndereço: " + endereco +
				"\nTelefone: " + telefone +
				"\nRG: " + rg +
				"\nCPF: " + cpf +
				"\nData de adesão: " + dataAdesao;
	}
	
	
	
	
}
