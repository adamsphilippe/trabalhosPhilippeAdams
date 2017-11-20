//import java.util.Scanner;

public class AppTestes
{

	public static void main(String[] args)
	{
		Socio s1 = new Socio("Louro Jose", "Rua A", 32446787, 12345678, "66922909372", "11/11/2017");
		Socio s2 = new Socio("Toinha Cacimbão", "Rua B", 34728812, 87654321, "56712309342", "09/11/2017");
		Filme f1 = new Filme(1, "Star Wars", "2h 4m", 1977, "MKV", 5);
		Filme f2 = new Filme(2, "O Senhor dos Aneis", "2h 30m", 2001, "MKV", 3);
		f1.addAtores("Harrison Ford");
		f1.addAtores("Carrie Fisher");
		f1.addAtores("Mark Hamill");
		Locadora l1 = new Locadora();
		l1.cadastrarSocio(s1);
		l1.cadastrarSocio(s2);
		l1.cadastrarFilme(f1);
		l1.cadastrarFilme(f2);
		AlugarFilmes a1 = new AlugarFilmes(s1, f1);
		AlugarFilmes a2 = new AlugarFilmes(s2, f2);
		
		//l1.buscarSocio("669.229.093-72");
		//System.out.println(s1);
		
		l1. buscarFilme("Star Wars");
		System.out.println(f1);
		f1.mostrarAtores();
		
		//System.out.println(a1.listaAlugados());
		//a1.listaAlugados();
		
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		//Socio s1 = new Socio("", "", 0, 0, "", "");
		//Filme f1 = new Filme(0, "", "", 0, "", 0);
		//AlugarFilmes a1 = new AlugarFilmes(null, null);
		//a1.adicionaFilme(f);

		
		
	
		
		
		/*int opcao = 0;
		
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
					f1.setNumero(numero);
					
					System.out.print("Inserir título do filme: ");
	  				Scanner t = new Scanner(System.in);
	  				tituloFilme = t.nextLine();
					f1.setTituloFilme(tituloFilme);
	  				
	  				System.out.print("Duração: ");
	  				Scanner d = new Scanner(System.in);
	  				duracao = d.nextLine();
					f1.setDuracao(duracao);
	  				
	  				System.out.print("Ano de lançamento: ");
					Scanner a = new Scanner(System.in);
					anoLancamento = a.nextInt();
					f1.setAnoLancamento(anoLancamento);
					
					System.out.print("Formato de vídeo: ");
	  				Scanner f = new Scanner(System.in);
	  				formato = f.nextLine();
	  				f1.setFormato(formato);
	  				
	  				System.out.print("Quantidade de cópias: ");
					Scanner c = new Scanner(System.in);
					qtdCopias = c.nextInt();
					f1.setQtdCopias(qtdCopias);
					l1.cadastrarFilme(f1);
					System.out.print("\n"+ "\n");
					
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
					s1.setNome(nome);
					
					System.out.print("Inserir endereço: ");
					Scanner e = new Scanner(System.in);
					endereco = e.nextLine();
					s1.setEndereco(endereco);
					
					System.out.print("Inserir telefone: ");
					Scanner tel = new Scanner(System.in);
					telefone = tel.nextInt();
					s1.setTelefone(telefone);
					
					System.out.print("Inserir RG: ");
					Scanner r = new Scanner(System.in);
					rg = r.nextInt();
					s1.setRg(rg);
					
					System.out.print("Inserir CPF: ");
					Scanner cpfS = new Scanner(System.in);
					cpf = cpfS.nextLine();
					s1.setCpf(cpf);
					
					System.out.print("Inserir data de adesão: ");
					Scanner dat = new Scanner(System.in);
					dataAdesao = dat.nextLine();
					s1.setDataAdesao(dataAdesao);
					l1.cadastrarSocio(s1);
					System.out.print("\n"+ "\n");
					
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
			
		}while(opcao != 7);*/
		
	}

}
