public class AgendaSemanal {
    private CadaDia[] dias;

    private int mes;
    private int semana;

    public AgendaSemanal(int mes, int semana) {
        dias = new CadaDia[5];
        this.mes = mes;
        this.semana = semana;
    }

    public int getMes() {
        return mes;
    }

    public int getSemana() {
        return semana;
    }

    public void criarNova() {
        
    }

    public void salvar(){

    }
}