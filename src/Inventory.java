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

    public void addMaterial(Material m) {
        for(int i=0; i<materials.length; i++) {
            if(materials[i] == null) {
                materials[i] = m;
                break;
            }
        }
    }
    public void removeMaterialByName(String name) {
        for(int i=0; i<materials.length; i++) {
            if(materials[i] != null && materials[i].getName() == name) {
                materials[i] = null;
                break;
            }
        }
    }
    public Material serchByName(String name) {
        Material temp=null;
        for(int i=0; i< materials.length; i++) {
            if(materials[i] != null  &&  materials[i].getName() == name) {
                temp = materials[i];
                break;
            }
        }
        return temp;
    }
    public Inventory(){}
    public Material[] getMaterials() {
        return materials;
    }

    public void setMaterials(Material[] materials) {
        this.materials = materials;
    }

}
