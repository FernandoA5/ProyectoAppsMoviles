package azoftware.com.whatsappro;

public class ListElement {
    public String fecha;
    public String fechaInicial;
    public String fechaFinal;
    public String estado;
    public Float intensidadUV;
    public Float Humedad;
    public Float Presion;
    public Float Temperatura;

    public ListElement(String fecha, String fechaInicial, String fechaFinal, String estado, Float intensidadUV, Float humedad, Float presion, Float temperatura) {
        this.fecha = fecha;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.estado = estado;
        this.intensidadUV = intensidadUV;
        Humedad = humedad;
        Presion = presion;
        Temperatura = temperatura;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(String fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Float getIntensidadUV() {
        return intensidadUV;
    }

    public void setIntensidadUV(Float intensidadUV) {
        this.intensidadUV = intensidadUV;
    }

    public Float getHumedad() {
        return Humedad;
    }

    public void setHumedad(Float humedad) {
        Humedad = humedad;
    }

    public Float getPresion() {
        return Presion;
    }

    public void setPresion(Float presion) {
        Presion = presion;
    }

    public Float getTemperatura() {
        return Temperatura;
    }

    public void setTemperatura(Float temperatura) {
        Temperatura = temperatura;
    }
}

