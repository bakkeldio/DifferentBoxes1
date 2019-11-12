public class Main {
    public static void main(String[] args){
        //Test MaxWeightBox
        System.out.println("Test for MaxWeightBox: ");
        MaxWeightBox coffeeBox = new MaxWeightBox(10);
        coffeeBox.add(new Thing("Coffee", 5));
        coffeeBox.add(new Thing("Milk", 5));
        coffeeBox.add(new Thing("Sugar", 5));

        System.out.println(coffeeBox.isInTheBox(new Thing("Coffee")));
        System.out.println(coffeeBox.isInTheBox(new Thing("Milk")));
        System.out.println(coffeeBox.isInTheBox(new Thing("Sugar")));

        //Test OneThingBox
        /*System.out.println();
        System.out.println("Test fot OneThingBox: ");
        OneThingBox box = new OneThingBox();
        box.add(new Thing("Coffee", 5));
        box.add(new Thing("Milk", 5));

        System.out.println(box.isInTheBox(new Thing("Coffee")));
        System.out.println(box.isInTheBox(new Thing("Milk")));

        //Test for BlackHoleBox

         */
        System.out.println();

        System.out.println("Tes fot BlackHoleBox: ");

        BlackHoleBox box = new BlackHoleBox();
        box.add(new Thing("Coffee", 5));
        box.add(new Thing("Milk", 5));

        System.out.println(box.isInTheBox(new Thing("Coffee")));
        System.out.println(box.isInTheBox(new Thing("Milk")));
    }
}
