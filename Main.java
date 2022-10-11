class Main {
  public static void main(String[] args) {
    //Cliente
    Cliente cliente1 = new Cliente ("Pedro","797.830.870-70");
    Cliente cliente2 = new Cliente("José","271.687.840-48");
    Cliente cliente3 = new Cliente("Marcia","404.284.630-02");

   
  //Hotel
    Hotel hotel1 = new Hotel ("5 estrela");
    Hotel hotel2 = new Hotel ("4 estrela");
    Hotel hotel3 = new Hotel ("3 estrela");
    Hotel hotel4 = new Hotel ("2 estrela");
    Hotel hotel5 = new Hotel ("1 estrela");

    //Ponto Turistico
    PontoTuristico ponto1 = new PontoTuristico("Museu","Avenida Rosel 253");
    PontoTuristico ponto2 = new PontoTuristico("Parque Ware","Rua Kaik 985");
    PontoTuristico ponto3 = new PontoTuristico("Ponte Grood","Avenida Getulio 620");
   
    //Casa de Show
    CasaShow show1 = new CasaShow("Baladinha W3","Rua Daniel 1015","18:30");
    CasaShow show2 = new CasaShow("How Mulsic","Avenida José","19:30");
    CasaShow show3 = new CasaShow("POO","Roosevelt","20:30");

    //Igreja
    Igreja igreja1 = new Igreja("1998-05-20","Guardalupe","Rua Rosa 15");
    Igreja igreja2= new Igreja("1994-02-28","Assembleia de Deus","Rua Jardim 1501");
    Igreja igreja3 = new Igreja("2001-04-12","João Batista","Rua Flores 201");
   
    //Cidade 
    Cidade cidade1 = new Cidade("Pirapora","Minas Gerais",53000);
    Cidade cidade2 = new Cidade("Ubelândia","Minas Gerais",700000);
    Cidade cidade3 = new Cidade("Ribeirão Preto","São Paulo",711825);

    //Museu
    Museu Museu1 = new Museu("Museu Municipal","Rua Praça",22);
    Museu Museu2 = new Museu("Museu Histórico","Av.Sarandi",66);
    Museu Museu3 = new Museu("Museu Estadual","Av.Paes Lemes",96);
    Museu Museu4 = new Museu("Museu Geográfico","Av.Luis Fernando",20);

    cidade1.setPontoTuristico(show1);
    //Reserva 
    
    Reserva reserva = new Reserva(cliente1,cidade1,2000.0);
    System.out.println("Cliente: " + reserva.getCliente().getNome());
          
  }
}
