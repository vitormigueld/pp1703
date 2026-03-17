public class Questao {
    private String id;
    private String enunciado;
    private short pontos;

    public Questao(String enunciado, short pontos, String id) {
        this.enunciado = enunciado;
        this.pontos = pontos;
        this.id = id;
    }
    public Questao copiar(){
        return new Questao(
                this.enunciado,
                this.pontos,
                this.id
        );
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public void setPontos(short pontos) {
        this.pontos = pontos;
    }

    public short getPontos() {
        return pontos;
    }

    public String getId() {
        return id;
    }

    public String getEnunciado() {
        return enunciado;
    }

    @Override
    public String toString(){
        return "Questão " + id
                +" (" + pontos +")"
                +"\n" + enunciado;
    }
}
