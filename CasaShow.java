public class CasaShow extends PontoTuristico{

  private String horario;

  public CasaShow(String nome,String endereco,String horario){
    super(nome,endereco);
    this.horario=horario;
  }
  public void setHorario(String horario){
    this.horario = horario;
  }
  public String getHorario(){
    return this.horario;
  }
}
