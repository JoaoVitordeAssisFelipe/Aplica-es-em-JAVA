public class Igreja extends PontoTuristico{
  private String DataFundacao;

  public Igreja(String DataFundacao,String nome,String endereco)
  {
    super(nome,endereco);
    this.DataFundacao =DataFundacao;
  }
  public void setDataFundacao(String DataFundacao){
    this.DataFundacao = DataFundacao;
  }
  public String getDataFundacao(){
    return this.DataFundacao;
  }
}
