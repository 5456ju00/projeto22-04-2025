public class Agendamento {

    private String dataEntrada;
    private String horarioEntrada;
    private String dataSaida;
    private String horarioSaida;


    public String getDataEntrada() {
        return dataEntrada;
    } 



    public void setDataEntrada(String dataEntrada) {
        
        if ( dataEntrada.equals("21/04/2025") && dataEntrada.equals("25/12/2025") ) {
            System.out.println("Feriado de Tiradentes ou natal");
        } else {
            this.dataEntrada = dataEntrada;
        }
    }


    public String getHorarioEntrada() {
        return horarioEntrada;
    } 


    
    public void setHorarioEntrada(String horarioEntrada) {
        this.horarioEntrada = horarioEntrada;
            
        if ( horarioEntrada.equals("21/04/2025") && horarioEntrada.equals("25/12/2025") ) {
            System.out.println("Estaremos disponíveis a partir das 8h");
        } else {
            this.horarioEntrada = horarioEntrada;
        }
    }



    public String getDataSaida() {
        return dataSaida;
    } 


    
    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    
        if ( dataSaida.equals("21/04/2025") && dataSaida.equals("25/12/2025") ) {
            System.out.println("Feriado de Tiradentes ou natal");
        } else {
            this.dataSaida = dataSaida;
        }
            
    }



    public String getHorarioSaida() {
        return horarioSaida;
    } 


    
    public void setHorarioSaida(String horarioSaida) {
        this.horarioSaida = horarioSaida;
            
        if ( dataSaida.equals("18:00 horas") ) {
            System.out.println("Horário de funcionamento somente até às 18:00");
        } else {
            this.horarioSaida = horarioSaida;
        }
    }

}