public class Test {

    public static void main(String[] args){

     Composite motherboard = new Composite("motherboard");

     Component mouse = new Leaf("mouse", 10);
     Component keyboard = new Leaf("Keyboard", 20);

    motherboard.addComponent(mouse);
    motherboard.addComponent(keyboard);

    Component ram = new Leaf("Ram", 500);

    Composite cabinet = new Composite("Cabinet");

    cabinet.addComponent(ram);
    cabinet.addComponent(motherboard);

    cabinet.showPrice();
  int  toatl = cabinet.getPrice();
        System.out.println("Total Price:" + toatl);



    }

}
