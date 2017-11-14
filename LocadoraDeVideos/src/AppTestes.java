import java.util.Scanner;

public class AppTestes
{

	public static void main(String[] args)
	{
		//Socio s1 = new Socio("Louro Jose", "Rua A", 32446787, 12345678, "66922909372", "11/11/2017");
		//Socio s2 = new Socio("Toinha Cacimbão", "Rua B", 34728812, 87654321, "56712309342", "09/11/2017");
		Locadora l1 = new Locadora();
		Socio s1 = new Socio("", "", 0, 0, "", "");
		Socio s2 = new Socio("", "", 0, 0, "", "");
		Socio s3 = new Socio("", "", 0, 0, "", "");
		Socio s4 = new Socio("", "", 0, 0, "", "");
		Socio s5 = new Socio("", "", 0, 0, "", "");
		
		l1.cadastrarSocio(s1);
		l1.cadastrarSocio(s2);
		//l1.buscarSocio("669.229.093-72");
		//System.out.println(s1);
		
		//Filme f1 = new Filme(1, "Star Wars", "2h 4m", 1977, "MKV", 5);
		Filme f1 = new Filme(0, "", "", 0, "", 0);
		Filme f2 = new Filme(0, "", "", 0, "", 0);
		Filme f3 = new Filme(0, "", "", 0, "", 0);
		Filme f4 = new Filme(0, "", "", 0, "", 0);
		Filme f5 = new Filme(0, "", "", 0, "", 0);
		//Filme f2 = new Filme(2, "O Senhor dos Aneis", "2h 30m", 2001, "MKV", 3);
		//l1.cadastrarFilme(f1);
		//l1.cadastrarFilme(f2);
		//l1. buscarFilme("Star Wars");
		//System.out.println(f1);
		
		AlugarFilmes a1 = new AlugarFilmes(s1, f1);
		//AlugarFilmes a1 = new AlugarFilmes(null, null);
		AlugarFilmes a2 = new AlugarFilmes(s2, f2);
		a1.adicionaFilme(f2);
		a2.adicionaFilme(f1);
		//System.out.println(a1.listaAlugados());
		//a1.listaAlugados();
		
		
		int opcao = 0;
		
		do
		{
			System.out.println("------ Locadora de Filmes ------");
			System.out.println("1- Cadastrar filme");
			System.out.println("2- Cadastrar socio");
			System.out.println("3- Alugar filme");
			System.out.println("4- Pesquisar filme");
			System.out.println("5- Pesquisar socio");
			System.out.println("6- Pesquisar filmes alugados");
			System.out.println("7- Fechar programa");
			System.out.print("\nDigite aqui sua opção: ");
			Scanner opc = new Scanner(System.in);
     		opcao = opc.nextInt();

			
			switch(opcao)
			{
				case 1:

					int numero;
					String tituloFilme;
					String duracao;
					int anoLancamento;
					String formato;
					int qtdCopias;
					
					System.out.println("\n----- Cadastrar Filmes -----\n");
					System.out.print("Inserir número do filme: ");
					Scanner num = new Scanner(System.in);
					numero = num.nextInt();
					int cont = 0;
					if(cont == 0)
					{
						f1.setNumero(numero);
						cont++;
					}
					else if(cont == 1)
					{
						f2.setNumero(numero);
						cont++;
					}
					else if(cont == 2)
					{
						f3.setNumero(numero);
						cont++;
					}
					else if(cont == 3)
					{
						f4.setNumero(numero);
						cont++;
					}
					else if(cont == 4)
					{
						f5.setNumero(numero);
						cont++;
					}
					
					System.out.print("Inserir título do filme: ");
	  				Scanner t = new Scanner(System.in);
	  				tituloFilme = t.nextLine();
	  				int cont2 = 0;
	  				if(cont2 == 0)
					{
						f1.setTituloFilme(tituloFilme);
						cont2++;
					}
					else if(cont2 == 1)
					{
						f2.setTituloFilme(tituloFilme);
						cont2++;
					}
					else if(cont2 == 2)
					{
						f3.setTituloFilme(tituloFilme);
						cont2++;
					}
					else if(cont2 == 3)
					{
						f4.setTituloFilme(tituloFilme);
						cont2++;
					}
					else if(cont2 == 4)
					{
						f5.setTituloFilme(tituloFilme);
						cont2++;
					}
	  				
	  				System.out.print("Duração: ");
	  				Scanner d = new Scanner(System.in);
	  				duracao = d.nextLine();
	  				int cont3 = 0;
	  				if(cont3 == 0)
					{
						f1.setDuracao(duracao);
						cont3++;
					}
					else if(cont3 == 1)
					{
						f2.setDuracao(duracao);
						cont3++;
					}
					else if(cont3 == 2)
					{
						f3.setDuracao(duracao);
						cont3++;
					}
					else if(cont3 == 3)
					{
						f4.setDuracao(duracao);
						cont3++;
					}
					else if(cont3 == 4)
					{
						f5.setDuracao(duracao);
						cont3++;
					}
	  				
	  				System.out.print("Ano de lançamento: ");
					Scanner a = new Scanner(System.in);
					anoLancamento = a.nextInt();
					int cont4 = 0;
					if(cont4 == 0)
					{
						f1.setAnoLancamento(anoLancamento);
						cont4++;
					}
					else if(cont4 == 1)
					{
						f2.setAnoLancamento(anoLancamento);
						cont4++;
					}
					else if(cont4 == 2)
					{
						f3.setAnoLancamento(anoLancamento);
						cont4++;
					}
					else if(cont4 == 3)
					{
						f4.setAnoLancamento(anoLancamento);
						cont4++;
					}
					else if(cont4 == 4)
					{
						f5.setAnoLancamento(anoLancamento);
						cont4++;
					}
					
					System.out.print("Formato de vídeo: ");
	  				Scanner f = new Scanner(System.in);
	  				formato = f.nextLine();
	  				int cont5 = 0;
	  				if(cont5 == 0)
					{
						f1.setFormato(formato);
						cont5++;
					}
					else if(cont5 == 1)
					{
						f2.setFormato(formato);
						cont5++;
					}
					else if(cont == 2)
					{
						f3.setFormato(formato);
						cont5++;
					}
					else if(cont5 == 3)
					{
						f4.setFormato(formato);
						cont5++;
					}
					else if(cont5 == 4)
					{
						f5.setFormato(formato);
						cont5++;
					}
	  				
	  				System.out.print("Quantidade de cópias: ");
					Scanner c = new Scanner(System.in);
					qtdCopias = c.nextInt();
					int cont6 = 0;
					if(cont6 == 0)
					{
						f1.setQtdCopias(qtdCopias);
						cont6++;
						
						l1.cadastrarFilme(f1);
						System.out.print("\n"+ "\n");
					}
					else if(cont6 == 1)
					{
						f2.setQtdCopias(qtdCopias);
						cont6++;
						
						l1.cadastrarFilme(f2);
						System.out.print("\n"+ "\n");
					}
					else if(cont6 == 2)
					{
						f3.setQtdCopias(qtdCopias);
						cont6++;
						
						l1.cadastrarFilme(f3);
						System.out.print("\n"+ "\n");
					}
					else if(cont6 == 3)
					{
						f4.setQtdCopias(qtdCopias);
						cont6++;
						
						l1.cadastrarFilme(f4);
						System.out.print("\n"+ "\n");
					}
					else if(cont6 == 4)
					{
						f5.setQtdCopias(qtdCopias);
						cont6++;
						
						l1.cadastrarFilme(f5);
						System.out.print("\n"+ "\n");
					}
					
				break;
				
				case 2:
					
					String nome;
					String endereco;
					int telefone;
					int rg;
					String cpf;
					String dataAdesao;
					
					System.out.println("\n----- Cadastrar Sócio -----\n");
					System.out.print("Inserir nome: ");
					Scanner n = new Scanner(System.in);
					nome = n.nextLine();
					int cont7 = 0;
					if(cont7 == 0)
					{
						s1.setNome(nome);
						cont7++;
					}
					else if(cont7 == 1)
					{
						s2.setNome(nome);
						cont7++;
					}
					else if(cont7 == 2)
					{
						s3.setNome(nome);
						cont7++;
					}
					else if(cont7 == 3)
					{
						s4.setNome(nome);
						cont7++;
					}
					else if(cont7 == 4)
					{
						s5.setNome(nome);
						cont7++;
					}
					
					System.out.print("Inserir endereço: ");
					Scanner e = new Scanner(System.in);
					endereco = e.nextLine();
					int cont8 = 0;
					if(cont8 == 0)
					{
						s1.setEndereco(endereco);
						cont8++;
					}
					else if(cont8 == 1)
					{
						s2.setEndereco(endereco);
						cont8++;
					}
					else if(cont8 == 2)
					{
						s3.setEndereco(endereco);
						cont8++;
					}
					else if(cont8 == 3)
					{
						s4.setEndereco(endereco);
						cont8++;
					}
					else if(cont8 == 4)
					{
						s5.setEndereco(endereco);
						cont8++;
					}
					
					System.out.print("Inserir telefone: ");
					Scanner tel = new Scanner(System.in);
					telefone = tel.nextInt();
					s1.setTelefone(telefone);
					int cont9 = 0;
					if(cont9 == 0)
					{
						s1.setTelefone(telefone);
						cont9++;
					}
					else if(cont9 == 1)
					{
						s2.setTelefone(telefone);
						cont9++;
					}
					else if(cont9 == 2)
					{
						s3.setTelefone(telefone);
						cont9++;
					}
					else if(cont9 == 3)
					{
						s4.setTelefone(telefone);
						cont9++;
					}
					else if(cont9 == 4)
					{
						s5.setTelefone(telefone);
						cont9++;
					}
					
					System.out.print("Inserir RG: ");
					Scanner r = new Scanner(System.in);
					rg = r.nextInt();
					int cont10 = 0;
					if(cont10 == 0)
					{
						s1.setRg(rg);
						cont10++;
					}
					else if(cont10 == 1)
					{
						s2.setRg(rg);
						cont10++;
					}
					else if(cont10 == 2)
					{
						s3.setRg(rg);
						cont10++;
					}
					else if(cont10 == 3)
					{
						s4.setRg(rg);;
						cont10++;
					}
					else if(cont10 == 4)
					{
						s5.setRg(rg);
						cont10++;
					}
					
					System.out.print("Inserir CPF: ");
					Scanner cpfS = new Scanner(System.in);
					cpf = cpfS.nextLine();
					int cont11 = 0;
					if(cont11 == 0)
					{
						s1.setCpf(cpf);
						cont11++;
					}
					else if(cont11 == 1)
					{
						s2.setCpf(cpf);
						cont11++;
					}
					else if(cont11 == 2)
					{
						s3.setCpf(cpf);
						cont11++;
					}
					else if(cont11 == 3)
					{
						s4.setCpf(cpf);
						cont11++;
					}
					else if(cont11 == 4)
					{
						s5.setCpf(cpf);
						cont11++;
					}
					
					System.out.print("Inserir data de adesão: ");
					Scanner dat = new Scanner(System.in);
					dataAdesao = dat.nextLine();
					int cont12 = 0;
					if(cont12 == 0)
					{
						s1.setDataAdesao(dataAdesao);
						cont12++;
						
						l1.cadastrarSocio(s1);
						System.out.print("\n"+ "\n");
					}
					else if(cont12 == 1)
					{
						s2.setDataAdesao(dataAdesao);
						cont12++;
						
						l1.cadastrarSocio(s2);
						System.out.print("\n"+ "\n");
					}
					else if(cont12 == 2)
					{
						s3.setDataAdesao(dataAdesao);
						cont12++;
						
						l1.cadastrarSocio(s3);
						System.out.print("\n"+ "\n");
					}
					else if(cont12 == 3)
					{
						s4.setDataAdesao(dataAdesao);
						cont12++;
						
						l1.cadastrarSocio(s4);
						System.out.print("\n"+ "\n");
					}
					else if(cont12 == 4)
					{
						s5.setDataAdesao(dataAdesao);
						cont12++;
						
						l1.cadastrarSocio(s5);
						System.out.print("\n"+ "\n");
					}
					
				break;
				
				case 3:
					
					String nomeSocio;
					String tituloF = null;
					
					System.out.println("\n----- Alugar Filme -----\n");
					System.out.print("Incluir sócio: ");
					Scanner socioS = new Scanner(System.in);
					nomeSocio = socioS.nextLine();
					l1.pesquisaSocio(nomeSocio);
					a1.setNome(nomeSocio);
					
					System.out.print("Adicionar filme: ");
					Scanner filmeS = new Scanner(System.in);
					nomeSocio = filmeS.nextLine();
					l1.buscarFilme(tituloF);
					a1.setTituloFilme(tituloF);
					System.out.print("Pedido concluído com sucesso!");
				break;
				
				case 4:
					System.out.println("\n----- Pesquisar Filme -----\n");
					System.out.print("Digite o filme desejado: ");
	  				Scanner pFilme = new Scanner(System.in);
	  				tituloFilme = pFilme.nextLine();
	  				l1.buscarFilme(tituloFilme);
					
				break;
				
				case 5:
					System.out.println("\n----- Pesquisar Sócio -----\n");
					System.out.print("Digite o CPF do sócio: ");
	  				Scanner pSocio = new Scanner(System.in);
	  				cpf = pSocio.nextLine();
	  				l1.buscarFilme(cpf);
					
				break;
				
				case 6:
					System.out.println("\n----- Filmes Alugados -----\n");
					a1.listaAlugados();
					
				break;
				
				case 7:
					System.out.println("\nFim do programa!");
					System.out.println("\nObrigado e até mais!" + "\n:)");
				break;

				default:
					System.out.println(" ");
					System.out.println("Opção invalida!" + "\nTente novamente!" + "\n:(\n" + "\n");
				
			}
			
		}while(opcao != 7);
		
	}

}
