public class PontoTuristico {
  private String nome;
  private String endereco;

  public PontoTuristico(String nome,String endereco){
    this.nome =nome;
    this.endereco=endereco;
  }

  public void setNome(String nome){
    this.nome=nome;
  }
  public String getNome(){
    return this.nome;
  }
  public void setEndereco(String endereco){
    this.endereco=endereco;
  }
  public String getEndereco(){
    return this.endereco;
  }
}
