import java.awt.font.TextHitInfo;

public class Thing {
    private String name;
    private int weight;

    public Thing(String name, int weight){
        if (weight < 0){
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.weight = weight;

    }
    public Thing(String name){
        this(name, 0);
    }

    public String getName(){
        return name;
    }

    public int getWeight(){
        return weight;
    }

    @Override
    public int hashCode(){
      int hash = 7;
      hash = 41*hash + (this.name != null ? this.name.hashCode() : 0);
      return hash;
    }

    @Override
    public boolean equals(Object object){
        if (object == null){
            return false;
        }
        if (getClass() != object.getClass()){
            return false;
        }
        final Thing other = (Thing) object;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)){
            return false;
        }
        return true;
    }

}
