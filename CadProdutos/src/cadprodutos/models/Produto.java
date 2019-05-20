package cadprodutos.models;

public class Produto 
{
    private int Codigo;
    private String Nome;
    private Double Valor;
    private TipoProduto Tipo;

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public Double getValor() {
        return Valor;
    }

    public void setValor(Double Valor) {
        this.Valor = Valor;
    }

    public TipoProduto getTipo() {
        return Tipo;
    }

    public void setTipo(TipoProduto Tipo) {
        this.Tipo = Tipo;
    }

   
    
    
}
