import java.util.ArrayList;
import java.util.List;

interface Component{
    void showPrice();
    int getPrice();
}


class Leaf implements Component{
  int price;
  String name;


    public Leaf(String newName, int newPrice){
      this.name = newName;
      this.price = newPrice;

  }

    public void showPrice() {
        System.out.println("Name: "+ name + "Price: "+ price);
    }

    public int getPrice(){return price;}

}


public class Composite implements Component {

    String name;

    public Composite(String newName){
         this.name = newName;

    }

    List<Component> list = new ArrayList<>();

    public void addComponent(Component com){
        list.add(com);

    }

    @Override
    public void showPrice() {
        System.out.println(name);
        //price
        for(Component e: list){
            e.showPrice();

        }
    }

    int total = 0;
    public int getPrice() {
        for(Component e :list){

            total += e.getPrice();
        }
        return total;
    }


}
