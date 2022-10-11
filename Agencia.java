public class Agencia{
  private String nome;
  private String endereco;
  private Reserva reserva;

  public Agencia(String nome,String endereco,Reserva reserva){
    this.nome=nome;
    this.endereco=endereco;
    this.reserva = reserva;
  }

  public void setNome(String nome){
    this.nome=nome;
  }
  public String getNome(){
    return this.nome;
  }

  public void setEndereco(String endereco){
    this.endereco = endereco;
  }
  public String getEndereco(){
    return this.endereco;
  }

  public void setReserva(Reserva reserva){
    this.reserva=reserva;
  }
  public Reserva getReserva(){
    return this.reserva;
  }
}
