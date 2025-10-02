class Monyet extends Hewan{
    public Monyet(String nama){
        super(nama);
    }
    
    
    public void suara(){
        System.out.println(nama + " si Monyet: uuaa uuaa...");
    }

    public void memanjatPohon(){
        System.out.println(nama + " sedang memanjat pohon pisang");
    }
}