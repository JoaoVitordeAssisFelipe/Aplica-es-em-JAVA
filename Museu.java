public class Museu extends PontoTuristico{
  private int NumSala;

  public Museu(String nome,String endereco, int NumSala){
    super(nome,endereco);
    this.NumSala = NumSala; 
  }

  public void setNumsala(int NumSala){
    this.NumSala = NumSala;
  }

  public int getNumSala(){
    return this.NumSala;
  }
  
}
