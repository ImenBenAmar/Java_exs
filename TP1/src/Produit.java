public class Produit {
    private String Lib;
    private String design;
    private int NumProd;
    private float prixProd;
    public String getLib() {
        return Lib;
    }
    public Produit(String lib, String design, int numProd, float prixProd) {
        Lib = lib;
        this.design = design;
        NumProd = numProd;
        this.prixProd = prixProd;
    }
    public void setLib(String lib) {
        Lib = lib;
    }
    @Override
    public String toString() {
        return "Produit [Lib=" + Lib + ", design=" + design + ", NumProd=" + NumProd + ", prixProd=" + prixProd + "]";
    }
    public String getDesign() {
        return design;
    }
    public void setDesign(String design) {
        this.design = design;
    }
    public int getNumProd() {
        return NumProd;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((Lib == null) ? 0 : Lib.hashCode());
        result = prime * result + ((design == null) ? 0 : design.hashCode());
        result = prime * result + NumProd;
        result = prime * result + Float.floatToIntBits(prixProd);
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produit other = (Produit) obj;
        if (Lib == null) {
            if (other.Lib != null)
                return false;
        } else if (!Lib.equals(other.Lib))
            return false;
        if (design == null) {
            if (other.design != null)
                return false;
        } else if (!design.equals(other.design))
            return false;
        if (NumProd != other.NumProd)
            return false;
        if (Float.floatToIntBits(prixProd) != Float.floatToIntBits(other.prixProd))
            return false;
        return true;
    }
    public void setNumProd(int numProd) {
        NumProd = numProd;
    }
    public float getPrixProd() {
        return prixProd;
    }
    public void setPrixProd(float prixProd) {
        this.prixProd = prixProd;
    }
    

}
