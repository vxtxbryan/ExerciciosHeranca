package br.com.generation.exercicios;

public class Animal {
	
	public static void main (String [] args)  {
		
		
			
			Cachorro cachorro = new Cachorro();
			Cavalo cavalo = new Cavalo();
			Preguiça preguica = new Preguiça();
			
			System.out.println("Animal: Cachorro  ");
			cachorro.setNome("Meg");
			cachorro.setIdade("2 anos");
			cachorro.setDeveEmitirSom("Latido");
			cachorro.setDeveCorrer("Corre");
			
			System.out.println("Nome: " + cachorro.getNome());
			System.out.println("Idade: " + cachorro.getIdade());
			System.out.println("Emite qual  Som?  " + cachorro.getDeveEmitirSom());
			System.out.println("Deve correr: " + cachorro.getDeveCorrer());
			
			System.out.println();
			
			System.out.println("Animal: Cavalo ");
			cavalo.setNome("Trovão");
			cavalo.setIdade("10 anos");
			cavalo.setDeveEmitirSom("relinchar");
			cavalo.setDeveCorrer("corre");
			
			System.out.println("Nome: " + cavalo.getNome());
			System.out.println("Idade: " + cavalo.getIdade());
			System.out.println("Emite qual  Som?  " + cavalo.getDeveEmitirSom());
			System.out.println("Deve correr: " + cavalo.getDeveCorrer());
			
			System.out.println();
			
			System.out.println("Animal: Preguiça ");
			preguica.setNome("Mel");
			preguica.setIdade("20");
			preguica.setDeveEmitirSom(" Ronco  ");
			preguica.setDeveSubiremArvore("Sobe");
			
			System.out.println("Nome: " + preguica.getNome());
			System.out.println("Idade: " + preguica.getIdade());
			System.out.println("Emite qual  Som?  " + preguica.getDeveEmitirSom());
			System.out.println("Deve Subir em arvore : " + preguica.getDeveSubiremArvore());
			
			
	}

}
