class TesteSimples {

  public void executar() {
       
       Atleta atleta = new Atleta();
       atleta.setNome("Lucas Santos");
       atleta.setIdade(30);

       System.out.println("Nome = " + atleta.getNome());
       System.out.println("Idade = " + atleta.getIdade());

  }

}