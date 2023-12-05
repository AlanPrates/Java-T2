import java.util.Date;

public class Sessao {
    public Sessao(Usuario _usuario) {
        this.usuario = _usuario;
        this.dataHoraInicio = new Date();
        this.dataHoraFim = null;
    }
    private Usuario usuario;
    private Date dataHoraInicio;
    private Date dataHoraFim;
    public Date getDataHoraInicio() {
        return dataHoraInicio;
    }

    public void setDataHoraInicio(Date dataHoraInicio) {
        this.dataHoraInicio = dataHoraInicio;
    }

    public Date getDataHoraFim() {
        return dataHoraFim;
    }

    public void setDataHoraFim(Date dataHoraFim) {
        this.dataHoraFim = dataHoraFim;
    }
}