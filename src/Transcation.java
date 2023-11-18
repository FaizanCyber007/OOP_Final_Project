public class Transcation {
    private String transactionID;
    private String type;
   private Date date;
   private Item[] items;



   //Methods
   public void processTransaction(){

   }
   public double calculateValue(){
      double total=0;
      for(int i=0;i<items.length;i++){
         if(items[i]!=null)
            total+=items[i].getWeight()*items[i].getRate();


      }
      return total;
   }

   public void display(){
      StringBuilder str=new StringBuilder();
      for(int i=0;i<items.length;i++)
         if(items[i]!=null)
            str.append(items[i]+"\n");

      System.out.println("----History of sold Items----");
      System.out.println(str.toString());
   }
//Methods to handle items.
   public double calculateTotalValue() {
      double total = 0;
      for (int i = 0; i < items.length; i++) {
         if (items[i] != null)
            total += items[i].getWeight() * items[i].getRate();
      }
      return total;
   }

   public void addItem(Item t) {
      for (int i = 0; i < items.length; i++) {
         if (items[i] == null)
            items[i] = t;
         System.out.println("----Item added successfully----");
         break;
      }
   }

   public void removeItem(Item t) {
      for (int i = 0; i < items.length; i++) {
         if (items[i] == t) {
            items[i] = null;
            System.out.println("----Item Removed successfully");
            break;
         }
      }
   }

   public Item searchItemByID(String id) {
      Item temp = null;
      for (int i = 0; i < items.length; i++)
         if (items[i] != null && items[i].getID() == id) {
            temp = items[i];
            break;
         }

      return temp;
   }

   public void searchByType(String type) {
      StringBuilder str = new StringBuilder();
      for (int i = 0; i < items.length; i++)
         if (items[i] != null && items[i].getType() == type)
            str.append(items[i].toString() + "\n");
      System.out.println("----Items with Type \""+type+"\"----");
      System.out.println(str.toString());

   }
   public void updateItem(String id,Item t){
      for(int i=0;i<items.length;i++)
         if(items[i]!=null&&items[i].getID()==id) {
            items[i] = t;
            System.out.println("----Item Updated successfully----");
            break;
         }

   }










   public Transcation(String id,String type,Date date){
      setTransactionID(id);
      setType(type);
      setDate(date);

   }
   public Date getDate() {
      return date;
   }

   public String getType() {
      return type;
   }

   public void setType(String type) {
      this.type = type;
   }

   public Item[] getItems() {
      return items;
   }

   public String getTransactionID() {
      return transactionID;
   }

   public void setDate(Date date) {
      this.date = date;
   }

   public void setItems(Item[] items) {
      this.items = items;
   }

   public void setTransactionID(String transactionID) {
      this.transactionID = transactionID;
   }







}
