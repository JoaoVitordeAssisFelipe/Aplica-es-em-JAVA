public class Reserva{
  private Cliente cliente;
  private Cidade cidade;
  private double preco;

  public Reserva(Cliente cliente,Cidade cidade, double preco){
    //João, o problema era que não tinha this.Cliente = cliente no construtor, nem this.cidade = cidade; Arcrescentei
    this.cliente = cliente;
    this.cidade = cidade;
    this.preco=preco;
  }
  public Cliente getCliente(){
    return this.cliente;
  }
  public void setCidade(Cidade cidade){
    this.cidade = cidade;
  }
  public Cidade getCidade(){
    return this.cidade;
  }
  public void setPreco(double preco){
    this.preco = preco;
  }
  public double getPreco(){
    return this.preco;
  }
  
  
}
