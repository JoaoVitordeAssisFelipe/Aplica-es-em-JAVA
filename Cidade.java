  public class Cidade{
    private String nome;
    private String estado;
    private double populacao;
    private PontoTuristico PontoTuristico;
    private Hotel hotel;

  public Cidade(String nome,String estado,double populaca){
    this.nome= nome;
    this.estado=estado;
    this.populacao = populacao;
  }
  public void setNome(String nome){
       this.nome=nome;
    }
  public String getNome(){
    return this.nome;
  }

  public void setEstado(String estado){
    this.estado=estado;
  }
  public String getEstado(){
    return this.estado;
  }

  public void setPopulcao(double populacao){
    this.populacao=populacao;
  }
  public double getPopulacao(){
    return this.populacao;
  }
  public void setPontoTuristico(PontoTuristico PontoTuristico){
    this.PontoTuristico = PontoTuristico;
  }

  public PontoTuristico getPontoTuristico(){
    return this.PontoTuristico;
    }

  public void setHotel(Hotel hotel){
      this.hotel=hotel;
  }
  public Hotel getHotel(){
    return this.hotel;
  }
}
