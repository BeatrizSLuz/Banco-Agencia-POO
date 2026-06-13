public class Pessoa {

    private String nome;
    private String dataNasc;
    

    //metodos getters
    public String getNome(){
        return this.nome;
    }

    public String getDataNasc(){
        return this.dataNasc;
    }

    
    //metodos setters
    public void setNome(String nome){
        this.nome = nome;
    }

   public void setDataNasc(String dataNasc){
        this.dataNasc = dataNasc;
    }
}