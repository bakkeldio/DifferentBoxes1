import java.util.ArrayList;
import java.util.List;

public class MaxWeightBox extends Box {
    public int maxWeight;
    private List<Thing> box;

    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
        this.box = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
        int totalWeight = 0;
        for (Thing thingInBox : this.box) {
            totalWeight += thingInBox.getWeight();
        }
        if (totalWeight + thing.getWeight() <= this.maxWeight) {
            this.box.add(thing);
        }
    }


    @Override
    public boolean isInTheBox(Thing thing) {
        return box.contains(thing);
    }
}
