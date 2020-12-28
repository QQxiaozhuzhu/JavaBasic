package JavaBasic.Chapter_1_Intro.OOP.OOPShapes;

public class Rectangle {
   private int height;
   private int weight;

   public Rectangle(int h, int w) {
       //same name as the Class
       //have no return type
       System.out.println("Rectangle created");
       if (h > 0) {
           this.height = h;
       }
       if (w > 0) {
           this.weight = w;
       }
   }

   public void setHeight(int height){
       this.height = height;
   }
   public void setWeight(int weight){
       this.weight = weight;
   }
   public int getHeight(){
       return this.height;
   }
   public  int getWeight(){
       return this.weight;
   }

    public void printArea(){
        System.out.println(this.height * this.weight);
    }

}
