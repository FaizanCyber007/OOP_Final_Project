public class Inventory {
    final int NUM=50;
    private Material[] materials=new Material[NUM];





    public void display(){
        StringBuilder str=new StringBuilder();
        for(int i=0;i<materials.length;i++)
            if(materials[i]!=null)
                str.append(materials[i]+"\n");
        System.out.println("----Available Materials----");
        System.out.println(str.toString());
    }






    public Inventory(){}
    public Material[] getMaterials() {
        return materials;
    }

    public void setMaterials(Material[] materials) {
        this.materials = materials;
    }

}
