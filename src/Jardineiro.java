public class Jardineiro {

    private Ferramenta ferramenta;

    public Jardineiro (Ferramenta ferramenta){

       this.ferramenta = ferramenta;

    }

    public String limparJardim(){

        return this.ferramenta.iniciar();

    }

}
